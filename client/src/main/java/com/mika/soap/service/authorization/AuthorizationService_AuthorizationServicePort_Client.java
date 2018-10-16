
package com.mika.soap.service.authorization;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-10-11T17:41:29.157+03:00
 * Generated source version: 3.2.6
 *
 */
public final class AuthorizationService_AuthorizationServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://authorization.service.soap.mika.com/", "AuthorizationServiceService");

    private AuthorizationService_AuthorizationServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AuthorizationServiceService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        AuthorizationServiceService ss = new AuthorizationServiceService(wsdlURL, SERVICE_NAME);
        AuthorizationService port = ss.getAuthorizationServicePort();

        {
        System.out.println("Invoking canDelete...");
        java.lang.String _canDelete_role = "";
        java.lang.String _canDelete_entity = "";
        boolean _canDelete__return = port.canDelete(_canDelete_role, _canDelete_entity);
        System.out.println("canDelete.result=" + _canDelete__return);


        }
        {
        System.out.println("Invoking canWrite...");
        java.lang.String _canWrite_role = "";
        java.lang.String _canWrite_entity = "";
        boolean _canWrite__return = port.canWrite(_canWrite_role, _canWrite_entity);
        System.out.println("canWrite.result=" + _canWrite__return);


        }
        {
        System.out.println("Invoking getAccessByRole...");
        java.lang.String _getAccessByRole_role = "";
        try {
            com.mika.soap.service.authorization.AuthObject _getAccessByRole__return = port.getAccessByRole(_getAccessByRole_role);
            System.out.println("getAccessByRole.result=" + _getAccessByRole__return);

        } catch (ResourceNotFoundException e) {
            System.out.println("Expected exception: ResourceNotFoundException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking canRead...");
        java.lang.String _canRead_role = "";
        java.lang.String _canRead_entity = "";
        boolean _canRead__return = port.canRead(_canRead_role, _canRead_entity);
        System.out.println("canRead.result=" + _canRead__return);


        }
        {
        System.out.println("Invoking hasAccess...");
        java.lang.String _hasAccess_role = "";
        java.lang.String _hasAccess_entity = "";
        com.mika.soap.service.authorization.Access _hasAccess_action = null;
        boolean _hasAccess__return = port.hasAccess(_hasAccess_role, _hasAccess_entity, _hasAccess_action);
        System.out.println("hasAccess.result=" + _hasAccess__return);


        }

        System.exit(0);
    }

}
