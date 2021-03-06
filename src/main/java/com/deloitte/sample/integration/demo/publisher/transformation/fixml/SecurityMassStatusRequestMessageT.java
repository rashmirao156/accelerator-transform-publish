//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.04 at 04:33:21 PM IST
//

package com.deloitte.sample.integration.demo.publisher.transformation.fixml;

import javax.xml.bind.annotation.*;

/**
 * SecurityMassStatusRequest can be found in Volume 3 of the specification
 *
 * <p>Java class for SecurityMassStatusRequest_message_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SecurityMassStatusRequest_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityMassStatusRequestElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityMassStatusRequestAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "SecurityMassStatusRequest_message_t",
  propOrder = {"instrmtScope"}
)
public class SecurityMassStatusRequestMessageT extends AbstractMessageT {

  @XmlElement(name = "InstrmtScope")
  protected InstrumentScopeBlockT instrmtScope;

  @XmlAttribute(name = "StatReqID", required = true)
  protected String statReqID;

  @XmlAttribute(name = "SubReqTyp", required = true)
  protected String subReqTyp;

  @XmlAttribute(name = "ListID")
  protected String listID;

  @XmlAttribute(name = "MktID")
  protected String mktID;

  @XmlAttribute(name = "MktSegID")
  protected String mktSegID;

  @XmlAttribute(name = "SesID")
  protected String sesID;

  @XmlAttribute(name = "SesSub")
  protected String sesSub;

  /**
   * Gets the value of the instrmtScope property.
   *
   * @return possible object is {@link InstrumentScopeBlockT }
   */
  public InstrumentScopeBlockT getInstrmtScope() {
    return instrmtScope;
  }

  /**
   * Sets the value of the instrmtScope property.
   *
   * @param value allowed object is {@link InstrumentScopeBlockT }
   */
  public void setInstrmtScope(InstrumentScopeBlockT value) {
    this.instrmtScope = value;
  }

  /**
   * Gets the value of the statReqID property.
   *
   * @return possible object is {@link String }
   */
  public String getStatReqID() {
    return statReqID;
  }

  /**
   * Sets the value of the statReqID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setStatReqID(String value) {
    this.statReqID = value;
  }

  /**
   * Gets the value of the subReqTyp property.
   *
   * @return possible object is {@link String }
   */
  public String getSubReqTyp() {
    return subReqTyp;
  }

  /**
   * Sets the value of the subReqTyp property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSubReqTyp(String value) {
    this.subReqTyp = value;
  }

  /**
   * Gets the value of the listID property.
   *
   * @return possible object is {@link String }
   */
  public String getListID() {
    return listID;
  }

  /**
   * Sets the value of the listID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setListID(String value) {
    this.listID = value;
  }

  /**
   * Gets the value of the mktID property.
   *
   * @return possible object is {@link String }
   */
  public String getMktID() {
    return mktID;
  }

  /**
   * Sets the value of the mktID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMktID(String value) {
    this.mktID = value;
  }

  /**
   * Gets the value of the mktSegID property.
   *
   * @return possible object is {@link String }
   */
  public String getMktSegID() {
    return mktSegID;
  }

  /**
   * Sets the value of the mktSegID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMktSegID(String value) {
    this.mktSegID = value;
  }

  /**
   * Gets the value of the sesID property.
   *
   * @return possible object is {@link String }
   */
  public String getSesID() {
    return sesID;
  }

  /**
   * Sets the value of the sesID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSesID(String value) {
    this.sesID = value;
  }

  /**
   * Gets the value of the sesSub property.
   *
   * @return possible object is {@link String }
   */
  public String getSesSub() {
    return sesSub;
  }

  /**
   * Sets the value of the sesSub property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSesSub(String value) {
    this.sesSub = value;
  }
}
