package com.deloitte.sample.integration.demo.publisher.transformation.builder.impl;

import com.deloitte.sample.integration.demo.publisher.constant.TradeMappingConstants;
import com.deloitte.sample.integration.demo.publisher.transformation.builder.FIXMLBuilder;
import com.deloitte.sample.integration.demo.publisher.transformation.fixml.*;

import com.deloitte.sample.integration.demo.util.DomElementUtility;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import java.io.IOException;
import java.util.List;

public class InstrumentExtensionBlockTFIXMLBuilder implements FIXMLBuilder {
  private  TradeCaptureReportMessageT tradeCaptureReportMessageT;
  /**
   * Constructor to populate the staright forward field mappings. This includes the mappings of
   * dimple data type like String, Integer etc
   *
   * @param tradeCaptureReportMessageT
   */
  public InstrumentExtensionBlockTFIXMLBuilder(
      TradeCaptureReportMessageT tradeCaptureReportMessageT) {
  this.tradeCaptureReportMessageT= tradeCaptureReportMessageT;
  }

  public TradeCaptureReportMessageT build(
      DOMSource domSource)
      throws Exception {

    this.tradeCaptureReportMessageT.setInstrmtExt(
        buildInstrumentExtensionBlockT(domSource));
    return this.tradeCaptureReportMessageT;
  }

  @Override
  public FIXML build() throws Exception {
    return null;
  }

  public InstrumentExtensionBlockT buildInstrumentExtensionBlockT(
      final DOMSource tradeDomSource
     )
      throws Exception {

    InstrumentExtensionBlockT instrumentExtensionBlockT = new InstrumentExtensionBlockT();

    List<AttrbGrpBlockT> attributes = instrumentExtensionBlockT.getAttrb();
    addIntrumentExtAttributes(attributes, tradeDomSource);

    return instrumentExtensionBlockT;
  }

  protected void addIntrumentExtAttributes(
          List<AttrbGrpBlockT> attributes,
          final DOMSource tradeDomSource) {

    Element element = (Element) tradeDomSource.getNode();
    DomElementUtility utility = new DomElementUtility(element);
    // Adding the follwoing mappings
    // From 102 to TrdCaptRpt/InstrmtExt/Attrb/@Type
    // From Trade XML TRANSACTIONS/TRADE/TRD_DURATION to TrdCaptRpt/InstrmtExt/Attrb/@Val
    addAttrbGrpBlockT(
        attributes, "102", utility.getElementContentAsString(TradeMappingConstants.TRD_DURATION));

    // Adding the follwoing mappings
    // From 105 to TrdCaptRpt/InstrmtExt/Attrb/@Type
    // From Trade XML TRANSACTIONS/TRADE/TRD_DIRTY_PRICE to TrdCaptRpt/InstrmtExt/Attrb/@Val
    addAttrbGrpBlockT(
        attributes,
        "105",
        utility.getElementContentAsString(TradeMappingConstants.TRD_DIRTY_PRICE));


}



  protected final void addAttrbGrpBlockT(
      List<AttrbGrpBlockT> attributes, String type, String value) {

    AttrbGrpBlockT attrbGrpBlockT = null;
    if (type != null && !type.isEmpty() && value != null && !value.isEmpty()) {
      attrbGrpBlockT = new AttrbGrpBlockT();

      attrbGrpBlockT.setTyp(type);
      attrbGrpBlockT.setVal(value);

      attributes.add(attrbGrpBlockT);
    }
  }
}
