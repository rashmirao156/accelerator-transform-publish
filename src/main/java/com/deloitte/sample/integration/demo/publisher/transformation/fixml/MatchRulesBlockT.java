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
 * Java class for MatchRules_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MatchRules_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MatchRulesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MatchRulesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchRules_Block_t")
public class MatchRulesBlockT {

  @XmlAttribute(name = "MtchAlgo")
  protected String mtchAlgo;

  @XmlAttribute(name = "MtchTyp")
  protected String mtchTyp;

  @XmlAttribute(name = "MtchRuleProdCmplx")
  protected String mtchRuleProdCmplx;

  @XmlAttribute(name = "CustPri")
  protected BigInteger custPri;

  /**
   * Gets the value of the mtchAlgo property.
   *
   * @return possible object is {@link String }
   */
  public String getMtchAlgo() {
    return mtchAlgo;
  }

  /**
   * Sets the value of the mtchAlgo property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMtchAlgo(String value) {
    this.mtchAlgo = value;
  }

  /**
   * Gets the value of the mtchTyp property.
   *
   * @return possible object is {@link String }
   */
  public String getMtchTyp() {
    return mtchTyp;
  }

  /**
   * Sets the value of the mtchTyp property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMtchTyp(String value) {
    this.mtchTyp = value;
  }

  /**
   * Gets the value of the mtchRuleProdCmplx property.
   *
   * @return possible object is {@link String }
   */
  public String getMtchRuleProdCmplx() {
    return mtchRuleProdCmplx;
  }

  /**
   * Sets the value of the mtchRuleProdCmplx property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMtchRuleProdCmplx(String value) {
    this.mtchRuleProdCmplx = value;
  }

  /**
   * Gets the value of the custPri property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getCustPri() {
    return custPri;
  }

  /**
   * Sets the value of the custPri property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setCustPri(BigInteger value) {
    this.custPri = value;
  }
}
