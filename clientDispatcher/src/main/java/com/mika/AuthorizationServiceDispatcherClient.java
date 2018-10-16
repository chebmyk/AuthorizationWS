package com.mika;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

public class AuthorizationServiceDispatcherClient {

    private Service service;
    private Dispatch<SOAPMessage> dispatch;


    public AuthorizationServiceDispatcherClient(String wsdl, String targetNamespace, String serviceName, String servicePort) {
        try {
            URL wsdlURL = new URL(wsdl);
            this.service = Service.create(wsdlURL, new QName(targetNamespace, serviceName));
            this.dispatch = service.createDispatch(new QName(targetNamespace, servicePort), SOAPMessage.class, Service.Mode.MESSAGE);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public SOAPMessage createSOAPMessageRequest() throws SOAPException {
        BindingProvider bp = (BindingProvider) this.dispatch;
        MessageFactory factory = ((SOAPBinding) bp.getBinding()).getMessageFactory();
        return factory.createMessage();
    }

    public SOAPMessage invoke(SOAPMessage request) {
            return dispatch.invoke(request);
    }
}

