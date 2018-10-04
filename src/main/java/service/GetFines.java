
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
 *         &lt;element name="finesData" type="{http://siv.api.FineService}FinesRequestData" minOccurs="0"/>
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
    "finesData"
})
@XmlRootElement(name = "GetFines")
public class GetFines {

    @XmlElementRef(name = "finesData", namespace = "http://siv.api.FineService", type = JAXBElement.class, required = false)
    protected JAXBElement<FinesRequestData> finesData;

    /**
     * Gets the value of the finesData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FinesRequestData }{@code >}
     *     
     */
    public JAXBElement<FinesRequestData> getFinesData() {
        return finesData;
    }

    /**
     * Sets the value of the finesData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FinesRequestData }{@code >}
     *     
     */
    public void setFinesData(JAXBElement<FinesRequestData> value) {
        this.finesData = value;
    }

}
