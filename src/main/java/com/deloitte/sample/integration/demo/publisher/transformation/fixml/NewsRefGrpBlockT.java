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
 * Java class for NewsRefGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NewsRefGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NewsRefGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NewsRefGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewsRefGrp_Block_t")
public class NewsRefGrpBlockT {

  @XmlAttribute(name = "RefID")
  protected String refID;

  @XmlAttribute(name = "RefTyp")
  protected String refTyp;

  /**
   * Gets the value of the refID property.
   *
   * @return possible object is {@link String }
   */
  public String getRefID() {
    return refID;
  }

  /**
   * Sets the value of the refID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRefID(String value) {
    this.refID = value;
  }

  /**
   * Gets the value of the refTyp property.
   *
   * @return possible object is {@link String }
   */
  public String getRefTyp() {
    return refTyp;
  }

  /**
   * Sets the value of the refTyp property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRefTyp(String value) {
    this.refTyp = value;
  }
}
