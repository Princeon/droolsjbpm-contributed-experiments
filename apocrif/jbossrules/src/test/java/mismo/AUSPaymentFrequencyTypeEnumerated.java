//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.05.21 at 09:59:49 PM BST 
//


package mismo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUS_PaymentFrequencyTypeEnumerated.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AUS_PaymentFrequencyTypeEnumerated">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Biweekly"/>
 *     &lt;enumeration value="Monthly"/>
 *     &lt;enumeration value="Annual"/>
 *     &lt;enumeration value="AtMaturity"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Quarterly"/>
 *     &lt;enumeration value="Semiannual"/>
 *     &lt;enumeration value="Semimonthly"/>
 *     &lt;enumeration value="Weekly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AUS_PaymentFrequencyTypeEnumerated")
@XmlEnum
public enum AUSPaymentFrequencyTypeEnumerated {

    @XmlEnumValue("Biweekly")
    BIWEEKLY("Biweekly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("Annual")
    ANNUAL("Annual"),
    @XmlEnumValue("AtMaturity")
    AT_MATURITY("AtMaturity"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Quarterly")
    QUARTERLY("Quarterly"),
    @XmlEnumValue("Semiannual")
    SEMIANNUAL("Semiannual"),
    @XmlEnumValue("Semimonthly")
    SEMIMONTHLY("Semimonthly"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly");
    private final String value;

    AUSPaymentFrequencyTypeEnumerated(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AUSPaymentFrequencyTypeEnumerated fromValue(String v) {
        for (AUSPaymentFrequencyTypeEnumerated c: AUSPaymentFrequencyTypeEnumerated.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}