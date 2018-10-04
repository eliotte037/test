
package service;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hello package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _SecurityInfoData_QNAME = new QName("http://siv.api.SecurityInfo", "SecurityInfoData");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfCallParameter_QNAME = new QName("http://siv.api.FineService", "ArrayOfCallParameter");
    private final static QName _CallParameter_QNAME = new QName("http://siv.api.FineService", "CallParameter");
    private final static QName _CallMetodType_QNAME = new QName("http://siv.api.FineService", "CallMetodType");
    private final static QName _ArrayOfanyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfanyType");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _FinesRequestData_QNAME = new QName("http://siv.api.FineService", "FinesRequestData");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _FinesDataItems_QNAME = new QName("http://siv.api.FineService", "FinesDataItems");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _FinesResponseData_QNAME = new QName("http://siv.api.FineService", "FinesResponseData");
    private final static QName _CallAttributeName_QNAME = new QName("http://siv.api.FineService", "CallAttributeName");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _FineStateType_QNAME = new QName("http://siv.api.FineService", "FineStateType");
    private final static QName _GetFinesResponseGetFinesResult_QNAME = new QName("http://siv.api.FineService", "GetFinesResult");
    private final static QName _FinesDataItemsDAP_QNAME = new QName("http://siv.api.FineService", "DAP");
    private final static QName _FinesDataItemsOdpsName_QNAME = new QName("http://siv.api.FineService", "OdpsName");
    private final static QName _FinesDataItemsGRZNar_QNAME = new QName("http://siv.api.FineService", "GRZNar");
    private final static QName _FinesDataItemsStDAP_QNAME = new QName("http://siv.api.FineService", "StDAP");
    private final static QName _FinesDataItemsVidNakName_QNAME = new QName("http://siv.api.FineService", "VidNakName");
    private final static QName _FinesDataItemsMestoNar_QNAME = new QName("http://siv.api.FineService", "MestoNar");
    private final static QName _FinesDataItemsMestoDAP_QNAME = new QName("http://siv.api.FineService", "MestoDAP");
    private final static QName _FinesDataItemsTipDAPName_QNAME = new QName("http://siv.api.FineService", "TipDAPName");
    private final static QName _FinesDataItemsFioNar_QNAME = new QName("http://siv.api.FineService", "FioNar");
    private final static QName _FinesDataItemsOdps_QNAME = new QName("http://siv.api.FineService", "Odps");
    private final static QName _FinesResponseDataMessage_QNAME = new QName("http://siv.api.FineService", "Message");
    private final static QName _FinesResponseDataRequestID_QNAME = new QName("http://siv.api.FineService", "RequestID");
    private final static QName _FinesResponseDataItems_QNAME = new QName("http://siv.api.FineService", "Items");
    private final static QName _GetFinesFinesData_QNAME = new QName("http://siv.api.FineService", "finesData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hello
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfanyType }
     * 
     */
    public ArrayOfanyType createArrayOfanyType() {
        return new ArrayOfanyType();
    }

    /**
     * Create an instance of {@link SecurityInfoData }
     * 
     */
    public SecurityInfoData createSecurityInfoData() {
        return new SecurityInfoData();
    }

    /**
     * Create an instance of {@link FinesResponseData }
     * 
     */
    public FinesResponseData createFinesResponseData() {
        return new FinesResponseData();
    }

    /**
     * Create an instance of {@link GetFines }
     * 
     */
    public GetFines createGetFines() {
        return new GetFines();
    }

    /**
     * Create an instance of {@link FinesRequestData }
     * 
     */
    public FinesRequestData createFinesRequestData() {
        return new FinesRequestData();
    }

    /**
     * Create an instance of {@link GetFinesResponse }
     * 
     */
    public GetFinesResponse createGetFinesResponse() {
        return new GetFinesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCallParameter }
     * 
     */
    public ArrayOfCallParameter createArrayOfCallParameter() {
        return new ArrayOfCallParameter();
    }

    /**
     * Create an instance of {@link CallParameter }
     * 
     */
    public CallParameter createCallParameter() {
        return new CallParameter();
    }

    /**
     * Create an instance of {@link FinesDataItems }
     * 
     */
    public FinesDataItems createFinesDataItems() {
        return new FinesDataItems();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityInfoData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.SecurityInfo", name = "SecurityInfoData")
    public JAXBElement<SecurityInfoData> createSecurityInfoData(SecurityInfoData value) {
        return new JAXBElement<SecurityInfoData>(_SecurityInfoData_QNAME, SecurityInfoData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCallParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "ArrayOfCallParameter")
    public JAXBElement<ArrayOfCallParameter> createArrayOfCallParameter(ArrayOfCallParameter value) {
        return new JAXBElement<ArrayOfCallParameter>(_ArrayOfCallParameter_QNAME, ArrayOfCallParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "CallParameter")
    public JAXBElement<CallParameter> createCallParameter(CallParameter value) {
        return new JAXBElement<CallParameter>(_CallParameter_QNAME, CallParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallMetodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "CallMetodType")
    public JAXBElement<CallMetodType> createCallMetodType(CallMetodType value) {
        return new JAXBElement<CallMetodType>(_CallMetodType_QNAME, CallMetodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfanyType")
    public JAXBElement<ArrayOfanyType> createArrayOfanyType(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_ArrayOfanyType_QNAME, ArrayOfanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinesRequestData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "FinesRequestData")
    public JAXBElement<FinesRequestData> createFinesRequestData(FinesRequestData value) {
        return new JAXBElement<FinesRequestData>(_FinesRequestData_QNAME, FinesRequestData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinesDataItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "FinesDataItems")
    public JAXBElement<FinesDataItems> createFinesDataItems(FinesDataItems value) {
        return new JAXBElement<FinesDataItems>(_FinesDataItems_QNAME, FinesDataItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinesResponseData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "FinesResponseData")
    public JAXBElement<FinesResponseData> createFinesResponseData(FinesResponseData value) {
        return new JAXBElement<FinesResponseData>(_FinesResponseData_QNAME, FinesResponseData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallAttributeName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "CallAttributeName")
    public JAXBElement<CallAttributeName> createCallAttributeName(CallAttributeName value) {
        return new JAXBElement<CallAttributeName>(_CallAttributeName_QNAME, CallAttributeName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FineStateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "FineStateType")
    public JAXBElement<FineStateType> createFineStateType(FineStateType value) {
        return new JAXBElement<FineStateType>(_FineStateType_QNAME, FineStateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinesResponseData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "GetFinesResult", scope = GetFinesResponse.class)
    public JAXBElement<FinesResponseData> createGetFinesResponseGetFinesResult(FinesResponseData value) {
        return new JAXBElement<FinesResponseData>(_GetFinesResponseGetFinesResult_QNAME, FinesResponseData.class, GetFinesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "DAP", scope = FinesDataItems.class)
    public JAXBElement<String> createFinesDataItemsDAP(String value) {
        return new JAXBElement<String>(_FinesDataItemsDAP_QNAME, String.class, FinesDataItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "OdpsName", scope = FinesDataItems.class)
    public JAXBElement<String> createFinesDataItemsOdpsName(String value) {
        return new JAXBElement<String>(_FinesDataItemsOdpsName_QNAME, String.class, FinesDataItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "GRZNar", scope = FinesDataItems.class)
    public JAXBElement<String> createFinesDataItemsGRZNar(String value) {
        return new JAXBElement<String>(_FinesDataItemsGRZNar_QNAME, String.class, FinesDataItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "StDAP", scope = FinesDataItems.class)
    public JAXBElement<String> createFinesDataItemsStDAP(String value) {
        return new JAXBElement<String>(_FinesDataItemsStDAP_QNAME, String.class, FinesDataItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "VidNakName", scope = FinesDataItems.class)
    public JAXBElement<String> createFinesDataItemsVidNakName(String value) {
        return new JAXBElement<String>(_FinesDataItemsVidNakName_QNAME, String.class, FinesDataItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "MestoNar", scope = FinesDataItems.class)
    public JAXBElement<String> createFinesDataItemsMestoNar(String value) {
        return new JAXBElement<String>(_FinesDataItemsMestoNar_QNAME, String.class, FinesDataItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "MestoDAP", scope = FinesDataItems.class)
    public JAXBElement<String> createFinesDataItemsMestoDAP(String value) {
        return new JAXBElement<String>(_FinesDataItemsMestoDAP_QNAME, String.class, FinesDataItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "TipDAPName", scope = FinesDataItems.class)
    public JAXBElement<String> createFinesDataItemsTipDAPName(String value) {
        return new JAXBElement<String>(_FinesDataItemsTipDAPName_QNAME, String.class, FinesDataItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "FioNar", scope = FinesDataItems.class)
    public JAXBElement<String> createFinesDataItemsFioNar(String value) {
        return new JAXBElement<String>(_FinesDataItemsFioNar_QNAME, String.class, FinesDataItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "Odps", scope = FinesDataItems.class)
    public JAXBElement<String> createFinesDataItemsOdps(String value) {
        return new JAXBElement<String>(_FinesDataItemsOdps_QNAME, String.class, FinesDataItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "Message", scope = FinesResponseData.class)
    public JAXBElement<String> createFinesResponseDataMessage(String value) {
        return new JAXBElement<String>(_FinesResponseDataMessage_QNAME, String.class, FinesResponseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "RequestID", scope = FinesResponseData.class)
    public JAXBElement<String> createFinesResponseDataRequestID(String value) {
        return new JAXBElement<String>(_FinesResponseDataRequestID_QNAME, String.class, FinesResponseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "Items", scope = FinesResponseData.class)
    public JAXBElement<ArrayOfanyType> createFinesResponseDataItems(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_FinesResponseDataItems_QNAME, ArrayOfanyType.class, FinesResponseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinesRequestData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siv.api.FineService", name = "finesData", scope = GetFines.class)
    public JAXBElement<FinesRequestData> createGetFinesFinesData(FinesRequestData value) {
        return new JAXBElement<FinesRequestData>(_GetFinesFinesData_QNAME, FinesRequestData.class, GetFines.class, value);
    }

}
