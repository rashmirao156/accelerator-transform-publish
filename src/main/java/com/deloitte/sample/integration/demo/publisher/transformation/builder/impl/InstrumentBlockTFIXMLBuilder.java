package com.deloitte.sample.integration.demo.publisher.transformation.builder.impl;

import com.deloitte.sample.integration.demo.publisher.constant.TradeMappingConstants;
import com.deloitte.sample.integration.demo.publisher.transformation.builder.FIXMLBuilder;
import com.deloitte.sample.integration.demo.publisher.transformation.fixml.*;
import com.deloitte.sample.integration.demo.util.DomElementUtility;
import org.w3c.dom.Element;

import javax.xml.transform.dom.DOMSource;
import java.math.BigDecimal;
import java.util.List;

/** Holds steps populate TrdCaptRpt/Instrmt */
public class InstrumentBlockTFIXMLBuilder implements FIXMLBuilder {

  private TradeCaptureReportMessageT tradeCaptureReportMessageT;

  /**
   * Constructor to populate the straight forward field mappings. This includes the mappings of
   * simple data type like String, Integer etc
   *
   * @param tradeCaptureReportMessageT
   */
  public InstrumentBlockTFIXMLBuilder(TradeCaptureReportMessageT tradeCaptureReportMessageT) {
    this.tradeCaptureReportMessageT = tradeCaptureReportMessageT;
  }

  /**
   * Method to buildTradeCaptureReportMessageT TrdCaptRpt/Instrmt and sub elements
   *
   * @param tradeDomSource
   * @return
   */
  public InstrumentBlockT buildInstrumentBlockT(final DOMSource tradeDomSource) throws Exception {

    Element element = (Element) tradeDomSource.getNode();
    DomElementUtility utility = new DomElementUtility(element);

    // Adding null check for CUSIP - Instrument Id.
    String instrumentId = utility.getElementContentAsString(TradeMappingConstants.INSTRMTID);
    if (instrumentId == null || instrumentId.isEmpty()) {
      return null;
    }

    // Mapping direct values for TrdCaptRpt/Instrmt
    // Trade XML File TRANSACTIONS/TRADE/CUSIP	to TrdCaptRpt/Instrmt/@ID
    // Trade XML File TRANSACTIONS/TRADE/SM_CURRENCY to TrdCaptRpt/Instrmt/@PxQteCcy
    // Trade XML File TRANSACTIONS/TRADE/TICKER	to TrdCaptRpt/Instrmt/@Sym
    // Trade XML File TRANSACTIONS/TRADE/TRD_FACTOR	TrdCaptRpt/Instrmt/@Fctr
    InstrumentBlockT instrumentBlockT = new InstrumentBlockT();
    instrumentBlockT.setID(utility.getElementContentAsString(TradeMappingConstants.INSTRMTID));
    instrumentBlockT.setPxQteCcy(utility.getElementContentAsString(TradeMappingConstants.SMCURRENCY));
    instrumentBlockT.setSym(utility.getElementContentAsString(TradeMappingConstants.TICKER));
    // Mapping from "U" to TrdCaptRpt/Instrmt/@Src
    instrumentBlockT.setSrc("U");

    // Mapping from //ISIN to TrdCaptRpt/Instrmt/AID
    addAID(
        utility.getElementContentAsString(TradeMappingConstants.ISIN),
        "4",
        instrumentBlockT.getAID());

    // Mapping from //SEDOL to TrdCaptRpt/Instrmt/AID
    addAID(
        utility.getElementContentAsString(TradeMappingConstants.SEDOL),
        "2",
        instrumentBlockT.getAID());

    // Mapping from //QUIK to TrdCaptRpt/Instrmt/AID
    addAID(
        utility.getElementContentAsString(TradeMappingConstants.QUIK),
        "3",
        instrumentBlockT.getAID());

    /*
         IF CFD_FLAG = 'Y'
         THEN direct map value from SM_SEC_GROUP
         ELSE direct map value from SM_SEC_TYPE
    */
    String cfdFlag = utility.getElementContentAsString(TradeMappingConstants.CFDFLAG);

    if (cfdFlag != null && cfdFlag.equals("Y")) {
      instrumentBlockT.setSecTyp(
          utility.getElementContentAsString(TradeMappingConstants.INSTRMTSECGRP));
    } else {
      instrumentBlockT.setSecTyp(
          utility.getElementContentAsString(TradeMappingConstants.INSTRMTSECTYP));
    }

    /*
       IF CFD_FLAG = 'Y'
       THEN default to 'CFD'
       ELSE direct map value from SM_SEC_GROUP
    */
    if (cfdFlag != null && cfdFlag.equals("Y")) {
      instrumentBlockT.setSecGrp("CFD");
    } else {
      instrumentBlockT.setSecGrp(
          utility.getElementContentAsString(TradeMappingConstants.INSTRMTSECGRP));
    }

    // Adding mappings from Trade XML File TRANSACTIONS/TRADE/TRD_COUPON TrdCaptRpt/Instrmt/@CpnRt
    instrumentBlockT.setCpnRt(
        utility.getElementContentAsBigDecimal(TradeMappingConstants.TRD_COUPON));

    String couponRateStr = utility.getElementContentAsString(TradeMappingConstants.TRD_COUPON);
    if (couponRateStr != null && !couponRateStr.isEmpty()) {
      instrumentBlockT.setCpnRt(new BigDecimal(couponRateStr));
    }

    return instrumentBlockT;
  }

  /**
   * Populate TrdCaptRpt/Instrmt from Securities (ASSET)
   *
   * @param securityDomSource
   * @param instrumentBlockT
   * @param issuerDOMSource
   */
  private void buildInstrumentBlockT(
      final DOMSource securityDomSource,
      final DOMSource issuerDOMSource,
      InstrumentBlockT instrumentBlockT) {

    // Mapping from sm XML File ASSETS/ASSET/ANNOUNCE_DT to
    // TrdCaptRpt/Instrmt/StreamGrp/PmtStrm/NonDlvrblTrms/FixngDt/@dt
    StreamGrpBlockT streamGrpBlockT = new StreamGrpBlockT();
    instrumentBlockT.getStrm().add(streamGrpBlockT);
    PaymentStreamBlockT paymentStreamBlockT = new PaymentStreamBlockT();
    PaymentStreamNonDeliverableSettlTermsBlockT paymentStreamNonDeliverableSettlTermsBlockT =
        new PaymentStreamNonDeliverableSettlTermsBlockT();
    PaymentStreamNonDeliverableFixingDateGrpBlockT paymentStreamNonDeliverableFixingDateGrpBlockT =
        new PaymentStreamNonDeliverableFixingDateGrpBlockT();
    paymentStreamNonDeliverableSettlTermsBlockT.setFixngDt(
        paymentStreamNonDeliverableFixingDateGrpBlockT);

    paymentStreamBlockT.setNonDlvrblTrms(paymentStreamNonDeliverableSettlTermsBlockT);
    streamGrpBlockT.setPmtStrm(paymentStreamBlockT);
  }

  private final void addAID(String id, String idSrc, List<SecAltIDGrpBlockT> aids) {

    if (id != null && !id.isEmpty() && idSrc != null && !idSrc.isEmpty()) {

      SecAltIDGrpBlockT secAltIDGrpBlockT = new SecAltIDGrpBlockT();
      secAltIDGrpBlockT.setAltID(id);
      secAltIDGrpBlockT.setAltIDSrc(idSrc);
      aids.add(secAltIDGrpBlockT);
    }
  }

  public TradeCaptureReportMessageT build(DOMSource domSource) throws Exception {
    this.tradeCaptureReportMessageT.setInstrmt(buildInstrumentBlockT(domSource));
    return this.tradeCaptureReportMessageT;
  }

  @Override
  public FIXML build() throws Exception {
    return null;
  }
}
