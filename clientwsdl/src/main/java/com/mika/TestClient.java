package com.mika;


import com.mika.soap.service.authorization.AuthorizationServiceService;
import com.mika.soap.service.authorization.ResourceNotFoundException;

public class TestClient {

    public static void main(String[] args) {
        try {
            AuthorizationServiceService service = new AuthorizationServiceService();
            System.out.println(service.getAuthorizationServicePort().getAccessByRole("ADMIN"));
        }  catch (ResourceNotFoundException e) {
            e.printStackTrace();
        }
    }
}
