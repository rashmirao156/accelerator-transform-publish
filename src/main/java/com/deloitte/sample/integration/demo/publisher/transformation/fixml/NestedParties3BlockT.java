//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.04 at 04:33:21 PM IST
//

package com.deloitte.sample.integration.demo.publisher.transformation.fixml;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Java class for NestedParties3_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NestedParties3_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NestedParties3Elements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NestedParties3Attributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "NestedParties3_Block_t",
  propOrder = {"sub"}
)
public class NestedParties3BlockT {

  @XmlElement(name = "Sub")
  protected List<NstdPtys3SubGrpBlockT> sub;

  @XmlAttribute(name = "ID")
  protected String id;

  @XmlAttribute(name = "Src")
  protected String src;

  @XmlAttribute(name = "R")
  protected BigInteger r;

  @XmlAttribute(name = "Qual")
  protected BigInteger qual;

  /**
   * Gets the value of the sub property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the sub property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getSub().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link NstdPtys3SubGrpBlockT }
   */
  public List<NstdPtys3SubGrpBlockT> getSub() {
    if (sub == null) {
      sub = new ArrayList<NstdPtys3SubGrpBlockT>();
    }
    return this.sub;
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
   * Gets the value of the src property.
   *
   * @return possible object is {@link String }
   */
  public String getSrc() {
    return src;
  }

  /**
   * Sets the value of the src property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSrc(String value) {
    this.src = value;
  }

  /**
   * Gets the value of the r property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getR() {
    return r;
  }

  /**
   * Sets the value of the r property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setR(BigInteger value) {
    this.r = value;
  }

  /**
   * Gets the value of the qual property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getQual() {
    return qual;
  }

  /**
   * Sets the value of the qual property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setQual(BigInteger value) {
    this.qual = value;
  }
}
