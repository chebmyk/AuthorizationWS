package com.mika.ws;

import com.mika.ws.exceptions.ResourceNotFoundException;
import com.mika.ws.model.Access;
import com.mika.ws.model.AuthObject;
import com.mika.ws.model.EntityAccess;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import java.util.*;

@WebService(serviceName = "AuthorizationService", portName = "AuthorizationServicePort",
        targetNamespace = "http://authorization.service.soap.mika.com/",
        endpointInterface = "com.mika.ws.AuthorizationService")
public final class AuthorizationServiceImpl implements AuthorizationService{

    private Set<AuthObject> accessMatrix = new HashSet<>();

    public AuthorizationServiceImpl() {
    }

    @PostConstruct
    private void init(){

        AuthObject admins = new AuthObject(Collections.singleton("ADMIN"));
        admins.getEntities().add(new EntityAccess("USER", EnumSet.of(Access.CREATE,Access.READ,Access.UPDATE,Access.DELETE)));
        accessMatrix.add(admins);

        AuthObject opr = new AuthObject(Collections.singleton("OPR"));
        opr.getEntities().add(new EntityAccess("USER", EnumSet.of(Access.CREATE,Access.READ,Access.UPDATE,Access.DELETE)));
        opr.getEntities().add(new EntityAccess("APPLICATION", EnumSet.of(Access.CREATE,Access.READ,Access.UPDATE,Access.DELETE)));
        accessMatrix.add(opr);
    }

    @Override
    public boolean canRead(String role, String entity) {
       return hasAccess(role,entity,Access.READ);
    }

    @Override
    public boolean canWrite(String role, String entity) {
        return hasAccess(role,entity,Access.UPDATE);
    }

    @Override
    public boolean canDelete(String role, String entity) {
        return hasAccess(role,entity,Access.DELETE);
    }

    @Override
    public boolean hasAccess(String role, String entity, Access action) {
        return accessMatrix.stream().filter(
                ao -> ao.getRoles().stream().anyMatch(r -> r.equals(role))
        ).flatMap(e -> e.getEntities().stream()
                .filter(a -> a.getEntity().equals(entity)).flatMap(ea -> ea.getAllowActions().stream())
        ).anyMatch(acc -> acc.equals(action));
    }

    @Override
    public AuthObject getAccessByRole(String role) throws ResourceNotFoundException {
        Optional<AuthObject> auth = accessMatrix.stream().filter(
                ao -> ao.getRoles().stream().anyMatch(r -> r.equals(role))
                ).findAny();
        return auth.orElseThrow(() -> new ResourceNotFoundException("Role [" + role + "] not found"));
    }


}
