
package service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallAttributeName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallAttributeName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sts"/>
 *     &lt;enumeration value="Vu"/>
 *     &lt;enumeration value="VuDate"/>
 *     &lt;enumeration value="Dap"/>
 *     &lt;enumeration value="Grz"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallAttributeName")
@XmlEnum
public enum CallAttributeName {

    @XmlEnumValue("Sts")
    STS("Sts"),
    @XmlEnumValue("Vu")
    VU("Vu"),
    @XmlEnumValue("VuDate")
    VU_DATE("VuDate"),
    @XmlEnumValue("Dap")
    DAP("Dap"),
    @XmlEnumValue("Grz")
    GRZ("Grz");
    private final String value;

    CallAttributeName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallAttributeName fromValue(String v) {
        for (CallAttributeName c: CallAttributeName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
