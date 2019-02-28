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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Java class for PriceMovementGrp_Block_t complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PriceMovementGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PriceMovementGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PriceMovementGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "PriceMovementGrp_Block_t",
  propOrder = {"pxMvmntValu", "clrAcctTyp"}
)
public class PriceMovementGrpBlockT {

  @XmlElement(name = "PxMvmntValu")
  protected List<PriceMovementValueGrpBlockT> pxMvmntValu;

  @XmlElement(name = "ClrAcctTyp")
  protected List<ClearingAccountTypeGrpBlockT> clrAcctTyp;

  /**
   * Gets the value of the pxMvmntValu property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the pxMvmntValu property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getPxMvmntValu().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link PriceMovementValueGrpBlockT
   * }
   */
  public List<PriceMovementValueGrpBlockT> getPxMvmntValu() {
    if (pxMvmntValu == null) {
      pxMvmntValu = new ArrayList<PriceMovementValueGrpBlockT>();
    }
    return this.pxMvmntValu;
  }

  /**
   * Gets the value of the clrAcctTyp property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the clrAcctTyp property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getClrAcctTyp().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link ClearingAccountTypeGrpBlockT
   * }
   */
  public List<ClearingAccountTypeGrpBlockT> getClrAcctTyp() {
    if (clrAcctTyp == null) {
      clrAcctTyp = new ArrayList<ClearingAccountTypeGrpBlockT>();
    }
    return this.clrAcctTyp;
  }
}
