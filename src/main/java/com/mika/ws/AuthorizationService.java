package com.mika.ws;


import com.mika.ws.exceptions.ResourceNotFoundException;
import com.mika.ws.model.Access;
import com.mika.ws.model.AuthObject;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://authorization.service.soap.mika.com/")
public interface AuthorizationService {

    @RequestWrapper(localName = "canRead", targetNamespace = "http://authorization.service.soap.mika.com/", className = "auth.ws.service.CanReadRequest")
    @WebMethod(action = "urn:canRead")
    @ResponseWrapper(localName = "CanReadResponse", targetNamespace = "http://authorization.service.soap.mika.com/", className = "auth.ws.service.CanReadResponse")
    boolean canRead(@WebParam(name = "role") String role, @WebParam(name = "entity") String entity);

    @RequestWrapper(localName = "canWrite", targetNamespace = "http://authorization.service.soap.mika.com/", className = "auth.ws.service.CanWriteRequest")
    @WebMethod(action = "urn:canWrite")
    @ResponseWrapper(localName = "CanWriteResponse", targetNamespace = "http://authorization.service.soap.mika.com/", className = "auth.ws.service.CanWriteResponse")
    boolean canWrite(@WebParam(name = "role") String role, @WebParam(name = "entity") String entity);

    @RequestWrapper(localName = "canDelete", targetNamespace = "http://authorization.service.soap.mika.com/", className = "auth.ws.service.CanDeleteRequest")
    @WebMethod(action = "urn:canDelete")
    @ResponseWrapper(localName = "CanDeleteResponse", targetNamespace = "http://authorization.service.soap.mika.com/", className = "auth.ws.service.CanDeleteResponse")
    boolean canDelete(@WebParam(name = "role") String role, @WebParam(name = "entity") String entity);

    @RequestWrapper(localName = "hasAccess", targetNamespace = "http://authorization.service.soap.mika.com/", className = "auth.ws.service.HasAccessRequest")
    @WebMethod(action = "urn:hasAccess")
    @ResponseWrapper(localName = "HasAccessResponse", targetNamespace = "http://authorization.service.soap.mika.com/", className = "auth.ws.service.HasAccessResponse")
    boolean hasAccess(@WebParam(name = "role") String role, @WebParam(name = "entity") String entity, @WebParam(name = "action") Access action);

    @WebResult(name = "AuthObject")
    @RequestWrapper(localName = "getAccessByRole", targetNamespace = "http://authorization.service.soap.mika.com/", className = "auth.ws.service.GetAccessByRoleRequest")
    @WebMethod(action = "urn:getAccessByRole")
    @ResponseWrapper(localName = "GetAccessByRoleResponse", targetNamespace = "http://authorization.service.soap.mika.com/", className = "auth.ws.service.GetAccessByRoleResponse")
    AuthObject getAccessByRole(@WebParam(name = "role") String role) throws ResourceNotFoundException;

}

