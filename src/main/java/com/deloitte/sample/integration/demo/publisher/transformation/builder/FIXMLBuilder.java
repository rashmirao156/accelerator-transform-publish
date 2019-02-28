package com.deloitte.sample.integration.demo.publisher.transformation.builder;

import com.deloitte.sample.integration.demo.publisher.transformation.fixml.FIXML;
import com.deloitte.sample.integration.demo.publisher.transformation.fixml.TradeCaptureReportMessageT;

import javax.xml.transform.dom.DOMSource;

public interface FIXMLBuilder {

  public TradeCaptureReportMessageT build(DOMSource source) throws Exception;
  public FIXML build() throws Exception;
}
