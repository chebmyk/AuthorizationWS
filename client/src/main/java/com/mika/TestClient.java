package com.mika;


import com.mika.soap.service.authorization.AuthorizationService;
import com.mika.soap.service.authorization.ResourceNotFoundException;

public class TestClient {

    public static void main(String[] args) {
        AuthorizationServiceClient service = new AuthorizationServiceClient("http://localhost:8081/ws/auth?wsdl");
        AuthorizationService authService =  service.getServicePort();
        try {
            System.out.println(authService.getAccessByRole("ADMIN"));
            System.out.println(authService.getAccessByRole("OPR"));
            System.out.println(authService.getAccessByRole("USER"));

        } catch (ResourceNotFoundException e) {
            e.printStackTrace();
        }

    }
}
