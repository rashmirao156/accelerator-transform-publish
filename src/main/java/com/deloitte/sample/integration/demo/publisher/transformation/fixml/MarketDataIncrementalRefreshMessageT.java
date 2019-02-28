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
 * MarketDataIncrementalRefresh can be found in Volume 3 of the specification
 *
 * <p>Java class for MarketDataIncrementalRefresh_message_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MarketDataIncrementalRefresh_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDataIncrementalRefreshElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDataIncrementalRefreshAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "MarketDataIncrementalRefresh_message_t",
  propOrder = {"applSeqCtrl", "inc", "rtg"}
)
public class MarketDataIncrementalRefreshMessageT extends AbstractMessageT {

  @XmlElement(name = "ApplSeqCtrl")
  protected ApplicationSequenceControlBlockT applSeqCtrl;

  @XmlElement(name = "Inc", required = true)
  protected List<MDIncGrpBlockT> inc;

  @XmlElement(name = "Rtg")
  protected List<RoutingGrpBlockT> rtg;

  @XmlAttribute(name = "MDBkTyp")
  protected BigInteger mdBkTyp;

  @XmlAttribute(name = "MDFeedTyp")
  protected String mdFeedTyp;

  @XmlAttribute(name = "MDSubFeedTyp")
  protected String mdSubFeedTyp;

  @XmlAttribute(name = "TrdDt")
  protected XMLGregorianCalendar trdDt;

  @XmlAttribute(name = "ReqID")
  protected String reqID;

  @XmlAttribute(name = "MktID")
  protected String mktID;

  @XmlAttribute(name = "MktSegID")
  protected String mktSegID;

  @XmlAttribute(name = "ApplQuDepth")
  protected BigInteger applQuDepth;

  @XmlAttribute(name = "ApplQuResolution")
  protected BigInteger applQuResolution;

  /**
   * Gets the value of the applSeqCtrl property.
   *
   * @return possible object is {@link ApplicationSequenceControlBlockT }
   */
  public ApplicationSequenceControlBlockT getApplSeqCtrl() {
    return applSeqCtrl;
  }

  /**
   * Sets the value of the applSeqCtrl property.
   *
   * @param value allowed object is {@link ApplicationSequenceControlBlockT }
   */
  public void setApplSeqCtrl(ApplicationSequenceControlBlockT value) {
    this.applSeqCtrl = value;
  }

  /**
   * Gets the value of the inc property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the inc property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getInc().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link MDIncGrpBlockT }
   */
  public List<MDIncGrpBlockT> getInc() {
    if (inc == null) {
      inc = new ArrayList<MDIncGrpBlockT>();
    }
    return this.inc;
  }

  /**
   * Gets the value of the rtg property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the rtg property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getRtg().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link RoutingGrpBlockT }
   */
  public List<RoutingGrpBlockT> getRtg() {
    if (rtg == null) {
      rtg = new ArrayList<RoutingGrpBlockT>();
    }
    return this.rtg;
  }

  /**
   * Gets the value of the mdBkTyp property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getMDBkTyp() {
    return mdBkTyp;
  }

  /**
   * Sets the value of the mdBkTyp property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setMDBkTyp(BigInteger value) {
    this.mdBkTyp = value;
  }

  /**
   * Gets the value of the mdFeedTyp property.
   *
   * @return possible object is {@link String }
   */
  public String getMDFeedTyp() {
    return mdFeedTyp;
  }

  /**
   * Sets the value of the mdFeedTyp property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMDFeedTyp(String value) {
    this.mdFeedTyp = value;
  }

  /**
   * Gets the value of the mdSubFeedTyp property.
   *
   * @return possible object is {@link String }
   */
  public String getMDSubFeedTyp() {
    return mdSubFeedTyp;
  }

  /**
   * Sets the value of the mdSubFeedTyp property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMDSubFeedTyp(String value) {
    this.mdSubFeedTyp = value;
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
   * Gets the value of the applQuDepth property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getApplQuDepth() {
    return applQuDepth;
  }

  /**
   * Sets the value of the applQuDepth property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setApplQuDepth(BigInteger value) {
    this.applQuDepth = value;
  }

  /**
   * Gets the value of the applQuResolution property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getApplQuResolution() {
    return applQuResolution;
  }

  /**
   * Sets the value of the applQuResolution property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setApplQuResolution(BigInteger value) {
    this.applQuResolution = value;
  }
}
