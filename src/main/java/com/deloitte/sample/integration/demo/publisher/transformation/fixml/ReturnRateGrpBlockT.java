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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Java class for ReturnRateGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ReturnRateGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ReturnRateGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ReturnRateGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "ReturnRateGrp_Block_t",
  propOrder = {"px", "fxCnvrsn", "infoSrc", "dt"}
)
public class ReturnRateGrpBlockT {

  @XmlElement(name = "Px")
  protected List<ReturnRatePriceGrpBlockT> px;

  @XmlElement(name = "FxCnvrsn")
  protected List<ReturnRateFXConversionGrpBlockT> fxCnvrsn;

  @XmlElement(name = "InfoSrc")
  protected List<ReturnRateInformationSourceGrpBlockT> infoSrc;

  @XmlElement(name = "Dt")
  protected List<ReturnRateDateGrpBlockT> dt;

  @XmlAttribute(name = "PxSeq")
  protected BigInteger pxSeq;

  @XmlAttribute(name = "CommBasis")
  protected String commBasis;

  @XmlAttribute(name = "CommAmt")
  protected BigDecimal commAmt;

  @XmlAttribute(name = "CommCcy")
  protected String commCcy;

  @XmlAttribute(name = "TotCommPerTrd")
  protected BigDecimal totCommPerTrd;

  @XmlAttribute(name = "DtrmnMeth")
  protected String dtrmnMeth;

  @XmlAttribute(name = "AmtReltv")
  protected BigInteger amtReltv;

  @XmlAttribute(name = "QteTyp")
  protected String qteTyp;

  @XmlAttribute(name = "QteUnit")
  protected String qteUnit;

  @XmlAttribute(name = "QteMeth")
  protected BigInteger qteMeth;

  @XmlAttribute(name = "QteCcy")
  protected String qteCcy;

  @XmlAttribute(name = "QteCcyTyp")
  protected String qteCcyTyp;

  @XmlAttribute(name = "QteTmTyp")
  protected BigInteger qteTmTyp;

  @XmlAttribute(name = "QteTm")
  protected XMLGregorianCalendar qteTm;

  @XmlAttribute(name = "QteDt")
  protected XMLGregorianCalendar qteDt;

  @XmlAttribute(name = "QteExpTm")
  protected XMLGregorianCalendar qteExpTm;

  @XmlAttribute(name = "QteBizCtr")
  protected String qteBizCtr;

  @XmlAttribute(name = "QteExch")
  protected String qteExch;

  @XmlAttribute(name = "QteModel")
  protected String qteModel;

  @XmlAttribute(name = "CshFlow")
  protected String cshFlow;

  @XmlAttribute(name = "ValTmTyp")
  protected BigInteger valTmTyp;

  @XmlAttribute(name = "ValTm")
  protected XMLGregorianCalendar valTm;

  @XmlAttribute(name = "ValTmBizCtr")
  protected String valTmBizCtr;

  @XmlAttribute(name = "ValPxOpt")
  protected BigInteger valPxOpt;

  @XmlAttribute(name = "FnlPxFallbck")
  protected BigInteger fnlPxFallbck;

  /**
   * Gets the value of the px property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the px property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getPx().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link ReturnRatePriceGrpBlockT }
   */
  public List<ReturnRatePriceGrpBlockT> getPx() {
    if (px == null) {
      px = new ArrayList<ReturnRatePriceGrpBlockT>();
    }
    return this.px;
  }

  /**
   * Gets the value of the fxCnvrsn property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the fxCnvrsn property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getFxCnvrsn().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link
   * ReturnRateFXConversionGrpBlockT }
   */
  public List<ReturnRateFXConversionGrpBlockT> getFxCnvrsn() {
    if (fxCnvrsn == null) {
      fxCnvrsn = new ArrayList<ReturnRateFXConversionGrpBlockT>();
    }
    return this.fxCnvrsn;
  }

  /**
   * Gets the value of the infoSrc property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the infoSrc property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getInfoSrc().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link
   * ReturnRateInformationSourceGrpBlockT }
   */
  public List<ReturnRateInformationSourceGrpBlockT> getInfoSrc() {
    if (infoSrc == null) {
      infoSrc = new ArrayList<ReturnRateInformationSourceGrpBlockT>();
    }
    return this.infoSrc;
  }

  /**
   * Gets the value of the dt property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the dt property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getDt().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link ReturnRateDateGrpBlockT }
   */
  public List<ReturnRateDateGrpBlockT> getDt() {
    if (dt == null) {
      dt = new ArrayList<ReturnRateDateGrpBlockT>();
    }
    return this.dt;
  }

  /**
   * Gets the value of the pxSeq property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getPxSeq() {
    return pxSeq;
  }

  /**
   * Sets the value of the pxSeq property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setPxSeq(BigInteger value) {
    this.pxSeq = value;
  }

  /**
   * Gets the value of the commBasis property.
   *
   * @return possible object is {@link String }
   */
  public String getCommBasis() {
    return commBasis;
  }

  /**
   * Sets the value of the commBasis property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCommBasis(String value) {
    this.commBasis = value;
  }

  /**
   * Gets the value of the commAmt property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getCommAmt() {
    return commAmt;
  }

  /**
   * Sets the value of the commAmt property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setCommAmt(BigDecimal value) {
    this.commAmt = value;
  }

  /**
   * Gets the value of the commCcy property.
   *
   * @return possible object is {@link String }
   */
  public String getCommCcy() {
    return commCcy;
  }

  /**
   * Sets the value of the commCcy property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCommCcy(String value) {
    this.commCcy = value;
  }

  /**
   * Gets the value of the totCommPerTrd property.
   *
   * @return possible object is {@link BigDecimal }
   */
  public BigDecimal getTotCommPerTrd() {
    return totCommPerTrd;
  }

  /**
   * Sets the value of the totCommPerTrd property.
   *
   * @param value allowed object is {@link BigDecimal }
   */
  public void setTotCommPerTrd(BigDecimal value) {
    this.totCommPerTrd = value;
  }

  /**
   * Gets the value of the dtrmnMeth property.
   *
   * @return possible object is {@link String }
   */
  public String getDtrmnMeth() {
    return dtrmnMeth;
  }

  /**
   * Sets the value of the dtrmnMeth property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDtrmnMeth(String value) {
    this.dtrmnMeth = value;
  }

  /**
   * Gets the value of the amtReltv property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getAmtReltv() {
    return amtReltv;
  }

  /**
   * Sets the value of the amtReltv property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setAmtReltv(BigInteger value) {
    this.amtReltv = value;
  }

  /**
   * Gets the value of the qteTyp property.
   *
   * @return possible object is {@link String }
   */
  public String getQteTyp() {
    return qteTyp;
  }

  /**
   * Sets the value of the qteTyp property.
   *
   * @param value allowed object is {@link String }
   */
  public void setQteTyp(String value) {
    this.qteTyp = value;
  }

  /**
   * Gets the value of the qteUnit property.
   *
   * @return possible object is {@link String }
   */
  public String getQteUnit() {
    return qteUnit;
  }

  /**
   * Sets the value of the qteUnit property.
   *
   * @param value allowed object is {@link String }
   */
  public void setQteUnit(String value) {
    this.qteUnit = value;
  }

  /**
   * Gets the value of the qteMeth property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getQteMeth() {
    return qteMeth;
  }

  /**
   * Sets the value of the qteMeth property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setQteMeth(BigInteger value) {
    this.qteMeth = value;
  }

  /**
   * Gets the value of the qteCcy property.
   *
   * @return possible object is {@link String }
   */
  public String getQteCcy() {
    return qteCcy;
  }

  /**
   * Sets the value of the qteCcy property.
   *
   * @param value allowed object is {@link String }
   */
  public void setQteCcy(String value) {
    this.qteCcy = value;
  }

  /**
   * Gets the value of the qteCcyTyp property.
   *
   * @return possible object is {@link String }
   */
  public String getQteCcyTyp() {
    return qteCcyTyp;
  }

  /**
   * Sets the value of the qteCcyTyp property.
   *
   * @param value allowed object is {@link String }
   */
  public void setQteCcyTyp(String value) {
    this.qteCcyTyp = value;
  }

  /**
   * Gets the value of the qteTmTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getQteTmTyp() {
    return qteTmTyp;
  }

  /**
   * Sets the value of the qteTmTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setQteTmTyp(BigInteger value) {
    this.qteTmTyp = value;
  }

  /**
   * Gets the value of the qteTm property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getQteTm() {
    return qteTm;
  }

  /**
   * Sets the value of the qteTm property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setQteTm(XMLGregorianCalendar value) {
    this.qteTm = value;
  }

  /**
   * Gets the value of the qteDt property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getQteDt() {
    return qteDt;
  }

  /**
   * Sets the value of the qteDt property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setQteDt(XMLGregorianCalendar value) {
    this.qteDt = value;
  }

  /**
   * Gets the value of the qteExpTm property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getQteExpTm() {
    return qteExpTm;
  }

  /**
   * Sets the value of the qteExpTm property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setQteExpTm(XMLGregorianCalendar value) {
    this.qteExpTm = value;
  }

  /**
   * Gets the value of the qteBizCtr property.
   *
   * @return possible object is {@link String }
   */
  public String getQteBizCtr() {
    return qteBizCtr;
  }

  /**
   * Sets the value of the qteBizCtr property.
   *
   * @param value allowed object is {@link String }
   */
  public void setQteBizCtr(String value) {
    this.qteBizCtr = value;
  }

  /**
   * Gets the value of the qteExch property.
   *
   * @return possible object is {@link String }
   */
  public String getQteExch() {
    return qteExch;
  }

  /**
   * Sets the value of the qteExch property.
   *
   * @param value allowed object is {@link String }
   */
  public void setQteExch(String value) {
    this.qteExch = value;
  }

  /**
   * Gets the value of the qteModel property.
   *
   * @return possible object is {@link String }
   */
  public String getQteModel() {
    return qteModel;
  }

  /**
   * Sets the value of the qteModel property.
   *
   * @param value allowed object is {@link String }
   */
  public void setQteModel(String value) {
    this.qteModel = value;
  }

  /**
   * Gets the value of the cshFlow property.
   *
   * @return possible object is {@link String }
   */
  public String getCshFlow() {
    return cshFlow;
  }

  /**
   * Sets the value of the cshFlow property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCshFlow(String value) {
    this.cshFlow = value;
  }

  /**
   * Gets the value of the valTmTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getValTmTyp() {
    return valTmTyp;
  }

  /**
   * Sets the value of the valTmTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setValTmTyp(BigInteger value) {
    this.valTmTyp = value;
  }

  /**
   * Gets the value of the valTm property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getValTm() {
    return valTm;
  }

  /**
   * Sets the value of the valTm property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setValTm(XMLGregorianCalendar value) {
    this.valTm = value;
  }

  /**
   * Gets the value of the valTmBizCtr property.
   *
   * @return possible object is {@link String }
   */
  public String getValTmBizCtr() {
    return valTmBizCtr;
  }

  /**
   * Sets the value of the valTmBizCtr property.
   *
   * @param value allowed object is {@link String }
   */
  public void setValTmBizCtr(String value) {
    this.valTmBizCtr = value;
  }

  /**
   * Gets the value of the valPxOpt property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getValPxOpt() {
    return valPxOpt;
  }

  /**
   * Sets the value of the valPxOpt property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setValPxOpt(BigInteger value) {
    this.valPxOpt = value;
  }

  /**
   * Gets the value of the fnlPxFallbck property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getFnlPxFallbck() {
    return fnlPxFallbck;
  }

  /**
   * Sets the value of the fnlPxFallbck property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setFnlPxFallbck(BigInteger value) {
    this.fnlPxFallbck = value;
  }
}
