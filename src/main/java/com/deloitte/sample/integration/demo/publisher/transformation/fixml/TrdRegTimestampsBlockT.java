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
 * Java class for TrdRegTimestamps_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TrdRegTimestamps_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TrdRegTimestampsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TrdRegTimestampsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrdRegTimestamps_Block_t")
public class TrdRegTimestampsBlockT {

  @XmlAttribute(name = "TS")
  protected XMLGregorianCalendar ts;

  @XmlAttribute(name = "Typ")
  protected BigInteger typ;

  @XmlAttribute(name = "Src")
  protected String src;

  @XmlAttribute(name = "DskTyp")
  protected DeskTypeEnumT dskTyp;

  @XmlAttribute(name = "DskTypSrc")
  protected BigInteger dskTypSrc;

  @XmlAttribute(name = "DskOrdHndlInst")
  protected String dskOrdHndlInst;

  @XmlAttribute(name = "InfoBrrID")
  protected String infoBrrID;

  /**
   * Gets the value of the ts property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getTS() {
    return ts;
  }

  /**
   * Sets the value of the ts property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setTS(XMLGregorianCalendar value) {
    this.ts = value;
  }

  /**
   * Gets the value of the typ property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getTyp() {
    return typ;
  }

  /**
   * Sets the value of the typ property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setTyp(BigInteger value) {
    this.typ = value;
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

  /**
   * Gets the value of the dskTyp property.
   *
   * @return possible object is {@link DeskTypeEnumT }
   */
  public DeskTypeEnumT getDskTyp() {
    return dskTyp;
  }

  /**
   * Sets the value of the dskTyp property.
   *
   * @param value allowed object is {@link DeskTypeEnumT }
   */
  public void setDskTyp(DeskTypeEnumT value) {
    this.dskTyp = value;
  }

  /**
   * Gets the value of the dskTypSrc property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getDskTypSrc() {
    return dskTypSrc;
  }

  /**
   * Sets the value of the dskTypSrc property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setDskTypSrc(BigInteger value) {
    this.dskTypSrc = value;
  }

  /**
   * Gets the value of the dskOrdHndlInst property.
   *
   * @return possible object is {@link String }
   */
  public String getDskOrdHndlInst() {
    return dskOrdHndlInst;
  }

  /**
   * Sets the value of the dskOrdHndlInst property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDskOrdHndlInst(String value) {
    this.dskOrdHndlInst = value;
  }

  /**
   * Gets the value of the infoBrrID property.
   *
   * @return possible object is {@link String }
   */
  public String getInfoBrrID() {
    return infoBrrID;
  }

  /**
   * Sets the value of the infoBrrID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setInfoBrrID(String value) {
    this.infoBrrID = value;
  }
}
