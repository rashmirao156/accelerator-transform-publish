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
 * Java class for DerivativeSecurityAltIDGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DerivativeSecurityAltIDGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DerivativeSecurityAltIDGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DerivativeSecurityAltIDGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeSecurityAltIDGrp_Block_t")
public class DerivativeSecurityAltIDGrpBlockT {

  @XmlAttribute(name = "ID")
  protected String id;

  @XmlAttribute(name = "Src")
  protected String src;

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
}
