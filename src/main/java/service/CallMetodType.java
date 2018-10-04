
package service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallMetodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallMetodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sts"/>
 *     &lt;enumeration value="Vu"/>
 *     &lt;enumeration value="Photo"/>
 *     &lt;enumeration value="Pdf"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallMetodType")
@XmlEnum
public enum CallMetodType {

    @XmlEnumValue("Sts")
    STS("Sts"),
    @XmlEnumValue("Vu")
    VU("Vu"),
    @XmlEnumValue("Photo")
    PHOTO("Photo"),
    @XmlEnumValue("Pdf")
    PDF("Pdf");
    private final String value;

    CallMetodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallMetodType fromValue(String v) {
        for (CallMetodType c: CallMetodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
