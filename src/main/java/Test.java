import fineService.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;

public class Test {
    public static void main(String[] args) throws JAXBException {
        final IFineService_Service iFineService_service = new IFineService_Service();
        IFineService iFineService = iFineService_service.getBasicHttpBindingIFineService();

        FinesRequestData requestData = new FinesRequestData();
        requestData.setCallMetod(CallMetodType.VU);
        ArrayOfCallParameter arrayOfCallParameter = new ArrayOfCallParameter();
        CallParameter callParameter = new CallParameter();
        callParameter.setType(CallAttributeName.VU);
        callParameter.setValue("7721525605");
        arrayOfCallParameter.getCallParameter().add(callParameter);
        requestData.setCallParameters(arrayOfCallParameter);

        SecurityInfoData securityInfoData = new SecurityInfoData();
        securityInfoData.setNonce("");
        securityInfoData.setSystemid("");
        securityInfoData.setTimestamp("");
        securityInfoData.setToken("");
        requestData.setSecurityInfo(securityInfoData);

        FinesResponseData responseData = iFineService.getFines(requestData);

        JAXBContext jaxbContext = JAXBContext.newInstance("fineService");
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        QName name = new QName("FinesResponse", "FinesResponseData");
        JAXBElement<FinesResponseData> responseDataJAXBElement = new JAXBElement<>(name, FinesResponseData.class, responseData);
        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(responseDataJAXBElement, stringWriter);
        System.out.println(stringWriter.toString());

    }
}
