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
 * Java class for InstrmtMatchSideGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="InstrmtMatchSideGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}InstrmtMatchSideGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}InstrmtMatchSideGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "InstrmtMatchSideGrp_Block_t",
  propOrder = {"instrmt", "leg", "undly", "trdMtchSide"}
)
public class InstrmtMatchSideGrpBlockT {

  @XmlElement(name = "Instrmt")
  protected InstrumentBlockT instrmt;

  @XmlElement(name = "Leg")
  protected List<InstrmtLegGrpBlockT> leg;

  @XmlElement(name = "Undly")
  protected List<UndInstrmtGrpBlockT> undly;

  @XmlElement(name = "TrdMtchSide")
  protected List<TrdMatchSideGrpBlockT> trdMtchSide;

  @XmlAttribute(name = "MtchSubID")
  protected String mtchSubID;

  @XmlAttribute(name = "Qty")
  protected BigDecimal qty;

  @XmlAttribute(name = "Ccy")
  protected String ccy;

  @XmlAttribute(name = "SettlCcy")
  protected String settlCcy;

  @XmlAttribute(name = "QtyTyp")
  protected BigInteger qtyTyp;

  @XmlAttribute(name = "LastQty")
  protected BigDecimal lastQty;

  @XmlAttribute(name = "PxTyp")
  protected BigInteger pxTyp;

  @XmlAttribute(name = "LastPx")
  protected BigDecimal lastPx;

  @XmlAttribute(name = "LastMkt")
  protected String lastMkt;

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
   * Gets the value of the trdMtchSide property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the trdMtchSide property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getTrdMtchSide().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link TrdMatchSideGrpBlockT }
   */
  public List<TrdMatchSideGrpBlockT> getTrdMtchSide() {
    if (trdMtchSide == null) {
      trdMtchSide = new ArrayList<TrdMatchSideGrpBlockT>();
    }
    return this.trdMtchSide;
  }

  /**
   * Gets the value of the mtchSubID property.
   *
   * @return possible object is {@link String }
   */
  public String getMtchSubID() {
    return mtchSubID;
  }

  /**
   * Sets the value of the mtchSubID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMtchSubID(String value) {
    this.mtchSubID = value;
  }

  /**
   * Gets the value of the qty property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getQty() {
    return qty;
  }

  /**
   * Sets the value of the qty property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setQty(BigDecimal value) {
    this.qty = value;
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
   * Gets the value of the qtyTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getQtyTyp() {
    return qtyTyp;
  }

  /**
   * Sets the value of the qtyTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setQtyTyp(BigInteger value) {
    this.qtyTyp = value;
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
   * Gets the value of the lastMkt property.
   *
   * @return possible object is {@link String }
   */
  public String getLastMkt() {
    return lastMkt;
  }

  /**
   * Sets the value of the lastMkt property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLastMkt(String value) {
    this.lastMkt = value;
  }
}
