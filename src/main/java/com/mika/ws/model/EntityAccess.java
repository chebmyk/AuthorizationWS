package com.mika.ws.model;

import com.mika.ws.utils.xml.EnumSetXMLAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.EnumSet;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
public class EntityAccess {
    @XmlElement
    private String entity;
    @XmlElement
    @XmlJavaTypeAdapter(EnumSetXMLAdapter.class)
    private EnumSet<Access> allowActions;

    public EntityAccess() {
    }

    public EntityAccess(String entity) {
        this.entity = entity;
    }

    public EntityAccess(String entity, EnumSet<Access> allowActions) {
        this.entity = entity;
        this.allowActions = allowActions;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public EnumSet<Access> getAllowActions() {
        return allowActions;
    }

    public void setAllowActions(EnumSet<Access> allowActions) {
        this.allowActions = allowActions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EntityAccess)) return false;
        EntityAccess that = (EntityAccess) o;
        return Objects.equals(entity, that.entity) &&
                Objects.equals(allowActions, that.allowActions);
    }

    @Override
    public int hashCode() {

        return Objects.hash(entity, allowActions);
    }

    @Override
    public String toString() {
        return "EntityAccess{" +
                "entity='" + entity + '\'' +
                ", allowActions=" + allowActions +
                '}';
    }
}
