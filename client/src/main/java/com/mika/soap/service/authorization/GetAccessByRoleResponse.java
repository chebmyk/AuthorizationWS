
package com.mika.soap.service.authorization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for GetAccessByRoleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccessByRoleResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthObject" type="{http://authorization.service.soap.mika.com/}authObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccessByRoleResponse", propOrder = {
    "authObject"
})
public class GetAccessByRoleResponse {

    @XmlElement(name = "AuthObject")
    protected AuthObject authObject;

    /**
     * Gets the value of the authObject property.
     * 
     * @return
     *     possible object is
     *     {@link AuthObject }
     *     
     */
    public AuthObject getAuthObject() {
        return authObject;
    }

    /**
     * Sets the value of the authObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthObject }
     *     
     */
    public void setAuthObject(AuthObject value) {
        this.authObject = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
