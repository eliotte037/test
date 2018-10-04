
package service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FineStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FineStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotPayed"/>
 *     &lt;enumeration value="Payed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FineStateType")
@XmlEnum
public enum FineStateType {

    @XmlEnumValue("NotPayed")
    NOT_PAYED("NotPayed"),
    @XmlEnumValue("Payed")
    PAYED("Payed");
    private final String value;

    FineStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FineStateType fromValue(String v) {
        for (FineStateType c: FineStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
