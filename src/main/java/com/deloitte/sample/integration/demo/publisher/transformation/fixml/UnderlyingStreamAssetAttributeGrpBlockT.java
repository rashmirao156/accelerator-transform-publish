//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.04 at 04:33:21 PM IST
//

package com.deloitte.sample.integration.demo.publisher.transformation.fixml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for UnderlyingStreamAssetAttributeGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UnderlyingStreamAssetAttributeGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingStreamAssetAttributeGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingStreamAssetAttributeGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingStreamAssetAttributeGrp_Block_t")
public class UnderlyingStreamAssetAttributeGrpBlockT {

  @XmlAttribute(name = "Typ")
  protected String typ;

  @XmlAttribute(name = "Val")
  protected String val;

  @XmlAttribute(name = "Lmt")
  protected String lmt;

  /**
   * Gets the value of the typ property.
   *
   * @return possible object is {@link String }
   */
  public String getTyp() {
    return typ;
  }

  /**
   * Sets the value of the typ property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTyp(String value) {
    this.typ = value;
  }

  /**
   * Gets the value of the val property.
   *
   * @return possible object is {@link String }
   */
  public String getVal() {
    return val;
  }

  /**
   * Sets the value of the val property.
   *
   * @param value allowed object is {@link String }
   */
  public void setVal(String value) {
    this.val = value;
  }

  /**
   * Gets the value of the lmt property.
   *
   * @return possible object is {@link String }
   */
  public String getLmt() {
    return lmt;
  }

  /**
   * Sets the value of the lmt property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLmt(String value) {
    this.lmt = value;
  }
}
