
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FinesDataItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinesDataItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatDAP" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DatLishBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DatLishEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DatNar" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FineState" type="{http://siv.api.FineService}FineStateType" minOccurs="0"/>
 *         &lt;element name="FineSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FioNar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GRZNar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasPdf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasPhoto" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MestoDAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MestoNar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Odps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OdpsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StDAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipDAP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TipDAPName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VidNak" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VidNakName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinesDataItems", propOrder = {
    "dap",
    "datDAP",
    "datLishBegin",
    "datLishEnd",
    "datNar",
    "fineState",
    "fineSum",
    "fioNar",
    "grzNar",
    "hasPdf",
    "hasPhoto",
    "mestoDAP",
    "mestoNar",
    "odps",
    "odpsName",
    "stDAP",
    "tipDAP",
    "tipDAPName",
    "vidNak",
    "vidNakName"
})
public class FinesDataItems {

    @XmlElementRef(name = "DAP", namespace = "http://siv.api.FineService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dap;
    @XmlElement(name = "DatDAP")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datDAP;
    @XmlElement(name = "DatLishBegin")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datLishBegin;
    @XmlElement(name = "DatLishEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datLishEnd;
    @XmlElement(name = "DatNar")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datNar;
    @XmlElement(name = "FineState")
    @XmlSchemaType(name = "string")
    protected FineStateType fineState;
    @XmlElement(name = "FineSum")
    protected Double fineSum;
    @XmlElementRef(name = "FioNar", namespace = "http://siv.api.FineService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fioNar;
    @XmlElementRef(name = "GRZNar", namespace = "http://siv.api.FineService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> grzNar;
    @XmlElement(name = "HasPdf")
    protected Boolean hasPdf;
    @XmlElement(name = "HasPhoto")
    protected Boolean hasPhoto;
    @XmlElementRef(name = "MestoDAP", namespace = "http://siv.api.FineService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mestoDAP;
    @XmlElementRef(name = "MestoNar", namespace = "http://siv.api.FineService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mestoNar;
    @XmlElementRef(name = "Odps", namespace = "http://siv.api.FineService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> odps;
    @XmlElementRef(name = "OdpsName", namespace = "http://siv.api.FineService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> odpsName;
    @XmlElementRef(name = "StDAP", namespace = "http://siv.api.FineService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stDAP;
    @XmlElement(name = "TipDAP")
    protected Integer tipDAP;
    @XmlElementRef(name = "TipDAPName", namespace = "http://siv.api.FineService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipDAPName;
    @XmlElement(name = "VidNak")
    protected Integer vidNak;
    @XmlElementRef(name = "VidNakName", namespace = "http://siv.api.FineService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vidNakName;

    /**
     * Gets the value of the dap property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDAP() {
        return dap;
    }

    /**
     * Sets the value of the dap property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDAP(JAXBElement<String> value) {
        this.dap = value;
    }

    /**
     * Gets the value of the datDAP property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatDAP() {
        return datDAP;
    }

    /**
     * Sets the value of the datDAP property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatDAP(XMLGregorianCalendar value) {
        this.datDAP = value;
    }

    /**
     * Gets the value of the datLishBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatLishBegin() {
        return datLishBegin;
    }

    /**
     * Sets the value of the datLishBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatLishBegin(XMLGregorianCalendar value) {
        this.datLishBegin = value;
    }

    /**
     * Gets the value of the datLishEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatLishEnd() {
        return datLishEnd;
    }

    /**
     * Sets the value of the datLishEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatLishEnd(XMLGregorianCalendar value) {
        this.datLishEnd = value;
    }

    /**
     * Gets the value of the datNar property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatNar() {
        return datNar;
    }

    /**
     * Sets the value of the datNar property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatNar(XMLGregorianCalendar value) {
        this.datNar = value;
    }

    /**
     * Gets the value of the fineState property.
     * 
     * @return
     *     possible object is
     *     {@link FineStateType }
     *     
     */
    public FineStateType getFineState() {
        return fineState;
    }

    /**
     * Sets the value of the fineState property.
     * 
     * @param value
     *     allowed object is
     *     {@link FineStateType }
     *     
     */
    public void setFineState(FineStateType value) {
        this.fineState = value;
    }

    /**
     * Gets the value of the fineSum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFineSum() {
        return fineSum;
    }

    /**
     * Sets the value of the fineSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFineSum(Double value) {
        this.fineSum = value;
    }

    /**
     * Gets the value of the fioNar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFioNar() {
        return fioNar;
    }

    /**
     * Sets the value of the fioNar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFioNar(JAXBElement<String> value) {
        this.fioNar = value;
    }

    /**
     * Gets the value of the grzNar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGRZNar() {
        return grzNar;
    }

    /**
     * Sets the value of the grzNar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGRZNar(JAXBElement<String> value) {
        this.grzNar = value;
    }

    /**
     * Gets the value of the hasPdf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPdf() {
        return hasPdf;
    }

    /**
     * Sets the value of the hasPdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPdf(Boolean value) {
        this.hasPdf = value;
    }

    /**
     * Gets the value of the hasPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPhoto() {
        return hasPhoto;
    }

    /**
     * Sets the value of the hasPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPhoto(Boolean value) {
        this.hasPhoto = value;
    }

    /**
     * Gets the value of the mestoDAP property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMestoDAP() {
        return mestoDAP;
    }

    /**
     * Sets the value of the mestoDAP property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMestoDAP(JAXBElement<String> value) {
        this.mestoDAP = value;
    }

    /**
     * Gets the value of the mestoNar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMestoNar() {
        return mestoNar;
    }

    /**
     * Sets the value of the mestoNar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMestoNar(JAXBElement<String> value) {
        this.mestoNar = value;
    }

    /**
     * Gets the value of the odps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdps() {
        return odps;
    }

    /**
     * Sets the value of the odps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdps(JAXBElement<String> value) {
        this.odps = value;
    }

    /**
     * Gets the value of the odpsName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdpsName() {
        return odpsName;
    }

    /**
     * Sets the value of the odpsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdpsName(JAXBElement<String> value) {
        this.odpsName = value;
    }

    /**
     * Gets the value of the stDAP property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStDAP() {
        return stDAP;
    }

    /**
     * Sets the value of the stDAP property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStDAP(JAXBElement<String> value) {
        this.stDAP = value;
    }

    /**
     * Gets the value of the tipDAP property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipDAP() {
        return tipDAP;
    }

    /**
     * Sets the value of the tipDAP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipDAP(Integer value) {
        this.tipDAP = value;
    }

    /**
     * Gets the value of the tipDAPName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipDAPName() {
        return tipDAPName;
    }

    /**
     * Sets the value of the tipDAPName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipDAPName(JAXBElement<String> value) {
        this.tipDAPName = value;
    }

    /**
     * Gets the value of the vidNak property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVidNak() {
        return vidNak;
    }

    /**
     * Sets the value of the vidNak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVidNak(Integer value) {
        this.vidNak = value;
    }

    /**
     * Gets the value of the vidNakName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVidNakName() {
        return vidNakName;
    }

    /**
     * Sets the value of the vidNakName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVidNakName(JAXBElement<String> value) {
        this.vidNakName = value;
    }

}
