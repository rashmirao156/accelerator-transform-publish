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
import java.util.ArrayList;
import java.util.List;

/**
 * Java class for OrdAllocGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OrdAllocGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}OrdAllocGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}OrdAllocGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "OrdAllocGrp_Block_t",
  propOrder = {"pty"}
)
public class OrdAllocGrpBlockT {

  @XmlElement(name = "Pty")
  protected List<NestedParties2BlockT> pty;

  @XmlAttribute(name = "ClOrdID")
  protected String clOrdID;

  @XmlAttribute(name = "OrdID")
  protected String ordID;

  @XmlAttribute(name = "OrdID2")
  protected String ordID2;

  @XmlAttribute(name = "ClOrdID2")
  protected String clOrdID2;

  @XmlAttribute(name = "ListID")
  protected String listID;

  @XmlAttribute(name = "Qty")
  protected BigDecimal qty;

  @XmlAttribute(name = "AvgPx")
  protected BigDecimal avgPx;

  @XmlAttribute(name = "BkngQty")
  protected BigDecimal bkngQty;

  @XmlAttribute(name = "OrdTyp")
  protected String ordTyp;

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
   * <p>Objects of the following type(s) are allowed in the list {@link NestedParties2BlockT }
   */
  public List<NestedParties2BlockT> getPty() {
    if (pty == null) {
      pty = new ArrayList<NestedParties2BlockT>();
    }
    return this.pty;
  }

  /**
   * Gets the value of the clOrdID property.
   *
   * @return possible object is {@link String }
   */
  public String getClOrdID() {
    return clOrdID;
  }

  /**
   * Sets the value of the clOrdID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setClOrdID(String value) {
    this.clOrdID = value;
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
   * Gets the value of the clOrdID2 property.
   *
   * @return possible object is {@link String }
   */
  public String getClOrdID2() {
    return clOrdID2;
  }

  /**
   * Sets the value of the clOrdID2 property.
   *
   * @param value allowed object is {@link String }
   */
  public void setClOrdID2(String value) {
    this.clOrdID2 = value;
  }

  /**
   * Gets the value of the listID property.
   *
   * @return possible object is {@link String }
   */
  public String getListID() {
    return listID;
  }

  /**
   * Sets the value of the listID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setListID(String value) {
    this.listID = value;
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
   * Gets the value of the bkngQty property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getBkngQty() {
    return bkngQty;
  }

  /**
   * Sets the value of the bkngQty property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setBkngQty(BigDecimal value) {
    this.bkngQty = value;
  }

  /**
   * Gets the value of the ordTyp property.
   *
   * @return possible object is {@link String }
   */
  public String getOrdTyp() {
    return ordTyp;
  }

  /**
   * Sets the value of the ordTyp property.
   *
   * @param value allowed object is {@link String }
   */
  public void setOrdTyp(String value) {
    this.ordTyp = value;
  }
}
