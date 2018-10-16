
package com.mika.soap.service.authorization;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-10-11T17:41:29.266+03:00
 * Generated source version: 3.2.6
 */

@WebFault(name = "ResourceNotFound", targetNamespace = "http://authorization.service.soap.mika.com/")
public class ResourceNotFoundException extends Exception {

    private com.mika.soap.service.authorization.ResourceNotFound resourceNotFound;

    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ResourceNotFoundException(String message, com.mika.soap.service.authorization.ResourceNotFound resourceNotFound) {
        super(message);
        this.resourceNotFound = resourceNotFound;
    }

    public ResourceNotFoundException(String message, com.mika.soap.service.authorization.ResourceNotFound resourceNotFound, java.lang.Throwable cause) {
        super(message, cause);
        this.resourceNotFound = resourceNotFound;
    }

    public com.mika.soap.service.authorization.ResourceNotFound getFaultInfo() {
        return this.resourceNotFound;
    }
}