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
 * Java class for LegComplexEventScheduleGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LegComplexEventScheduleGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegComplexEventScheduleGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegComplexEventScheduleGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegComplexEventScheduleGrp_Block_t")
public class LegComplexEventScheduleGrpBlockT {

  @XmlAttribute(name = "StartDt")
  protected XMLGregorianCalendar startDt;

  @XmlAttribute(name = "EndDt")
  protected XMLGregorianCalendar endDt;

  @XmlAttribute(name = "FreqPeriod")
  protected BigInteger freqPeriod;

  @XmlAttribute(name = "FreqUnit")
  protected ProtectionTermEventUnitEnumT freqUnit;

  @XmlAttribute(name = "Roll")
  protected String roll;

  /**
   * Gets the value of the startDt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getStartDt() {
    return startDt;
  }

  /**
   * Sets the value of the startDt property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setStartDt(XMLGregorianCalendar value) {
    this.startDt = value;
  }

  /**
   * Gets the value of the endDt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getEndDt() {
    return endDt;
  }

  /**
   * Sets the value of the endDt property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setEndDt(XMLGregorianCalendar value) {
    this.endDt = value;
  }

  /**
   * Gets the value of the freqPeriod property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getFreqPeriod() {
    return freqPeriod;
  }

  /**
   * Sets the value of the freqPeriod property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setFreqPeriod(BigInteger value) {
    this.freqPeriod = value;
  }

  /**
   * Gets the value of the freqUnit property.
   *
   * @return possible object is {@link ProtectionTermEventUnitEnumT }
   */
  public ProtectionTermEventUnitEnumT getFreqUnit() {
    return freqUnit;
  }

  /**
   * Sets the value of the freqUnit property.
   *
   * @param value allowed object is {@link ProtectionTermEventUnitEnumT }
   */
  public void setFreqUnit(ProtectionTermEventUnitEnumT value) {
    this.freqUnit = value;
  }

  /**
   * Gets the value of the roll property.
   *
   * @return possible object is {@link String }
   */
  public String getRoll() {
    return roll;
  }

  /**
   * Sets the value of the roll property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRoll(String value) {
    this.roll = value;
  }
}
