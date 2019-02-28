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
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;

/**
 * Java class for SecTypesGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SecTypesGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecTypesGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecTypesGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecTypesGrp_Block_t")
public class SecTypesGrpBlockT {

  @XmlAttribute(name = "SecTyp")
  protected String secTyp;

  @XmlAttribute(name = "SubTyp")
  protected String subTyp;

  @XmlAttribute(name = "Prod")
  protected BigInteger prod;

  @XmlAttribute(name = "CFI")
  protected String cfi;

  @XmlAttribute(name = "TxnTm")
  protected XMLGregorianCalendar txnTm;

  /**
   * Gets the value of the secTyp property.
   *
   * @return possible object is {@link String }
   */
  public String getSecTyp() {
    return secTyp;
  }

  /**
   * Sets the value of the secTyp property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSecTyp(String value) {
    this.secTyp = value;
  }

  /**
   * Gets the value of the subTyp property.
   *
   * @return possible object is {@link String }
   */
  public String getSubTyp() {
    return subTyp;
  }

  /**
   * Sets the value of the subTyp property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSubTyp(String value) {
    this.subTyp = value;
  }

  /**
   * Gets the value of the prod property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getProd() {
    return prod;
  }

  /**
   * Sets the value of the prod property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setProd(BigInteger value) {
    this.prod = value;
  }

  /**
   * Gets the value of the cfi property.
   *
   * @return possible object is {@link String }
   */
  public String getCFI() {
    return cfi;
  }

  /**
   * Sets the value of the cfi property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCFI(String value) {
    this.cfi = value;
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
}