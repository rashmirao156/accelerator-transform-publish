package com.deloitte.sample.integration.demo.publisher.transformation.director;

import com.deloitte.sample.integration.demo.publisher.transformation.builder.FIXMLBuilder;
import com.deloitte.sample.integration.demo.publisher.transformation.builder.impl.InstrumentBlockTFIXMLBuilder;
import com.deloitte.sample.integration.demo.publisher.transformation.builder.impl.InstrumentExtensionBlockTFIXMLBuilder;
import com.deloitte.sample.integration.demo.publisher.transformation.builder.impl.TradeCaptureReportMessageTFIXMLBuilder;
import com.deloitte.sample.integration.demo.publisher.transformation.builder.impl.TrdCapRptSideGrpBlockTFIXMLBuilder;
import com.deloitte.sample.integration.demo.publisher.transformation.fixml.FIXML;
import com.deloitte.sample.integration.demo.publisher.transformation.fixml.TradeCaptureReportMessageT;

import javax.xml.transform.dom.DOMSource;

public class FIXMLDirector {
  private FIXMLBuilder tradeCaptRptFixmlBuilder;
  private FIXMLBuilder instrumenFixmlBuilder;
  private FIXMLBuilder instrumentExtFixmlBuilder;
  private FIXMLBuilder rptSideBuilder;
  private TradeCaptureReportMessageT tradeCaptureReportMessageT;
  private DOMSource tradeDomSource;

  public FIXMLDirector(DOMSource tradeDomSource) {
    this.tradeCaptureReportMessageT = new TradeCaptureReportMessageT();
    tradeCaptRptFixmlBuilder =
        new TradeCaptureReportMessageTFIXMLBuilder(tradeCaptureReportMessageT);
    instrumenFixmlBuilder = new InstrumentBlockTFIXMLBuilder(tradeCaptureReportMessageT);
    instrumentExtFixmlBuilder =
        new InstrumentExtensionBlockTFIXMLBuilder(tradeCaptureReportMessageT);
    rptSideBuilder = new TrdCapRptSideGrpBlockTFIXMLBuilder(tradeCaptureReportMessageT);
    this.tradeDomSource = tradeDomSource;
  }

  public FIXML construct() throws Exception {
    tradeCaptRptFixmlBuilder.build(tradeDomSource);
    rptSideBuilder.build(tradeDomSource);
    instrumenFixmlBuilder.build(tradeDomSource);
    instrumentExtFixmlBuilder.build(tradeDomSource);
    return tradeCaptRptFixmlBuilder.build();
  }
}
