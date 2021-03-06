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
 * Java class for PaymentSettlGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PaymentSettlGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PaymentSettlGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PaymentSettlGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "PaymentSettlGrp_Block_t",
  propOrder = {"pty"}
)
public class PaymentSettlGrpBlockT {

  @XmlElement(name = "Pty")
  protected List<PaymentSettlPartiesBlockT> pty;

  @XmlAttribute(name = "Amt")
  protected BigDecimal amt;

  @XmlAttribute(name = "Ccy")
  protected String ccy;

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
   * <p>Objects of the following type(s) are allowed in the list {@link PaymentSettlPartiesBlockT }
   */
  public List<PaymentSettlPartiesBlockT> getPty() {
    if (pty == null) {
      pty = new ArrayList<PaymentSettlPartiesBlockT>();
    }
    return this.pty;
  }

  /**
   * Gets the value of the amt property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getAmt() {
    return amt;
  }

  /**
   * Sets the value of the amt property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setAmt(BigDecimal value) {
    this.amt = value;
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
}
