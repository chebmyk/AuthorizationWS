package com.mika;

import com.mika.soap.service.authorization.AuthorizationService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class AuthorizationServiceClient {

    private URL wsdlURL;
    private Service service;

    public AuthorizationServiceClient(String wsdl) {
        try {
            this.wsdlURL = new URL(wsdl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        QName SERVICE_NAME = new QName("http://authorization.service.soap.mika.com/", "AuthorizationService");
        service = Service.create(wsdlURL, SERVICE_NAME);
    }


    public AuthorizationService getServicePort(){
       return service.getPort(AuthorizationService.class);
    }
}
