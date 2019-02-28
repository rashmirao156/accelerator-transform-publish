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
 * Java class for ProvisionCashSettlPaymentDates_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProvisionCashSettlPaymentDates_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ProvisionCashSettlPaymentDatesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ProvisionCashSettlPaymentDatesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "ProvisionCashSettlPaymentDates_Block_t",
  propOrder = {"bizCtr", "cashSettlPmtFixedDt"}
)
public class ProvisionCashSettlPaymentDatesBlockT {

  @XmlElement(name = "BizCtr")
  protected List<ProvisionCashSettlPaymentDateBusinessCenterGrpBlockT> bizCtr;

  @XmlElement(name = "CashSettlPmtFixedDt")
  protected List<ProvisionCashSettlPaymentFixedDateGrpBlockT> cashSettlPmtFixedDt;

  @XmlAttribute(name = "BizDayCnvtn")
  protected BigInteger bizDayCnvtn;

  @XmlAttribute(name = "Reltv")
  protected BigInteger reltv;

  @XmlAttribute(name = "OfstPeriod")
  protected BigInteger ofstPeriod;

  @XmlAttribute(name = "OfstUnit")
  protected PaymentStreamPaymentDateOffsetUnitEnumT ofstUnit;

  @XmlAttribute(name = "OfstDayTyp")
  protected BigInteger ofstDayTyp;

  @XmlAttribute(name = "DtFirst")
  protected XMLGregorianCalendar dtFirst;

  @XmlAttribute(name = "DtLast")
  protected XMLGregorianCalendar dtLast;

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
   * ProvisionCashSettlPaymentDateBusinessCenterGrpBlockT }
   */
  public List<ProvisionCashSettlPaymentDateBusinessCenterGrpBlockT> getBizCtr() {
    if (bizCtr == null) {
      bizCtr = new ArrayList<ProvisionCashSettlPaymentDateBusinessCenterGrpBlockT>();
    }
    return this.bizCtr;
  }

  /**
   * Gets the value of the cashSettlPmtFixedDt property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the cashSettlPmtFixedDt property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getCashSettlPmtFixedDt().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link
   * ProvisionCashSettlPaymentFixedDateGrpBlockT }
   */
  public List<ProvisionCashSettlPaymentFixedDateGrpBlockT> getCashSettlPmtFixedDt() {
    if (cashSettlPmtFixedDt == null) {
      cashSettlPmtFixedDt = new ArrayList<ProvisionCashSettlPaymentFixedDateGrpBlockT>();
    }
    return this.cashSettlPmtFixedDt;
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
   * Gets the value of the reltv property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getReltv() {
    return reltv;
  }

  /**
   * Sets the value of the reltv property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setReltv(BigInteger value) {
    this.reltv = value;
  }

  /**
   * Gets the value of the ofstPeriod property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getOfstPeriod() {
    return ofstPeriod;
  }

  /**
   * Sets the value of the ofstPeriod property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setOfstPeriod(BigInteger value) {
    this.ofstPeriod = value;
  }

  /**
   * Gets the value of the ofstUnit property.
   *
   * @return possible object is {@link PaymentStreamPaymentDateOffsetUnitEnumT }
   */
  public PaymentStreamPaymentDateOffsetUnitEnumT getOfstUnit() {
    return ofstUnit;
  }

  /**
   * Sets the value of the ofstUnit property.
   *
   * @param value allowed object is {@link PaymentStreamPaymentDateOffsetUnitEnumT }
   */
  public void setOfstUnit(PaymentStreamPaymentDateOffsetUnitEnumT value) {
    this.ofstUnit = value;
  }

  /**
   * Gets the value of the ofstDayTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getOfstDayTyp() {
    return ofstDayTyp;
  }

  /**
   * Sets the value of the ofstDayTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setOfstDayTyp(BigInteger value) {
    this.ofstDayTyp = value;
  }

  /**
   * Gets the value of the dtFirst property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getDtFirst() {
    return dtFirst;
  }

  /**
   * Sets the value of the dtFirst property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setDtFirst(XMLGregorianCalendar value) {
    this.dtFirst = value;
  }

  /**
   * Gets the value of the dtLast property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getDtLast() {
    return dtLast;
  }

  /**
   * Sets the value of the dtLast property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setDtLast(XMLGregorianCalendar value) {
    this.dtLast = value;
  }
}
