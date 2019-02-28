//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.04 at 04:33:21 PM IST
//

package com.deloitte.sample.integration.demo.publisher.transformation.fixml;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * PartyDetailsDefinitionRequest can be found in Volume 3 of the specification
 *
 * <p>Java class for PartyDetailsDefinitionRequest_message_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PartyDetailsDefinitionRequest_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PartyDetailsDefinitionRequestElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PartyDetailsDefinitionRequestAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "PartyDetailsDefinitionRequest_message_t",
  propOrder = {"reqPty", "ptyDetlUpd"}
)
public class PartyDetailsDefinitionRequestMessageT extends AbstractMessageT {

  @XmlElement(name = "ReqPty")
  protected List<RequestingPartyGrpBlockT> reqPty;

  @XmlElement(name = "PtyDetlUpd", required = true)
  protected List<PartyDetailsUpdateGrpBlockT> ptyDetlUpd;

  @XmlAttribute(name = "ReqID", required = true)
  protected String reqID;

  @XmlAttribute(name = "Txt")
  protected String txt;

  @XmlAttribute(name = "EncTxtLen")
  protected BigInteger encTxtLen;

  @XmlAttribute(name = "EncTxt")
  protected byte[] encTxt;

  /**
   * Gets the value of the reqPty property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the reqPty property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getReqPty().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link RequestingPartyGrpBlockT }
   */
  public List<RequestingPartyGrpBlockT> getReqPty() {
    if (reqPty == null) {
      reqPty = new ArrayList<RequestingPartyGrpBlockT>();
    }
    return this.reqPty;
  }

  /**
   * Gets the value of the ptyDetlUpd property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the ptyDetlUpd property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getPtyDetlUpd().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link PartyDetailsUpdateGrpBlockT
   * }
   */
  public List<PartyDetailsUpdateGrpBlockT> getPtyDetlUpd() {
    if (ptyDetlUpd == null) {
      ptyDetlUpd = new ArrayList<PartyDetailsUpdateGrpBlockT>();
    }
    return this.ptyDetlUpd;
  }

  /**
   * Gets the value of the reqID property.
   *
   * @return possible object is {@link String }
   */
  public String getReqID() {
    return reqID;
  }

  /**
   * Sets the value of the reqID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setReqID(String value) {
    this.reqID = value;
  }

  /**
   * Gets the value of the txt property.
   *
   * @return possible object is {@link String }
   */
  public String getTxt() {
    return txt;
  }

  /**
   * Sets the value of the txt property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTxt(String value) {
    this.txt = value;
  }

  /**
   * Gets the value of the encTxtLen property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getEncTxtLen() {
    return encTxtLen;
  }

  /**
   * Sets the value of the encTxtLen property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setEncTxtLen(BigInteger value) {
    this.encTxtLen = value;
  }

  /**
   * Gets the value of the encTxt property.
   *
   * @return possible object is byte[]
   */
  public byte[] getEncTxt() {
    return encTxt;
  }

  /**
   * Sets the value of the encTxt property.
   *
   * @param value allowed object is byte[]
   */
  public void setEncTxt(byte[] value) {
    this.encTxt = value;
  }
}
