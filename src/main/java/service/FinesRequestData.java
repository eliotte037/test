
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinesRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinesRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallMetod" type="{http://siv.api.FineService}CallMetodType"/>
 *         &lt;element name="CallParameters" type="{http://siv.api.FineService}ArrayOfCallParameter"/>
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecurityInfo" type="{http://siv.api.SecurityInfo}SecurityInfoData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinesRequestData", propOrder = {
    "callMetod",
    "callParameters",
    "requestID",
    "securityInfo"
})
public class FinesRequestData {

    @XmlElement(name = "CallMetod", required = true)
    @XmlSchemaType(name = "string")
    protected CallMetodType callMetod;
    @XmlElement(name = "CallParameters", required = true, nillable = true)
    protected ArrayOfCallParameter callParameters;
    @XmlElement(name = "RequestID", required = true, nillable = true)
    protected String requestID;
    @XmlElement(name = "SecurityInfo", required = true, nillable = true)
    protected SecurityInfoData securityInfo;

    /**
     * Gets the value of the callMetod property.
     * 
     * @return
     *     possible object is
     *     {@link CallMetodType }
     *     
     */
    public CallMetodType getCallMetod() {
        return callMetod;
    }

    /**
     * Sets the value of the callMetod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallMetodType }
     *     
     */
    public void setCallMetod(CallMetodType value) {
        this.callMetod = value;
    }

    /**
     * Gets the value of the callParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCallParameter }
     *     
     */
    public ArrayOfCallParameter getCallParameters() {
        return callParameters;
    }

    /**
     * Sets the value of the callParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCallParameter }
     *     
     */
    public void setCallParameters(ArrayOfCallParameter value) {
        this.callParameters = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the securityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInfoData }
     *     
     */
    public SecurityInfoData getSecurityInfo() {
        return securityInfo;
    }

    /**
     * Sets the value of the securityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInfoData }
     *     
     */
    public void setSecurityInfo(SecurityInfoData value) {
        this.securityInfo = value;
    }

}
