package com.mika.ws.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "ResourceNotFound")
public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
