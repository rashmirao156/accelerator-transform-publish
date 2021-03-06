//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.04 at 04:33:21 PM IST
//

package com.deloitte.sample.integration.demo.publisher.transformation.fixml;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Java class for PricingDateTime_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PricingDateTime_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PricingDateTimeElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PricingDateTimeAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "PricingDateTime_Block_t",
  propOrder = {"bizCtr"}
)
public class PricingDateTimeBlockT {

  @XmlElement(name = "BizCtr")
  protected List<PricingDateBusinessCenterGrpBlockT> bizCtr;

  @XmlAttribute(name = "DtUnadj")
  protected XMLGregorianCalendar dtUnadj;

  @XmlAttribute(name = "BizDayCnvtn")
  protected BigInteger bizDayCnvtn;

  @XmlAttribute(name = "Dt")
  protected XMLGregorianCalendar dt;

  @XmlAttribute(name = "Tm")
  protected XMLGregorianCalendar tm;

  @XmlAttribute(name = "TmBizCtr")
  protected String tmBizCtr;

  /**
   * Gets the value of the bizCtr property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the bizCtr property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getBizCtr().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link
   * PricingDateBusinessCenterGrpBlockT }
   */
  public List<PricingDateBusinessCenterGrpBlockT> getBizCtr() {
    if (bizCtr == null) {
      bizCtr = new ArrayList<PricingDateBusinessCenterGrpBlockT>();
    }
    return this.bizCtr;
  }

  /**
   * Gets the value of the dtUnadj property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getDtUnadj() {
    return dtUnadj;
  }

  /**
   * Sets the value of the dtUnadj property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setDtUnadj(XMLGregorianCalendar value) {
    this.dtUnadj = value;
  }

  /**
   * Gets the value of the bizDayCnvtn property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getBizDayCnvtn() {
    return bizDayCnvtn;
  }

  /**
   * Sets the value of the bizDayCnvtn property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setBizDayCnvtn(BigInteger value) {
    this.bizDayCnvtn = value;
  }

  /**
   * Gets the value of the dt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getDt() {
    return dt;
  }

  /**
   * Sets the value of the dt property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setDt(XMLGregorianCalendar value) {
    this.dt = value;
  }

  /**
   * Gets the value of the tm property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getTm() {
    return tm;
  }

  /**
   * Sets the value of the tm property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setTm(XMLGregorianCalendar value) {
    this.tm = value;
  }

  /**
   * Gets the value of the tmBizCtr property.
   *
   * @return possible object is {@link String }
   */
  public String getTmBizCtr() {
    return tmBizCtr;
  }

  /**
   * Sets the value of the tmBizCtr property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTmBizCtr(String value) {
    this.tmBizCtr = value;
  }
}
