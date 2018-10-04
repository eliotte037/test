
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetFinesResult" type="{http://siv.api.FineService}FinesResponseData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getFinesResult"
})
@XmlRootElement(name = "GetFinesResponse")
public class GetFinesResponse {

    @XmlElementRef(name = "GetFinesResult", namespace = "http://siv.api.FineService", type = JAXBElement.class, required = false)
    protected JAXBElement<FinesResponseData> getFinesResult;

    /**
     * Gets the value of the getFinesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FinesResponseData }{@code >}
     *     
     */
    public JAXBElement<FinesResponseData> getGetFinesResult() {
        return getFinesResult;
    }

    /**
     * Sets the value of the getFinesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FinesResponseData }{@code >}
     *     
     */
    public void setGetFinesResult(JAXBElement<FinesResponseData> value) {
        this.getFinesResult = value;
    }

}
