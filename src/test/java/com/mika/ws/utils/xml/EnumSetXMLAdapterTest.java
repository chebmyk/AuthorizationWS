package com.mika.ws.utils.xml;

import com.mika.ws.model.Access;
import com.mika.ws.model.AuthObject;
import com.mika.ws.model.EntityAccess;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.Collections;
import java.util.EnumSet;

import static org.junit.Assert.*;

public class EnumSetXMLAdapterTest {

    @Test
    public void adapetr_marshal() {
        EnumSetXMLAdapter adapter = new EnumSetXMLAdapter();
        System.out.println(adapter.marshal(EnumSet.allOf(Access.class)));
    }

    @Test
    public void adapter_unmarshal() {
        String input = "CREATE,READ,UPDATE,DELETE";
        EnumSetXMLAdapter adapter = new EnumSetXMLAdapter();
        System.out.println(adapter.unmarshal(input));
    }


    @Test
    public void marshal() throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(AuthObject.class);

        AuthObject admins = new AuthObject(Collections.singleton("ADMIN"));
        admins.getEntities().add(new EntityAccess("USER", EnumSet.of(Access.CREATE,Access.READ,Access.UPDATE,Access.DELETE)));

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(admins, System.out);
    }

}