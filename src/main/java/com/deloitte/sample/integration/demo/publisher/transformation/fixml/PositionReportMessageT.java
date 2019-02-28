//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.04 at 04:33:21 PM IST
//

package com.deloitte.sample.integration.demo.publisher.transformation.fixml;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * PositionReport can be found in Volume 5 of the specification
 *
 * <p>Java class for PositionReport_message_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PositionReport_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PositionReportElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PositionReportAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "PositionReport_message_t",
  propOrder = {
    "applSeqCtrl",
    "pty",
    "instrmt",
    "finDetls",
    "leg",
    "reltdInstrmt",
    "collAmt",
    "posUnd",
    "qty",
    "amt",
    "regTrdID",
    "pmt",
    "reltdTrd"
  }
)
public class PositionReportMessageT extends AbstractMessageT {

  @XmlElement(name = "ApplSeqCtrl")
  protected ApplicationSequenceControlBlockT applSeqCtrl;

  @XmlElement(name = "Pty", required = true)
  protected List<PartiesBlockT> pty;

  @XmlElement(name = "Instrmt")
  protected InstrumentBlockT instrmt;

  @XmlElement(name = "FinDetls")
  protected FinancingDetailsBlockT finDetls;

  @XmlElement(name = "Leg")
  protected List<InstrmtLegGrpBlockT> leg;

  @XmlElement(name = "ReltdInstrmt")
  protected List<RelatedInstrumentGrpBlockT> reltdInstrmt;

  @XmlElement(name = "CollAmt")
  protected List<CollateralAmountGrpBlockT> collAmt;

  @XmlElement(name = "PosUnd")
  protected List<PosUndInstrmtGrpBlockT> posUnd;

  @XmlElement(name = "Qty")
  protected List<PositionQtyBlockT> qty;

  @XmlElement(name = "Amt")
  protected List<PositionAmountDataBlockT> amt;

  @XmlElement(name = "RegTrdID")
  protected List<RegulatoryTradeIDGrpBlockT> regTrdID;

  @XmlElement(name = "Pmt")
  protected List<PaymentGrpBlockT> pmt;

  @XmlElement(name = "ReltdTrd")
  protected List<RelatedTradeGrpBlockT> reltdTrd;

  @XmlAttribute(name = "RptID", required = true)
  protected String rptID;

  @XmlAttribute(name = "PosID")
  protected String posID;

  @XmlAttribute(name = "ReqID")
  protected String reqID;

  @XmlAttribute(name = "ReqTyp")
  protected BigInteger reqTyp;

  @XmlAttribute(name = "Actn")
  protected BigInteger actn;

  @XmlAttribute(name = "ID")
  protected String id;

  @XmlAttribute(name = "SubReqTyp")
  protected String subReqTyp;

  @XmlAttribute(name = "TotRpts")
  protected BigInteger totRpts;

  @XmlAttribute(name = "TotNumRpts")
  protected BigInteger totNumRpts;

  @XmlAttribute(name = "LastRptReqed")
  protected LastRptRequestedEnumT lastRptReqed;

  @XmlAttribute(name = "Rslt")
  protected String rslt;

  @XmlAttribute(name = "Unsol")
  protected UnsolicitedIndicatorEnumT unsol;

  @XmlAttribute(name = "BizDt", required = true)
  protected XMLGregorianCalendar bizDt;

  @XmlAttribute(name = "PrevBizDt")
  protected XMLGregorianCalendar prevBizDt;

  @XmlAttribute(name = "SetSesID")
  protected SettlSessIDEnumT setSesID;

  @XmlAttribute(name = "SetSesSub")
  protected String setSesSub;

  @XmlAttribute(name = "PxTyp")
  protected BigInteger pxTyp;

  @XmlAttribute(name = "SettlCcy")
  protected String settlCcy;

  @XmlAttribute(name = "MsgEvtSrc")
  protected String msgEvtSrc;

  @XmlAttribute(name = "Clrd")
  protected BigInteger clrd;

  @XmlAttribute(name = "ConRefPosTyp")
  protected BigInteger conRefPosTyp;

  @XmlAttribute(name = "PosCpcty")
  protected BigInteger posCpcty;

  @XmlAttribute(name = "TrmtdInd")
  protected String trmtdInd;

  @XmlAttribute(name = "IntraFirmTrdInd")
  protected String intraFirmTrdInd;

  @XmlAttribute(name = "TrdContntn")
  protected String trdContntn;

  @XmlAttribute(name = "TrdContntnTxt")
  protected String trdContntnTxt;

  @XmlAttribute(name = "EncTrdContntnTextLen")
  protected BigInteger encTrdContntnTextLen;

  @XmlAttribute(name = "EncTrdContntnText")
  protected byte[] encTrdContntnText;

  @XmlAttribute(name = "TrdCollztn")
  protected BigInteger trdCollztn;

  @XmlAttribute(name = "Acct")
  protected String acct;

  @XmlAttribute(name = "AcctIDSrc")
  protected String acctIDSrc;

  @XmlAttribute(name = "AcctTyp")
  protected BigInteger acctTyp;

  @XmlAttribute(name = "TxnmyTyp")
  protected TaxonomyTypeEnumT txnmyTyp;

  @XmlAttribute(name = "Ccy")
  protected String ccy;

  @XmlAttribute(name = "SettlDt")
  protected XMLGregorianCalendar settlDt;

  @XmlAttribute(name = "SetPx")
  protected BigDecimal setPx;

  @XmlAttribute(name = "SettlPxFxRtCalc")
  protected SettlCurrFxRateCalcEnumT settlPxFxRtCalc;

  @XmlAttribute(name = "SettlFwdPnts")
  protected BigDecimal settlFwdPnts;

  @XmlAttribute(name = "SetPxUOM")
  protected UnitOfMeasureEnumT setPxUOM;

  @XmlAttribute(name = "SetPxUOMCcy")
  protected String setPxUOMCcy;

  @XmlAttribute(name = "SetPxTyp")
  protected BigInteger setPxTyp;

  @XmlAttribute(name = "PriSetPx")
  protected BigDecimal priSetPx;

  @XmlAttribute(name = "CntgPx")
  protected BigDecimal cntgPx;

  @XmlAttribute(name = "DiscFctr")
  protected BigDecimal discFctr;

  @XmlAttribute(name = "ValDt")
  protected XMLGregorianCalendar valDt;

  @XmlAttribute(name = "ValTm")
  protected XMLGregorianCalendar valTm;

  @XmlAttribute(name = "ValBizCtr")
  protected String valBizCtr;

  @XmlAttribute(name = "MtchStat")
  protected String mtchStat;

  @XmlAttribute(name = "TxnTm")
  protected XMLGregorianCalendar txnTm;

  @XmlAttribute(name = "RegStat")
  protected RegistStatusEnumT regStat;

  @XmlAttribute(name = "DlvDt")
  protected XMLGregorianCalendar dlvDt;

  @XmlAttribute(name = "ModelTyp")
  protected BigInteger modelTyp;

  @XmlAttribute(name = "PxDelta")
  protected BigDecimal pxDelta;

  @XmlAttribute(name = "Txt")
  protected String txt;

  @XmlAttribute(name = "EncTxtLen")
  protected BigInteger encTxtLen;

  @XmlAttribute(name = "EncTxt")
  protected byte[] encTxt;

  /**
   * Gets the value of the applSeqCtrl property.
   *
   * @return possible object is {@link ApplicationSequenceControlBlockT }
   */
  public ApplicationSequenceControlBlockT getApplSeqCtrl() {
    return applSeqCtrl;
  }

  /**
   * Sets the value of the applSeqCtrl property.
   *
   * @param value allowed object is {@link ApplicationSequenceControlBlockT }
   */
  public void setApplSeqCtrl(ApplicationSequenceControlBlockT value) {
    this.applSeqCtrl = value;
  }

  /**
   * Gets the value of the pty property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the pty property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getPty().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link PartiesBlockT }
   */
  public List<PartiesBlockT> getPty() {
    if (pty == null) {
      pty = new ArrayList<PartiesBlockT>();
    }
    return this.pty;
  }

  /**
   * Gets the value of the instrmt property.
   *
   * @return possible object is {@link InstrumentBlockT }
   */
  public InstrumentBlockT getInstrmt() {
    return instrmt;
  }

  /**
   * Sets the value of the instrmt property.
   *
   * @param value allowed object is {@link InstrumentBlockT }
   */
  public void setInstrmt(InstrumentBlockT value) {
    this.instrmt = value;
  }

  /**
   * Gets the value of the finDetls property.
   *
   * @return possible object is {@link FinancingDetailsBlockT }
   */
  public FinancingDetailsBlockT getFinDetls() {
    return finDetls;
  }

  /**
   * Sets the value of the finDetls property.
   *
   * @param value allowed object is {@link FinancingDetailsBlockT }
   */
  public void setFinDetls(FinancingDetailsBlockT value) {
    this.finDetls = value;
  }

  /**
   * Gets the value of the leg property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the leg property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getLeg().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link InstrmtLegGrpBlockT }
   */
  public List<InstrmtLegGrpBlockT> getLeg() {
    if (leg == null) {
      leg = new ArrayList<InstrmtLegGrpBlockT>();
    }
    return this.leg;
  }

  /**
   * Gets the value of the reltdInstrmt property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the reltdInstrmt property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getReltdInstrmt().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link RelatedInstrumentGrpBlockT }
   */
  public List<RelatedInstrumentGrpBlockT> getReltdInstrmt() {
    if (reltdInstrmt == null) {
      reltdInstrmt = new ArrayList<RelatedInstrumentGrpBlockT>();
    }
    return this.reltdInstrmt;
  }

  /**
   * Gets the value of the collAmt property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the collAmt property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getCollAmt().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link CollateralAmountGrpBlockT }
   */
  public List<CollateralAmountGrpBlockT> getCollAmt() {
    if (collAmt == null) {
      collAmt = new ArrayList<CollateralAmountGrpBlockT>();
    }
    return this.collAmt;
  }

  /**
   * Gets the value of the posUnd property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the posUnd property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getPosUnd().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link PosUndInstrmtGrpBlockT }
   */
  public List<PosUndInstrmtGrpBlockT> getPosUnd() {
    if (posUnd == null) {
      posUnd = new ArrayList<PosUndInstrmtGrpBlockT>();
    }
    return this.posUnd;
  }

  /**
   * Gets the value of the qty property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the qty property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getQty().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link PositionQtyBlockT }
   */
  public List<PositionQtyBlockT> getQty() {
    if (qty == null) {
      qty = new ArrayList<PositionQtyBlockT>();
    }
    return this.qty;
  }

  /**
   * Gets the value of the amt property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the amt property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getAmt().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link PositionAmountDataBlockT }
   */
  public List<PositionAmountDataBlockT> getAmt() {
    if (amt == null) {
      amt = new ArrayList<PositionAmountDataBlockT>();
    }
    return this.amt;
  }

  /**
   * Gets the value of the regTrdID property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the regTrdID property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getRegTrdID().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link RegulatoryTradeIDGrpBlockT }
   */
  public List<RegulatoryTradeIDGrpBlockT> getRegTrdID() {
    if (regTrdID == null) {
      regTrdID = new ArrayList<RegulatoryTradeIDGrpBlockT>();
    }
    return this.regTrdID;
  }

  /**
   * Gets the value of the pmt property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the pmt property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getPmt().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link PaymentGrpBlockT }
   */
  public List<PaymentGrpBlockT> getPmt() {
    if (pmt == null) {
      pmt = new ArrayList<PaymentGrpBlockT>();
    }
    return this.pmt;
  }

  /**
   * Gets the value of the reltdTrd property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the reltdTrd property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getReltdTrd().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link RelatedTradeGrpBlockT }
   */
  public List<RelatedTradeGrpBlockT> getReltdTrd() {
    if (reltdTrd == null) {
      reltdTrd = new ArrayList<RelatedTradeGrpBlockT>();
    }
    return this.reltdTrd;
  }

  /**
   * Gets the value of the rptID property.
   *
   * @return possible object is {@link String }
   */
  public String getRptID() {
    return rptID;
  }

  /**
   * Sets the value of the rptID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRptID(String value) {
    this.rptID = value;
  }

  /**
   * Gets the value of the posID property.
   *
   * @return possible object is {@link String }
   */
  public String getPosID() {
    return posID;
  }

  /**
   * Sets the value of the posID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPosID(String value) {
    this.posID = value;
  }

  /**
   * Gets the value of the reqID property.
   *
   * @return possible object is {@link String }
   */
  public String getReqID() {
    return reqID;
  }

  /**
   * Sets the value of the reqID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setReqID(String value) {
    this.reqID = value;
  }

  /**
   * Gets the value of the reqTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getReqTyp() {
    return reqTyp;
  }

  /**
   * Sets the value of the reqTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setReqTyp(BigInteger value) {
    this.reqTyp = value;
  }

  /**
   * Gets the value of the actn property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getActn() {
    return actn;
  }

  /**
   * Sets the value of the actn property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setActn(BigInteger value) {
    this.actn = value;
  }

  /**
   * Gets the value of the id property.
   *
   * @return possible object is {@link String }
   */
  public String getID() {
    return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is {@link String }
   */
  public void setID(String value) {
    this.id = value;
  }

  /**
   * Gets the value of the subReqTyp property.
   *
   * @return possible object is {@link String }
   */
  public String getSubReqTyp() {
    return subReqTyp;
  }

  /**
   * Sets the value of the subReqTyp property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSubReqTyp(String value) {
    this.subReqTyp = value;
  }

  /**
   * Gets the value of the totRpts property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getTotRpts() {
    return totRpts;
  }

  /**
   * Sets the value of the totRpts property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setTotRpts(BigInteger value) {
    this.totRpts = value;
  }

  /**
   * Gets the value of the totNumRpts property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getTotNumRpts() {
    return totNumRpts;
  }

  /**
   * Sets the value of the totNumRpts property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setTotNumRpts(BigInteger value) {
    this.totNumRpts = value;
  }

  /**
   * Gets the value of the lastRptReqed property.
   *
   * @return possible object is {@link LastRptRequestedEnumT }
   */
  public LastRptRequestedEnumT getLastRptReqed() {
    return lastRptReqed;
  }

  /**
   * Sets the value of the lastRptReqed property.
   *
   * @param value allowed object is {@link LastRptRequestedEnumT }
   */
  public void setLastRptReqed(LastRptRequestedEnumT value) {
    this.lastRptReqed = value;
  }

  /**
   * Gets the value of the rslt property.
   *
   * @return possible object is {@link String }
   */
  public String getRslt() {
    return rslt;
  }

  /**
   * Sets the value of the rslt property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRslt(String value) {
    this.rslt = value;
  }

  /**
   * Gets the value of the unsol property.
   *
   * @return possible object is {@link UnsolicitedIndicatorEnumT }
   */
  public UnsolicitedIndicatorEnumT getUnsol() {
    return unsol;
  }

  /**
   * Sets the value of the unsol property.
   *
   * @param value allowed object is {@link UnsolicitedIndicatorEnumT }
   */
  public void setUnsol(UnsolicitedIndicatorEnumT value) {
    this.unsol = value;
  }

  /**
   * Gets the value of the bizDt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getBizDt() {
    return bizDt;
  }

  /**
   * Sets the value of the bizDt property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setBizDt(XMLGregorianCalendar value) {
    this.bizDt = value;
  }

  /**
   * Gets the value of the prevBizDt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getPrevBizDt() {
    return prevBizDt;
  }

  /**
   * Sets the value of the prevBizDt property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setPrevBizDt(XMLGregorianCalendar value) {
    this.prevBizDt = value;
  }

  /**
   * Gets the value of the setSesID property.
   *
   * @return possible object is {@link SettlSessIDEnumT }
   */
  public SettlSessIDEnumT getSetSesID() {
    return setSesID;
  }

  /**
   * Sets the value of the setSesID property.
   *
   * @param value allowed object is {@link SettlSessIDEnumT }
   */
  public void setSetSesID(SettlSessIDEnumT value) {
    this.setSesID = value;
  }

  /**
   * Gets the value of the setSesSub property.
   *
   * @return possible object is {@link String }
   */
  public String getSetSesSub() {
    return setSesSub;
  }

  /**
   * Sets the value of the setSesSub property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSetSesSub(String value) {
    this.setSesSub = value;
  }

  /**
   * Gets the value of the pxTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getPxTyp() {
    return pxTyp;
  }

  /**
   * Sets the value of the pxTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setPxTyp(BigInteger value) {
    this.pxTyp = value;
  }

  /**
   * Gets the value of the settlCcy property.
   *
   * @return possible object is {@link String }
   */
  public String getSettlCcy() {
    return settlCcy;
  }

  /**
   * Sets the value of the settlCcy property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSettlCcy(String value) {
    this.settlCcy = value;
  }

  /**
   * Gets the value of the msgEvtSrc property.
   *
   * @return possible object is {@link String }
   */
  public String getMsgEvtSrc() {
    return msgEvtSrc;
  }

  /**
   * Sets the value of the msgEvtSrc property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMsgEvtSrc(String value) {
    this.msgEvtSrc = value;
  }

  /**
   * Gets the value of the clrd property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getClrd() {
    return clrd;
  }

  /**
   * Sets the value of the clrd property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setClrd(BigInteger value) {
    this.clrd = value;
  }

  /**
   * Gets the value of the conRefPosTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getConRefPosTyp() {
    return conRefPosTyp;
  }

  /**
   * Sets the value of the conRefPosTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setConRefPosTyp(BigInteger value) {
    this.conRefPosTyp = value;
  }

  /**
   * Gets the value of the posCpcty property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getPosCpcty() {
    return posCpcty;
  }

  /**
   * Sets the value of the posCpcty property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setPosCpcty(BigInteger value) {
    this.posCpcty = value;
  }

  /**
   * Gets the value of the trmtdInd property.
   *
   * @return possible object is {@link String }
   */
  public String getTrmtdInd() {
    return trmtdInd;
  }

  /**
   * Sets the value of the trmtdInd property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTrmtdInd(String value) {
    this.trmtdInd = value;
  }

  /**
   * Gets the value of the intraFirmTrdInd property.
   *
   * @return possible object is {@link String }
   */
  public String getIntraFirmTrdInd() {
    return intraFirmTrdInd;
  }

  /**
   * Sets the value of the intraFirmTrdInd property.
   *
   * @param value allowed object is {@link String }
   */
  public void setIntraFirmTrdInd(String value) {
    this.intraFirmTrdInd = value;
  }

  /**
   * Gets the value of the trdContntn property.
   *
   * @return possible object is {@link String }
   */
  public String getTrdContntn() {
    return trdContntn;
  }

  /**
   * Sets the value of the trdContntn property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTrdContntn(String value) {
    this.trdContntn = value;
  }

  /**
   * Gets the value of the trdContntnTxt property.
   *
   * @return possible object is {@link String }
   */
  public String getTrdContntnTxt() {
    return trdContntnTxt;
  }

  /**
   * Sets the value of the trdContntnTxt property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTrdContntnTxt(String value) {
    this.trdContntnTxt = value;
  }

  /**
   * Gets the value of the encTrdContntnTextLen property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getEncTrdContntnTextLen() {
    return encTrdContntnTextLen;
  }

  /**
   * Sets the value of the encTrdContntnTextLen property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setEncTrdContntnTextLen(BigInteger value) {
    this.encTrdContntnTextLen = value;
  }

  /**
   * Gets the value of the encTrdContntnText property.
   *
   * @return possible object is byte[]
   */
  public byte[] getEncTrdContntnText() {
    return encTrdContntnText;
  }

  /**
   * Sets the value of the encTrdContntnText property.
   *
   * @param value allowed object is byte[]
   */
  public void setEncTrdContntnText(byte[] value) {
    this.encTrdContntnText = value;
  }

  /**
   * Gets the value of the trdCollztn property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getTrdCollztn() {
    return trdCollztn;
  }

  /**
   * Sets the value of the trdCollztn property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setTrdCollztn(BigInteger value) {
    this.trdCollztn = value;
  }

  /**
   * Gets the value of the acct property.
   *
   * @return possible object is {@link String }
   */
  public String getAcct() {
    return acct;
  }

  /**
   * Sets the value of the acct property.
   *
   * @param value allowed object is {@link String }
   */
  public void setAcct(String value) {
    this.acct = value;
  }

  /**
   * Gets the value of the acctIDSrc property.
   *
   * @return possible object is {@link String }
   */
  public String getAcctIDSrc() {
    return acctIDSrc;
  }

  /**
   * Sets the value of the acctIDSrc property.
   *
   * @param value allowed object is {@link String }
   */
  public void setAcctIDSrc(String value) {
    this.acctIDSrc = value;
  }

  /**
   * Gets the value of the acctTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getAcctTyp() {
    return acctTyp;
  }

  /**
   * Sets the value of the acctTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setAcctTyp(BigInteger value) {
    this.acctTyp = value;
  }

  /**
   * Gets the value of the txnmyTyp property.
   *
   * @return possible object is {@link TaxonomyTypeEnumT }
   */
  public TaxonomyTypeEnumT getTxnmyTyp() {
    return txnmyTyp;
  }

  /**
   * Sets the value of the txnmyTyp property.
   *
   * @param value allowed object is {@link TaxonomyTypeEnumT }
   */
  public void setTxnmyTyp(TaxonomyTypeEnumT value) {
    this.txnmyTyp = value;
  }

  /**
   * Gets the value of the ccy property.
   *
   * @return possible object is {@link String }
   */
  public String getCcy() {
    return ccy;
  }

  /**
   * Sets the value of the ccy property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCcy(String value) {
    this.ccy = value;
  }

  /**
   * Gets the value of the settlDt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getSettlDt() {
    return settlDt;
  }

  /**
   * Sets the value of the settlDt property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setSettlDt(XMLGregorianCalendar value) {
    this.settlDt = value;
  }

  /**
   * Gets the value of the setPx property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getSetPx() {
    return setPx;
  }

  /**
   * Sets the value of the setPx property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setSetPx(BigDecimal value) {
    this.setPx = value;
  }

  /**
   * Gets the value of the settlPxFxRtCalc property.
   *
   * @return possible object is {@link SettlCurrFxRateCalcEnumT }
   */
  public SettlCurrFxRateCalcEnumT getSettlPxFxRtCalc() {
    return settlPxFxRtCalc;
  }

  /**
   * Sets the value of the settlPxFxRtCalc property.
   *
   * @param value allowed object is {@link SettlCurrFxRateCalcEnumT }
   */
  public void setSettlPxFxRtCalc(SettlCurrFxRateCalcEnumT value) {
    this.settlPxFxRtCalc = value;
  }

  /**
   * Gets the value of the settlFwdPnts property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getSettlFwdPnts() {
    return settlFwdPnts;
  }

  /**
   * Sets the value of the settlFwdPnts property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setSettlFwdPnts(BigDecimal value) {
    this.settlFwdPnts = value;
  }

  /**
   * Gets the value of the setPxUOM property.
   *
   * @return possible object is {@link UnitOfMeasureEnumT }
   */
  public UnitOfMeasureEnumT getSetPxUOM() {
    return setPxUOM;
  }

  /**
   * Sets the value of the setPxUOM property.
   *
   * @param value allowed object is {@link UnitOfMeasureEnumT }
   */
  public void setSetPxUOM(UnitOfMeasureEnumT value) {
    this.setPxUOM = value;
  }

  /**
   * Gets the value of the setPxUOMCcy property.
   *
   * @return possible object is {@link String }
   */
  public String getSetPxUOMCcy() {
    return setPxUOMCcy;
  }

  /**
   * Sets the value of the setPxUOMCcy property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSetPxUOMCcy(String value) {
    this.setPxUOMCcy = value;
  }

  /**
   * Gets the value of the setPxTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getSetPxTyp() {
    return setPxTyp;
  }

  /**
   * Sets the value of the setPxTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setSetPxTyp(BigInteger value) {
    this.setPxTyp = value;
  }

  /**
   * Gets the value of the priSetPx property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getPriSetPx() {
    return priSetPx;
  }

  /**
   * Sets the value of the priSetPx property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setPriSetPx(BigDecimal value) {
    this.priSetPx = value;
  }

  /**
   * Gets the value of the cntgPx property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getCntgPx() {
    return cntgPx;
  }

  /**
   * Sets the value of the cntgPx property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setCntgPx(BigDecimal value) {
    this.cntgPx = value;
  }

  /**
   * Gets the value of the discFctr property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getDiscFctr() {
    return discFctr;
  }

  /**
   * Sets the value of the discFctr property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setDiscFctr(BigDecimal value) {
    this.discFctr = value;
  }

  /**
   * Gets the value of the valDt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getValDt() {
    return valDt;
  }

  /**
   * Sets the value of the valDt property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setValDt(XMLGregorianCalendar value) {
    this.valDt = value;
  }

  /**
   * Gets the value of the valTm property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getValTm() {
    return valTm;
  }

  /**
   * Sets the value of the valTm property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setValTm(XMLGregorianCalendar value) {
    this.valTm = value;
  }

  /**
   * Gets the value of the valBizCtr property.
   *
   * @return possible object is {@link String }
   */
  public String getValBizCtr() {
    return valBizCtr;
  }

  /**
   * Sets the value of the valBizCtr property.
   *
   * @param value allowed object is {@link String }
   */
  public void setValBizCtr(String value) {
    this.valBizCtr = value;
  }

  /**
   * Gets the value of the mtchStat property.
   *
   * @return possible object is {@link String }
   */
  public String getMtchStat() {
    return mtchStat;
  }

  /**
   * Sets the value of the mtchStat property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMtchStat(String value) {
    this.mtchStat = value;
  }

  /**
   * Gets the value of the txnTm property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getTxnTm() {
    return txnTm;
  }

  /**
   * Sets the value of the txnTm property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setTxnTm(XMLGregorianCalendar value) {
    this.txnTm = value;
  }

  /**
   * Gets the value of the regStat property.
   *
   * @return possible object is {@link RegistStatusEnumT }
   */
  public RegistStatusEnumT getRegStat() {
    return regStat;
  }

  /**
   * Sets the value of the regStat property.
   *
   * @param value allowed object is {@link RegistStatusEnumT }
   */
  public void setRegStat(RegistStatusEnumT value) {
    this.regStat = value;
  }

  /**
   * Gets the value of the dlvDt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getDlvDt() {
    return dlvDt;
  }

  /**
   * Sets the value of the dlvDt property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setDlvDt(XMLGregorianCalendar value) {
    this.dlvDt = value;
  }

  /**
   * Gets the value of the modelTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getModelTyp() {
    return modelTyp;
  }

  /**
   * Sets the value of the modelTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setModelTyp(BigInteger value) {
    this.modelTyp = value;
  }

  /**
   * Gets the value of the pxDelta property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getPxDelta() {
    return pxDelta;
  }

  /**
   * Sets the value of the pxDelta property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setPxDelta(BigDecimal value) {
    this.pxDelta = value;
  }

  /**
   * Gets the value of the txt property.
   *
   * @return possible object is {@link String }
   */
  public String getTxt() {
    return txt;
  }

  /**
   * Sets the value of the txt property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTxt(String value) {
    this.txt = value;
  }

  /**
   * Gets the value of the encTxtLen property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getEncTxtLen() {
    return encTxtLen;
  }

  /**
   * Sets the value of the encTxtLen property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setEncTxtLen(BigInteger value) {
    this.encTxtLen = value;
  }

  /**
   * Gets the value of the encTxt property.
   *
   * @return possible object is byte[]
   */
  public byte[] getEncTxt() {
    return encTxt;
  }

  /**
   * Sets the value of the encTxt property.
   *
   * @param value allowed object is byte[]
   */
  public void setEncTxt(byte[] value) {
    this.encTxt = value;
  }
}
