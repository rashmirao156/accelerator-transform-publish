//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.04 at 04:33:21 PM IST
//

package com.deloitte.sample.integration.demo.publisher.transformation.fixml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for PaymentStubEndDateOffsetUnit_enum_t.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="PaymentStubEndDateOffsetUnit_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="Wk"/>
 *     &lt;enumeration value="Mo"/>
 *     &lt;enumeration value="Yr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "PaymentStubEndDateOffsetUnit_enum_t")
@XmlEnum
public enum PaymentStubEndDateOffsetUnitEnumT {
  D("D"),
  @XmlEnumValue("Wk")
  WK("Wk"),
  @XmlEnumValue("Mo")
  MO("Mo"),
  @XmlEnumValue("Yr")
  YR("Yr");
  private final String value;

  PaymentStubEndDateOffsetUnitEnumT(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static PaymentStubEndDateOffsetUnitEnumT fromValue(String v) {
    for (PaymentStubEndDateOffsetUnitEnumT c : PaymentStubEndDateOffsetUnitEnumT.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
