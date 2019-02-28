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
 * SecurityDefinition can be found in Volume 3 of the specification
 *
 * <p>Java class for SecurityDefinition_message_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SecurityDefinition_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityDefinitionElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityDefinitionAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "SecurityDefinition_message_t",
  propOrder = {
    "applSeqCtrl",
    "instrmt",
    "instrmtExt",
    "finDetls",
    "undly",
    "reltdInstrmt",
    "secClsfnGrp",
    "stip",
    "leg",
    "sprdBnchmkCurve",
    "yield",
    "mktSegGrp"
  }
)
public class SecurityDefinitionMessageT extends AbstractMessageT {

  @XmlElement(name = "ApplSeqCtrl")
  protected ApplicationSequenceControlBlockT applSeqCtrl;

  @XmlElement(name = "Instrmt")
  protected InstrumentBlockT instrmt;

  @XmlElement(name = "InstrmtExt")
  protected InstrumentExtensionBlockT instrmtExt;

  @XmlElement(name = "FinDetls")
  protected FinancingDetailsBlockT finDetls;

  @XmlElement(name = "Undly")
  protected List<UndInstrmtGrpBlockT> undly;

  @XmlElement(name = "ReltdInstrmt")
  protected List<RelatedInstrumentGrpBlockT> reltdInstrmt;

  @XmlElement(name = "SecClsfnGrp")
  protected List<SecurityClassificationGrpBlockT> secClsfnGrp;

  @XmlElement(name = "Stip")
  protected List<StipulationsBlockT> stip;

  @XmlElement(name = "Leg")
  protected List<InstrmtLegGrpBlockT> leg;

  @XmlElement(name = "SprdBnchmkCurve")
  protected SpreadOrBenchmarkCurveDataBlockT sprdBnchmkCurve;

  @XmlElement(name = "Yield")
  protected YieldDataBlockT yield;

  @XmlElement(name = "MktSegGrp")
  protected List<MarketSegmentGrpBlockT> mktSegGrp;

  @XmlAttribute(name = "RptID")
  protected BigInteger rptID;

  @XmlAttribute(name = "BizDt")
  protected XMLGregorianCalendar bizDt;

  @XmlAttribute(name = "ReqID")
  protected String reqID;

  @XmlAttribute(name = "OrdReqID")
  protected BigInteger ordReqID;

  @XmlAttribute(name = "RspID")
  protected String rspID;

  @XmlAttribute(name = "RspTyp")
  protected BigInteger rspTyp;

  @XmlAttribute(name = "ReqRslt")
  protected BigInteger reqRslt;

  @XmlAttribute(name = "SecRejRsn")
  protected String secRejRsn;

  @XmlAttribute(name = "CorpActn")
  protected String corpActn;

  @XmlAttribute(name = "Ccy")
  protected String ccy;

  @XmlAttribute(name = "PrevAdjOpenInt")
  protected BigDecimal prevAdjOpenInt;

  @XmlAttribute(name = "PrevUnadjOpenInt")
  protected BigDecimal prevUnadjOpenInt;

  @XmlAttribute(name = "PriSetPx")
  protected BigDecimal priSetPx;

  @XmlAttribute(name = "Txt")
  protected String txt;

  @XmlAttribute(name = "EncTxtLen")
  protected BigInteger encTxtLen;

  @XmlAttribute(name = "EncTxt")
  protected byte[] encTxt;

  @XmlAttribute(name = "NumSimplInstrmt")
  protected BigInteger numSimplInstrmt;

  @XmlAttribute(name = "NumCmplxInstrmt")
  protected BigInteger numCmplxInstrmt;

  @XmlAttribute(name = "LastUpdateTm")
  protected XMLGregorianCalendar lastUpdateTm;

  @XmlAttribute(name = "EfctvBizDt")
  protected XMLGregorianCalendar efctvBizDt;

  @XmlAttribute(name = "TxnTm")
  protected XMLGregorianCalendar txnTm;

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
   * Gets the value of the instrmtExt property.
   *
   * @return possible object is {@link InstrumentExtensionBlockT }
   */
  public InstrumentExtensionBlockT getInstrmtExt() {
    return instrmtExt;
  }

  /**
   * Sets the value of the instrmtExt property.
   *
   * @param value allowed object is {@link InstrumentExtensionBlockT }
   */
  public void setInstrmtExt(InstrumentExtensionBlockT value) {
    this.instrmtExt = value;
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
   * Gets the value of the undly property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the undly property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getUndly().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link UndInstrmtGrpBlockT }
   */
  public List<UndInstrmtGrpBlockT> getUndly() {
    if (undly == null) {
      undly = new ArrayList<UndInstrmtGrpBlockT>();
    }
    return this.undly;
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
   * Gets the value of the secClsfnGrp property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the secClsfnGrp property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getSecClsfnGrp().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link
   * SecurityClassificationGrpBlockT }
   */
  public List<SecurityClassificationGrpBlockT> getSecClsfnGrp() {
    if (secClsfnGrp == null) {
      secClsfnGrp = new ArrayList<SecurityClassificationGrpBlockT>();
    }
    return this.secClsfnGrp;
  }

  /**
   * Gets the value of the stip property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the stip property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getStip().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link StipulationsBlockT }
   */
  public List<StipulationsBlockT> getStip() {
    if (stip == null) {
      stip = new ArrayList<StipulationsBlockT>();
    }
    return this.stip;
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
   * Gets the value of the sprdBnchmkCurve property.
   *
   * @return possible object is {@link SpreadOrBenchmarkCurveDataBlockT }
   */
  public SpreadOrBenchmarkCurveDataBlockT getSprdBnchmkCurve() {
    return sprdBnchmkCurve;
  }

  /**
   * Sets the value of the sprdBnchmkCurve property.
   *
   * @param value allowed object is {@link SpreadOrBenchmarkCurveDataBlockT }
   */
  public void setSprdBnchmkCurve(SpreadOrBenchmarkCurveDataBlockT value) {
    this.sprdBnchmkCurve = value;
  }

  /**
   * Gets the value of the yield property.
   *
   * @return possible object is {@link YieldDataBlockT }
   */
  public YieldDataBlockT getYield() {
    return yield;
  }

  /**
   * Sets the value of the yield property.
   *
   * @param value allowed object is {@link YieldDataBlockT }
   */
  public void setYield(YieldDataBlockT value) {
    this.yield = value;
  }

  /**
   * Gets the value of the mktSegGrp property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the mktSegGrp property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getMktSegGrp().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link MarketSegmentGrpBlockT }
   */
  public List<MarketSegmentGrpBlockT> getMktSegGrp() {
    if (mktSegGrp == null) {
      mktSegGrp = new ArrayList<MarketSegmentGrpBlockT>();
    }
    return this.mktSegGrp;
  }

  /**
   * Gets the value of the rptID property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getRptID() {
    return rptID;
  }

  /**
   * Sets the value of the rptID property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setRptID(BigInteger value) {
    this.rptID = value;
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
   * Gets the value of the ordReqID property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getOrdReqID() {
    return ordReqID;
  }

  /**
   * Sets the value of the ordReqID property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setOrdReqID(BigInteger value) {
    this.ordReqID = value;
  }

  /**
   * Gets the value of the rspID property.
   *
   * @return possible object is {@link String }
   */
  public String getRspID() {
    return rspID;
  }

  /**
   * Sets the value of the rspID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRspID(String value) {
    this.rspID = value;
  }

  /**
   * Gets the value of the rspTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getRspTyp() {
    return rspTyp;
  }

  /**
   * Sets the value of the rspTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setRspTyp(BigInteger value) {
    this.rspTyp = value;
  }

  /**
   * Gets the value of the reqRslt property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getReqRslt() {
    return reqRslt;
  }

  /**
   * Sets the value of the reqRslt property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setReqRslt(BigInteger value) {
    this.reqRslt = value;
  }

  /**
   * Gets the value of the secRejRsn property.
   *
   * @return possible object is {@link String }
   */
  public String getSecRejRsn() {
    return secRejRsn;
  }

  /**
   * Sets the value of the secRejRsn property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSecRejRsn(String value) {
    this.secRejRsn = value;
  }

  /**
   * Gets the value of the corpActn property.
   *
   * @return possible object is {@link String }
   */
  public String getCorpActn() {
    return corpActn;
  }

  /**
   * Sets the value of the corpActn property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCorpActn(String value) {
    this.corpActn = value;
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
   * Gets the value of the prevAdjOpenInt property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getPrevAdjOpenInt() {
    return prevAdjOpenInt;
  }

  /**
   * Sets the value of the prevAdjOpenInt property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setPrevAdjOpenInt(BigDecimal value) {
    this.prevAdjOpenInt = value;
  }

  /**
   * Gets the value of the prevUnadjOpenInt property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getPrevUnadjOpenInt() {
    return prevUnadjOpenInt;
  }

  /**
   * Sets the value of the prevUnadjOpenInt property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setPrevUnadjOpenInt(BigDecimal value) {
    this.prevUnadjOpenInt = value;
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

  /**
   * Gets the value of the numSimplInstrmt property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getNumSimplInstrmt() {
    return numSimplInstrmt;
  }

  /**
   * Sets the value of the numSimplInstrmt property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setNumSimplInstrmt(BigInteger value) {
    this.numSimplInstrmt = value;
  }

  /**
   * Gets the value of the numCmplxInstrmt property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getNumCmplxInstrmt() {
    return numCmplxInstrmt;
  }

  /**
   * Sets the value of the numCmplxInstrmt property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setNumCmplxInstrmt(BigInteger value) {
    this.numCmplxInstrmt = value;
  }

  /**
   * Gets the value of the lastUpdateTm property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getLastUpdateTm() {
    return lastUpdateTm;
  }

  /**
   * Sets the value of the lastUpdateTm property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setLastUpdateTm(XMLGregorianCalendar value) {
    this.lastUpdateTm = value;
  }

  /**
   * Gets the value of the efctvBizDt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getEfctvBizDt() {
    return efctvBizDt;
  }

  /**
   * Sets the value of the efctvBizDt property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setEfctvBizDt(XMLGregorianCalendar value) {
    this.efctvBizDt = value;
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
}
