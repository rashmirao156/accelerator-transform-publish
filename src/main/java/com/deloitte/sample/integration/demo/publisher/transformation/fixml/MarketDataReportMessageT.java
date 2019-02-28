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
import java.math.BigInteger;

/**
 * MarketDataReport can be found in Volume 3 of the specification
 *
 * <p>Java class for MarketDataReport_message_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MarketDataReport_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDataReportElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDataReportAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "MarketDataReport_message_t",
  propOrder = {"applSeqCtrl"}
)
public class MarketDataReportMessageT extends AbstractMessageT {

  @XmlElement(name = "ApplSeqCtrl")
  protected ApplicationSequenceControlBlockT applSeqCtrl;

  @XmlAttribute(name = "RptID")
  protected BigInteger rptID;

  @XmlAttribute(name = "MDRptEvent", required = true)
  protected BigInteger mdRptEvent;

  @XmlAttribute(name = "MDRptCnt", required = true)
  protected BigInteger mdRptCnt;

  @XmlAttribute(name = "TxnTm")
  protected XMLGregorianCalendar txnTm;

  @XmlAttribute(name = "TotNumRpts")
  protected BigInteger totNumRpts;

  @XmlAttribute(name = "TotNoMktSegRpts")
  protected BigInteger totNoMktSegRpts;

  @XmlAttribute(name = "TotNoInstrmtRpts")
  protected BigInteger totNoInstrmtRpts;

  @XmlAttribute(name = "TotNoPtyDetlRpts")
  protected BigInteger totNoPtyDetlRpts;

  @XmlAttribute(name = "TotNoEntlmntRpts")
  protected BigInteger totNoEntlmntRpts;

  @XmlAttribute(name = "TotNoRiskLmtRpts")
  protected BigInteger totNoRiskLmtRpts;

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
   * Gets the value of the mdRptEvent property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getMDRptEvent() {
    return mdRptEvent;
  }

  /**
   * Sets the value of the mdRptEvent property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setMDRptEvent(BigInteger value) {
    this.mdRptEvent = value;
  }

  /**
   * Gets the value of the mdRptCnt property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getMDRptCnt() {
    return mdRptCnt;
  }

  /**
   * Sets the value of the mdRptCnt property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setMDRptCnt(BigInteger value) {
    this.mdRptCnt = value;
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
   * Gets the value of the totNoMktSegRpts property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getTotNoMktSegRpts() {
    return totNoMktSegRpts;
  }

  /**
   * Sets the value of the totNoMktSegRpts property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setTotNoMktSegRpts(BigInteger value) {
    this.totNoMktSegRpts = value;
  }

  /**
   * Gets the value of the totNoInstrmtRpts property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getTotNoInstrmtRpts() {
    return totNoInstrmtRpts;
  }

  /**
   * Sets the value of the totNoInstrmtRpts property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setTotNoInstrmtRpts(BigInteger value) {
    this.totNoInstrmtRpts = value;
  }

  /**
   * Gets the value of the totNoPtyDetlRpts property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getTotNoPtyDetlRpts() {
    return totNoPtyDetlRpts;
  }

  /**
   * Sets the value of the totNoPtyDetlRpts property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setTotNoPtyDetlRpts(BigInteger value) {
    this.totNoPtyDetlRpts = value;
  }

  /**
   * Gets the value of the totNoEntlmntRpts property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getTotNoEntlmntRpts() {
    return totNoEntlmntRpts;
  }

  /**
   * Sets the value of the totNoEntlmntRpts property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setTotNoEntlmntRpts(BigInteger value) {
    this.totNoEntlmntRpts = value;
  }

  /**
   * Gets the value of the totNoRiskLmtRpts property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getTotNoRiskLmtRpts() {
    return totNoRiskLmtRpts;
  }

  /**
   * Sets the value of the totNoRiskLmtRpts property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setTotNoRiskLmtRpts(BigInteger value) {
    this.totNoRiskLmtRpts = value;
  }
}
