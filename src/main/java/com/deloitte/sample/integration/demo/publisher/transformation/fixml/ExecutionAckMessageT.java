//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.04 at 04:33:21 PM IST
//

package com.deloitte.sample.integration.demo.publisher.transformation.fixml;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * ExecutionAck can be found in Volume 4 of the specification
 *
 * <p>Java class for ExecutionAck_message_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExecutionAck_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ExecutionAckElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ExecutionAckAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "ExecutionAck_message_t",
  propOrder = {"instrmt", "undly", "leg", "ordQty", "pxQual", "regTrdID"}
)
public class ExecutionAckMessageT extends AbstractMessageT {

  @XmlElement(name = "Instrmt", required = true)
  protected InstrumentBlockT instrmt;

  @XmlElement(name = "Undly")
  protected List<UndInstrmtGrpBlockT> undly;

  @XmlElement(name = "Leg")
  protected List<InstrmtLegGrpBlockT> leg;

  @XmlElement(name = "OrdQty")
  protected OrderQtyDataBlockT ordQty;

  @XmlElement(name = "PxQual")
  protected List<PriceQualifierGrpBlockT> pxQual;

  @XmlElement(name = "RegTrdID")
  protected List<RegulatoryTradeIDGrpBlockT> regTrdID;

  @XmlAttribute(name = "OrdID", required = true)
  protected String ordID;

  @XmlAttribute(name = "OrdID2")
  protected String ordID2;

  @XmlAttribute(name = "ID")
  protected String id;

  @XmlAttribute(name = "ExecAckStat", required = true)
  protected String execAckStat;

  @XmlAttribute(name = "ExecID", required = true)
  protected String execID;

  @XmlAttribute(name = "DkRsn")
  protected DKReasonEnumT dkRsn;

  @XmlAttribute(name = "Side", required = true)
  protected String side;

  @XmlAttribute(name = "LastQty")
  protected BigDecimal lastQty;

  @XmlAttribute(name = "LastPx")
  protected BigDecimal lastPx;

  @XmlAttribute(name = "PxTyp")
  protected BigInteger pxTyp;

  @XmlAttribute(name = "LastParPx")
  protected BigDecimal lastParPx;

  @XmlAttribute(name = "CumQty")
  protected BigDecimal cumQty;

  @XmlAttribute(name = "AvgPx")
  protected BigDecimal avgPx;

  @XmlAttribute(name = "Txt")
  protected String txt;

  @XmlAttribute(name = "EncTxtLen")
  protected BigInteger encTxtLen;

  @XmlAttribute(name = "EncTxt")
  protected byte[] encTxt;

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
   * Gets the value of the ordQty property.
   *
   * @return possible object is {@link OrderQtyDataBlockT }
   */
  public OrderQtyDataBlockT getOrdQty() {
    return ordQty;
  }

  /**
   * Sets the value of the ordQty property.
   *
   * @param value allowed object is {@link OrderQtyDataBlockT }
   */
  public void setOrdQty(OrderQtyDataBlockT value) {
    this.ordQty = value;
  }

  /**
   * Gets the value of the pxQual property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the pxQual property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getPxQual().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link PriceQualifierGrpBlockT }
   */
  public List<PriceQualifierGrpBlockT> getPxQual() {
    if (pxQual == null) {
      pxQual = new ArrayList<PriceQualifierGrpBlockT>();
    }
    return this.pxQual;
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
   * Gets the value of the ordID property.
   *
   * @return possible object is {@link String }
   */
  public String getOrdID() {
    return ordID;
  }

  /**
   * Sets the value of the ordID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setOrdID(String value) {
    this.ordID = value;
  }

  /**
   * Gets the value of the ordID2 property.
   *
   * @return possible object is {@link String }
   */
  public String getOrdID2() {
    return ordID2;
  }

  /**
   * Sets the value of the ordID2 property.
   *
   * @param value allowed object is {@link String }
   */
  public void setOrdID2(String value) {
    this.ordID2 = value;
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
   * Gets the value of the execAckStat property.
   *
   * @return possible object is {@link String }
   */
  public String getExecAckStat() {
    return execAckStat;
  }

  /**
   * Sets the value of the execAckStat property.
   *
   * @param value allowed object is {@link String }
   */
  public void setExecAckStat(String value) {
    this.execAckStat = value;
  }

  /**
   * Gets the value of the execID property.
   *
   * @return possible object is {@link String }
   */
  public String getExecID() {
    return execID;
  }

  /**
   * Sets the value of the execID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setExecID(String value) {
    this.execID = value;
  }

  /**
   * Gets the value of the dkRsn property.
   *
   * @return possible object is {@link DKReasonEnumT }
   */
  public DKReasonEnumT getDkRsn() {
    return dkRsn;
  }

  /**
   * Sets the value of the dkRsn property.
   *
   * @param value allowed object is {@link DKReasonEnumT }
   */
  public void setDkRsn(DKReasonEnumT value) {
    this.dkRsn = value;
  }

  /**
   * Gets the value of the side property.
   *
   * @return possible object is {@link String }
   */
  public String getSide() {
    return side;
  }

  /**
   * Sets the value of the side property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSide(String value) {
    this.side = value;
  }

  /**
   * Gets the value of the lastQty property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getLastQty() {
    return lastQty;
  }

  /**
   * Sets the value of the lastQty property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setLastQty(BigDecimal value) {
    this.lastQty = value;
  }

  /**
   * Gets the value of the lastPx property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getLastPx() {
    return lastPx;
  }

  /**
   * Sets the value of the lastPx property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setLastPx(BigDecimal value) {
    this.lastPx = value;
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
   * Gets the value of the lastParPx property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getLastParPx() {
    return lastParPx;
  }

  /**
   * Sets the value of the lastParPx property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setLastParPx(BigDecimal value) {
    this.lastParPx = value;
  }

  /**
   * Gets the value of the cumQty property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getCumQty() {
    return cumQty;
  }

  /**
   * Sets the value of the cumQty property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setCumQty(BigDecimal value) {
    this.cumQty = value;
  }

  /**
   * Gets the value of the avgPx property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getAvgPx() {
    return avgPx;
  }

  /**
   * Sets the value of the avgPx property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setAvgPx(BigDecimal value) {
    this.avgPx = value;
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
