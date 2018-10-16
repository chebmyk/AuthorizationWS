package com.mika;


import javax.xml.namespace.QName;
import javax.xml.soap.*;

public class TestClient {
    private static final String WSDL_URL = "http://localhost:8081/ws/auth?wsdl";
    private static final String NAMESPACE = "http://authorization.service.soap.mika.com/";
    private static final String SERVICE_NAME = "AuthorizationService";
    private static final String SERVICE_PORT = "AuthorizationServicePort";

    public static void main(String[] args) {
        AuthorizationServiceDispatcherClient authService = new AuthorizationServiceDispatcherClient(
                WSDL_URL,
                NAMESPACE,
                SERVICE_NAME,
                SERVICE_PORT);
        try {
            SOAPMessage request = authService.createSOAPMessageRequest();
            QName payloadName = new QName(NAMESPACE, "canRead", "tns");
            SOAPBodyElement canRead = request.getSOAPBody().addBodyElement(payloadName);
            SOAPElement role = canRead.addChildElement("role");
            role.addTextNode("ADMIN");
            SOAPElement entity = canRead.addChildElement("entity");
            entity.addTextNode("USER");

            SOAPMessage response = authService.invoke(request);

            SOAPBody body = response.getSOAPBody();
            SOAPBodyElement bodyElement = (SOAPBodyElement) body.getChildElements(new QName(NAMESPACE, "CanReadResponse")).next();
            SOAPElement element = (SOAPElement) bodyElement.getChildElements(new QName("return")).next();
            System.out.println(element.getValue());

        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
