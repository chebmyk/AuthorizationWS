package com.mika.ws;

import com.mika.ws.model.Access;
import com.mika.ws.model.AuthObject;
import com.mika.ws.model.EntityAccess;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class AuthorizationServiceImplTest {

    private Set<AuthObject> accessMatrix = new HashSet<>();

    @Before
    public void init(){

        AuthObject admins = new AuthObject(Collections.singleton("ADMIN"));
        admins.getEntities().add(new EntityAccess("USER", EnumSet.of(Access.CREATE,Access.READ,Access.UPDATE,Access.DELETE)));
        accessMatrix.add(admins);

        AuthObject opr = new AuthObject(Collections.singleton("OPR"));
        opr.getEntities().add(new EntityAccess("USER", EnumSet.of(Access.CREATE,Access.READ,Access.UPDATE,Access.DELETE)));
        opr.getEntities().add(new EntityAccess("APPLICATION", EnumSet.of(Access.CREATE,Access.READ,Access.UPDATE,Access.DELETE)));
        accessMatrix.add(opr);
    }

    @Test
    public void hasAccess() {
        String role = "OPR";
        String entity = "USER";
        Access action = Access.READ;
        boolean result = accessMatrix.stream().filter(
                ao -> ao.getRoles().stream().anyMatch(r -> r.equals(role))
        ).flatMap(e -> e.getEntities().stream()
                .filter(a -> a.getEntity().equals(entity)).flatMap(ea -> ea.getAllowActions().stream())
        ).anyMatch(acc -> acc.equals(action));
        assertTrue(result);
    }
}