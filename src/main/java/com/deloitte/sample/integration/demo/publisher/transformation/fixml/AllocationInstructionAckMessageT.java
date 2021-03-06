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
 * AllocationInstructionAck can be found in Volume 5 of the specification
 *
 * <p>Java class for AllocationInstructionAck_message_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AllocationInstructionAck_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AllocationInstructionAckElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AllocationInstructionAckAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "AllocationInstructionAck_message_t",
  propOrder = {"instrmt", "pty", "regTrdID", "allocAck"}
)
public class AllocationInstructionAckMessageT extends AbstractMessageT {

  @XmlElement(name = "Instrmt")
  protected InstrumentBlockT instrmt;

  @XmlElement(name = "Pty")
  protected List<PartiesBlockT> pty;

  @XmlElement(name = "RegTrdID")
  protected List<RegulatoryTradeIDGrpBlockT> regTrdID;

  @XmlElement(name = "AllocAck")
  protected List<AllocAckGrpBlockT> allocAck;

  @XmlAttribute(name = "ID", required = true)
  protected String id;

  @XmlAttribute(name = "ID2")
  protected String id2;

  @XmlAttribute(name = "GrpID")
  protected String grpID;

  @XmlAttribute(name = "FirmGrpID")
  protected String firmGrpID;

  @XmlAttribute(name = "AvgPxGrpID")
  protected String avgPxGrpID;

  @XmlAttribute(name = "TrdDt")
  protected XMLGregorianCalendar trdDt;

  @XmlAttribute(name = "TxnTm")
  protected XMLGregorianCalendar txnTm;

  @XmlAttribute(name = "Stat", required = true)
  protected BigInteger stat;

  @XmlAttribute(name = "RejCode")
  protected String rejCode;

  @XmlAttribute(name = "Typ")
  protected BigInteger typ;

  @XmlAttribute(name = "ImReqTyp")
  protected BigInteger imReqTyp;

  @XmlAttribute(name = "MtchStat")
  protected String mtchStat;

  @XmlAttribute(name = "Txt")
  protected String txt;

  @XmlAttribute(name = "EncTxtLen")
  protected BigInteger encTxtLen;

  @XmlAttribute(name = "EncTxt")
  protected byte[] encTxt;

  @XmlAttribute(name = "RejTxt")
  protected String rejTxt;

  @XmlAttribute(name = "EncRejTxtLen")
  protected BigInteger encRejTxtLen;

  @XmlAttribute(name = "EncRejTxt")
  protected byte[] encRejTxt;

  /**
   * Gets the value of the instrmt property.
   *
   * @return possible object is {@link InstrumentBlockT }
   */
  public InstrumentBlockT getInstrmt() {
    return instrmt;
  }

  /**
   * Sets the value of the instrmt property.
   *
   * @param value allowed object is {@link InstrumentBlockT }
   */
  public void setInstrmt(InstrumentBlockT value) {
    this.instrmt = value;
  }

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
   * <p>Objects of the following type(s) are allowed in the list {@link PartiesBlockT }
   */
  public List<PartiesBlockT> getPty() {
    if (pty == null) {
      pty = new ArrayList<PartiesBlockT>();
    }
    return this.pty;
  }

  /**
   * Gets the value of the regTrdID property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the regTrdID property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getRegTrdID().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link RegulatoryTradeIDGrpBlockT }
   */
  public List<RegulatoryTradeIDGrpBlockT> getRegTrdID() {
    if (regTrdID == null) {
      regTrdID = new ArrayList<RegulatoryTradeIDGrpBlockT>();
    }
    return this.regTrdID;
  }

  /**
   * Gets the value of the allocAck property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the allocAck property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getAllocAck().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link AllocAckGrpBlockT }
   */
  public List<AllocAckGrpBlockT> getAllocAck() {
    if (allocAck == null) {
      allocAck = new ArrayList<AllocAckGrpBlockT>();
    }
    return this.allocAck;
  }

  /**
   * Gets the value of the id property.
   *
   * @return possible object is {@link String }
   */
  public String getID() {
    return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is {@link String }
   */
  public void setID(String value) {
    this.id = value;
  }

  /**
   * Gets the value of the id2 property.
   *
   * @return possible object is {@link String }
   */
  public String getID2() {
    return id2;
  }

  /**
   * Sets the value of the id2 property.
   *
   * @param value allowed object is {@link String }
   */
  public void setID2(String value) {
    this.id2 = value;
  }

  /**
   * Gets the value of the grpID property.
   *
   * @return possible object is {@link String }
   */
  public String getGrpID() {
    return grpID;
  }

  /**
   * Sets the value of the grpID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setGrpID(String value) {
    this.grpID = value;
  }

  /**
   * Gets the value of the firmGrpID property.
   *
   * @return possible object is {@link String }
   */
  public String getFirmGrpID() {
    return firmGrpID;
  }

  /**
   * Sets the value of the firmGrpID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setFirmGrpID(String value) {
    this.firmGrpID = value;
  }

  /**
   * Gets the value of the avgPxGrpID property.
   *
   * @return possible object is {@link String }
   */
  public String getAvgPxGrpID() {
    return avgPxGrpID;
  }

  /**
   * Sets the value of the avgPxGrpID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setAvgPxGrpID(String value) {
    this.avgPxGrpID = value;
  }

  /**
   * Gets the value of the trdDt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getTrdDt() {
    return trdDt;
  }

  /**
   * Sets the value of the trdDt property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setTrdDt(XMLGregorianCalendar value) {
    this.trdDt = value;
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

  /**
   * Gets the value of the stat property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getStat() {
    return stat;
  }

  /**
   * Sets the value of the stat property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setStat(BigInteger value) {
    this.stat = value;
  }

  /**
   * Gets the value of the rejCode property.
   *
   * @return possible object is {@link String }
   */
  public String getRejCode() {
    return rejCode;
  }

  /**
   * Sets the value of the rejCode property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRejCode(String value) {
    this.rejCode = value;
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
   * Gets the value of the imReqTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getImReqTyp() {
    return imReqTyp;
  }

  /**
   * Sets the value of the imReqTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setImReqTyp(BigInteger value) {
    this.imReqTyp = value;
  }

  /**
   * Gets the value of the mtchStat property.
   *
   * @return possible object is {@link String }
   */
  public String getMtchStat() {
    return mtchStat;
  }

  /**
   * Sets the value of the mtchStat property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMtchStat(String value) {
    this.mtchStat = value;
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

  /**
   * Gets the value of the rejTxt property.
   *
   * @return possible object is {@link String }
   */
  public String getRejTxt() {
    return rejTxt;
  }

  /**
   * Sets the value of the rejTxt property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRejTxt(String value) {
    this.rejTxt = value;
  }

  /**
   * Gets the value of the encRejTxtLen property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getEncRejTxtLen() {
    return encRejTxtLen;
  }

  /**
   * Sets the value of the encRejTxtLen property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setEncRejTxtLen(BigInteger value) {
    this.encRejTxtLen = value;
  }

  /**
   * Gets the value of the encRejTxt property.
   *
   * @return possible object is byte[]
   */
  public byte[] getEncRejTxt() {
    return encRejTxt;
  }

  /**
   * Sets the value of the encRejTxt property.
   *
   * @param value allowed object is byte[]
   */
  public void setEncRejTxt(byte[] value) {
    this.encRejTxt = value;
  }
}
