package com.mika.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "AutObject")
public class AuthObject {

    @XmlElement
    private Set<String> roles;
    @XmlElement
    private Set<EntityAccess> entities = new HashSet<>();


    public AuthObject() {
    }

    public AuthObject(Set<String> roles) {
        this.roles = roles;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public Set<EntityAccess> getEntities() {
        return entities;
    }

    public void setEntities(Set<EntityAccess> entities) {
        this.entities = entities;
    }

    @Override
    public String toString() {
        return "AuthObject{" +
                "roles=" + roles +
                ", entityAccess=" + entities +
                '}';
    }
}
