package com.mika.ws.utils.xml;

import com.mika.ws.model.Access;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.stream.Collectors;

public class EnumSetXMLAdapter  extends XmlAdapter<String, EnumSet>
{
    @Override
    public String marshal(EnumSet in)
    {
        if ( in == null ) return null;
        return (String)in.stream().map(Object::toString).collect(Collectors.joining(","));
    }

    @Override
    public EnumSet unmarshal(String value){
        return Arrays.stream(value.split(",")).map(Access::valueOf).collect(Collectors.toCollection(() -> EnumSet.noneOf(Access.class)));
    }
}
