package com.deloitte.sample.integration.demo.publisher.transformation.builder.impl;

import com.deloitte.sample.integration.demo.publisher.constant.TradeMappingConstants;
import com.deloitte.sample.integration.demo.publisher.transformation.builder.FIXMLBuilder;
import com.deloitte.sample.integration.demo.publisher.transformation.fixml.*;
import com.deloitte.sample.integration.demo.util.DomElementUtility;
import com.deloitte.sample.integration.demo.util.TimeConverterUtility;
import org.springframework.xml.xpath.Jaxp13XPathTemplate;
import org.springframework.xml.xpath.XPathOperations;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.transform.dom.DOMSource;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TradeCaptureReportMessageTFIXMLBuilder implements FIXMLBuilder {
  private TradeCaptureReportMessageT tradeCaptureReportMessageT;

  protected XPathOperations template = new Jaxp13XPathTemplate();

  public TradeCaptureReportMessageTFIXMLBuilder(
      TradeCaptureReportMessageT tradeCaptureReportMessageT) {
    this.tradeCaptureReportMessageT = tradeCaptureReportMessageT;
  }

  public TradeCaptureReportMessageT build(final DOMSource domSource) throws Exception {
    Node node = domSource.getNode();
    Element element = null;
    if (node instanceof Document) {
      Document document = (Document) node;
      element = document.getDocumentElement();
    } else if(node instanceof  Element) {
      element = (Element) node;
    } else {
      return null;
    }


    DomElementUtility utility = new DomElementUtility(element);

    // Adding Mapping from Trade XML File TRANSACTIONS/TRADE/TRD_STATUS TrdCaptRpt/@TransTyp
    tradeCaptureReportMessageT.setTransTyp(getTransType(utility));


    // Mapping from TRD_PRICING_SPREAD to TrdCaptRpt/SprdBnchmkCurveData/@Spread
    SpreadOrBenchmarkCurveDataBlockT spreadOrBenchmarkCurveDataBlockT =
            new SpreadOrBenchmarkCurveDataBlockT();
    tradeCaptureReportMessageT.setSprdBnchmkCurve(spreadOrBenchmarkCurveDataBlockT);



    // Adding mapping from Trade XML File TRANSACTIONS/TRADE/TRD_SETTLE_TEMPLATE_NAME  to
    // TrdCapRpt/@SettlTyp
    tradeCaptureReportMessageT.setSettlTyp(
            template.evaluateAsString(TradeMappingConstants.TRD_SETTLE_TEMPLATE_NAME, domSource));


    // Setting the sub-elements
    tradeCaptureReportMessageT.getAmt().addAll(buildPositionAmountDataBlockT(domSource, utility));
    tradeCaptureReportMessageT.setInstrmtExt(buildInstrumentExtensionBlockT(utility));
    tradeCaptureReportMessageT.setYield(buildYieldDataBlockT(utility));
    return tradeCaptureReportMessageT;
  }

  private BigInteger getTransType(DomElementUtility utility) {

    BigInteger transType = null;

    String transTypeStr = utility.getElementContentAsString(TradeMappingConstants.TRANSTYP);

    // Removed populating statuses other than Cancel(C) as part of fixing GPSTST-325
    if (null != transTypeStr && transTypeStr.equals("C")) {
      transType = BigInteger.ONE;
    }

    return transType;
  }


  /**
   * Method to buildTradeCaptureReportMessageT TrdCapRpt/InstrmtExt element
   *
   * @param utility
   * @return
   */
  private InstrumentExtensionBlockT buildInstrumentExtensionBlockT(
          final DomElementUtility utility) {
    InstrumentExtensionBlockT instrumentExtensionBlockT = null;
    String value = utility.getElementContentAsString(TradeMappingConstants.TRDFINANCINGRATE);
    if (value != null && !value.isEmpty()) {
      instrumentExtensionBlockT = new InstrumentExtensionBlockT();
      AttrbGrpBlockT attrbGrpBlockT = new AttrbGrpBlockT();
      attrbGrpBlockT.setVal(
              utility.getElementContentAsString(TradeMappingConstants.TRDFINANCINGRATE));
      attrbGrpBlockT.setTyp("5");
      instrumentExtensionBlockT.getAttrb().add(attrbGrpBlockT);
    }
    return instrumentExtensionBlockT;
  }

  /**
   * Method to populate TrdCaptRpt/RptSide/@AcrdIntAmt and sub elements
   *
   * @param domSource
   * @return
   */
  protected List<PositionAmountDataBlockT> buildPositionAmountDataBlockT(
          final DOMSource domSource, DomElementUtility utility) throws Exception {

    // Populate the direct mappings for TrdCaptRpt/RptSide/@AcrdIntAmt
    List<PositionAmountDataBlockT> positionAmountDataBlockTs = new ArrayList<>();


    // Mapping from TRD_ORIG_FACE to TrdCaptRpt/Amt/@Amt
    PositionAmountDataBlockT positionAmountDataBlockTTrdOrig = new PositionAmountDataBlockT();
    positionAmountDataBlockTTrdOrig.setAmt(
            utility.getElementContentAsBigDecimal(TradeMappingConstants.TRDORIGFACE));
    positionAmountDataBlockTTrdOrig.setTyp("ORIG");

    if (positionAmountDataBlockTTrdOrig.getTyp() != null
        && positionAmountDataBlockTTrdOrig.getAmt() != null) {
      positionAmountDataBlockTs.add(positionAmountDataBlockTTrdOrig);
    }

    // Mapping from TRD_TD_PAR to TrdCaptRpt/Amt/@Amt
    PositionAmountDataBlockT positionAmountDataBlockTTrdTdPAR = new PositionAmountDataBlockT();
    positionAmountDataBlockTTrdTdPAR.setAmt(
            utility.getElementContentAsBigDecimal(TradeMappingConstants.TRDTDPAR));
    positionAmountDataBlockTTrdTdPAR.setTyp("PAR");
    if (positionAmountDataBlockTTrdTdPAR.getTyp() != null
        && positionAmountDataBlockTTrdTdPAR.getAmt() != null) {
      positionAmountDataBlockTs.add(positionAmountDataBlockTTrdTdPAR);
    }

    tradeCaptureReportMessageT.setTrdNum(
            utility.getElementContentAsInteger(TradeMappingConstants.INVNUM));
    // TODO add Date conversion logic
    tradeCaptureReportMessageT.setTxnTm(
            TimeConverterUtility.getTargetFormat(
                    utility.getElementContentAsString(TradeMappingConstants.EXECUTION_TIME)));
    tradeCaptureReportMessageT.setLastUpdateTm(null);
    tradeCaptureReportMessageT.setTrdDt(null);

    tradeCaptureReportMessageT.setTrdVer(
            utility.getElementContentAsString(TradeMappingConstants.TOUCH_COUNT));
    tradeCaptureReportMessageT.setSettlCcy(
            utility.getElementContentAsString(TradeMappingConstants.TRD_CURRENCY));
    tradeCaptureReportMessageT.setLastPx(
            utility.getElementContentAsBigDecimal(TradeMappingConstants.TRD_PRICE));
    tradeCaptureReportMessageT.setGrossTrdAmt(
            utility.getElementContentAsBigDecimal(TradeMappingConstants.TRD_PRINCIPAL));
    tradeCaptureReportMessageT.setTransTyp(
            utility.getElementContentAsInteger(TradeMappingConstants.TRD_STATUS));


    return positionAmountDataBlockTs;
  }

  /**
   * Method to map TrdCaptRpt/YieldData
   *
   * @param utility
   * @return
   */
  private YieldDataBlockT buildYieldDataBlockT(DomElementUtility utility) {

    YieldDataBlockT yieldDataBlockT = null;

    String currentYIdXPath = TradeMappingConstants.YIELDYLDDISCOUNT;
    String maturityYIdXPath = TradeMappingConstants.YIELDYLD;

    String currentYId = utility.getElementContentAsString(currentYIdXPath);
    String maturityYId = utility.getElementContentAsString(maturityYIdXPath);

    if (currentYId != null && !currentYId.isEmpty()) {
      yieldDataBlockT = new YieldDataBlockT();
      yieldDataBlockT.setYld(new BigDecimal(currentYId));
      yieldDataBlockT.setTyp(YieldTypeEnumT.CURRENT);
    } else if (maturityYId != null && !maturityYId.isEmpty()) {
      yieldDataBlockT = new YieldDataBlockT();
      yieldDataBlockT.setYld(new BigDecimal(maturityYId));
      yieldDataBlockT.setTyp(YieldTypeEnumT.MATURITY);
    }
    return yieldDataBlockT;
  }

  public FIXML build() throws  Exception{
    FIXML fixml = new FIXML();
    fixml.setMessage(getJaxbElement(tradeCaptureReportMessageT));

    return fixml;
  }

  private JAXBElement<? extends AbstractMessageT> getJaxbElement(
      TradeCaptureReportMessageT tradeCaptureReportMessageT) {
    return new JAXBElement(getQName(), AbstractMessageT.class, null, tradeCaptureReportMessageT);
  }

  private static final QName getQName() {
    String namespace = TradeMappingConstants.NAMESPACE;
    return new QName(namespace, "TrdCaptRpt");
  }
}
