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
import java.math.BigInteger;

/**
 * Java class for UnderlyingProvisionCashSettlQuoteSource_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UnderlyingProvisionCashSettlQuoteSource_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingProvisionCashSettlQuoteSourceElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingProvisionCashSettlQuoteSourceAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingProvisionCashSettlQuoteSource_Block_t")
public class UnderlyingProvisionCashSettlQuoteSourceBlockT {

  @XmlAttribute(name = "SettlQteSrc")
  protected BigInteger settlQteSrc;

  @XmlAttribute(name = "RefPg")
  protected String refPg;

  /**
   * Gets the value of the settlQteSrc property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getSettlQteSrc() {
    return settlQteSrc;
  }

  /**
   * Sets the value of the settlQteSrc property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setSettlQteSrc(BigInteger value) {
    this.settlQteSrc = value;
  }

  /**
   * Gets the value of the refPg property.
   *
   * @return possible object is {@link String }
   */
  public String getRefPg() {
    return refPg;
  }

  /**
   * Sets the value of the refPg property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRefPg(String value) {
    this.refPg = value;
  }
}
