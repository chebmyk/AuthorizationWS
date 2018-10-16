
package com.mika.soap.service.authorization;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mika.soap.service.authorization package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AutObject_QNAME = new QName("http://authorization.service.soap.mika.com/", "AutObject");
    private final static QName _CanDeleteResponse_QNAME = new QName("http://authorization.service.soap.mika.com/", "CanDeleteResponse");
    private final static QName _CanReadResponse_QNAME = new QName("http://authorization.service.soap.mika.com/", "CanReadResponse");
    private final static QName _CanWriteResponse_QNAME = new QName("http://authorization.service.soap.mika.com/", "CanWriteResponse");
    private final static QName _GetAccessByRoleResponse_QNAME = new QName("http://authorization.service.soap.mika.com/", "GetAccessByRoleResponse");
    private final static QName _HasAccessResponse_QNAME = new QName("http://authorization.service.soap.mika.com/", "HasAccessResponse");
    private final static QName _CanDelete_QNAME = new QName("http://authorization.service.soap.mika.com/", "canDelete");
    private final static QName _CanRead_QNAME = new QName("http://authorization.service.soap.mika.com/", "canRead");
    private final static QName _CanWrite_QNAME = new QName("http://authorization.service.soap.mika.com/", "canWrite");
    private final static QName _GetAccessByRole_QNAME = new QName("http://authorization.service.soap.mika.com/", "getAccessByRole");
    private final static QName _HasAccess_QNAME = new QName("http://authorization.service.soap.mika.com/", "hasAccess");
    private final static QName _ResourceNotFound_QNAME = new QName("http://authorization.service.soap.mika.com/", "ResourceNotFound");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mika.soap.service.authorization
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthObject }
     * 
     */
    public AuthObject createAuthObject() {
        return new AuthObject();
    }

    /**
     * Create an instance of {@link CanDeleteResponse }
     * 
     */
    public CanDeleteResponse createCanDeleteResponse() {
        return new CanDeleteResponse();
    }

    /**
     * Create an instance of {@link CanReadResponse }
     * 
     */
    public CanReadResponse createCanReadResponse() {
        return new CanReadResponse();
    }

    /**
     * Create an instance of {@link CanWriteResponse }
     * 
     */
    public CanWriteResponse createCanWriteResponse() {
        return new CanWriteResponse();
    }

    /**
     * Create an instance of {@link GetAccessByRoleResponse }
     * 
     */
    public GetAccessByRoleResponse createGetAccessByRoleResponse() {
        return new GetAccessByRoleResponse();
    }

    /**
     * Create an instance of {@link HasAccessResponse }
     * 
     */
    public HasAccessResponse createHasAccessResponse() {
        return new HasAccessResponse();
    }

    /**
     * Create an instance of {@link CanDelete }
     * 
     */
    public CanDelete createCanDelete() {
        return new CanDelete();
    }

    /**
     * Create an instance of {@link CanRead }
     * 
     */
    public CanRead createCanRead() {
        return new CanRead();
    }

    /**
     * Create an instance of {@link CanWrite }
     * 
     */
    public CanWrite createCanWrite() {
        return new CanWrite();
    }

    /**
     * Create an instance of {@link GetAccessByRole }
     * 
     */
    public GetAccessByRole createGetAccessByRole() {
        return new GetAccessByRole();
    }

    /**
     * Create an instance of {@link HasAccess }
     * 
     */
    public HasAccess createHasAccess() {
        return new HasAccess();
    }

    /**
     * Create an instance of {@link ResourceNotFound }
     * 
     */
    public ResourceNotFound createResourceNotFound() {
        return new ResourceNotFound();
    }

    /**
     * Create an instance of {@link EntityAccess }
     * 
     */
    public EntityAccess createEntityAccess() {
        return new EntityAccess();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authorization.service.soap.mika.com/", name = "AutObject")
    public JAXBElement<AuthObject> createAutObject(AuthObject value) {
        return new JAXBElement<AuthObject>(_AutObject_QNAME, AuthObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanDeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authorization.service.soap.mika.com/", name = "CanDeleteResponse")
    public JAXBElement<CanDeleteResponse> createCanDeleteResponse(CanDeleteResponse value) {
        return new JAXBElement<CanDeleteResponse>(_CanDeleteResponse_QNAME, CanDeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanReadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authorization.service.soap.mika.com/", name = "CanReadResponse")
    public JAXBElement<CanReadResponse> createCanReadResponse(CanReadResponse value) {
        return new JAXBElement<CanReadResponse>(_CanReadResponse_QNAME, CanReadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanWriteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authorization.service.soap.mika.com/", name = "CanWriteResponse")
    public JAXBElement<CanWriteResponse> createCanWriteResponse(CanWriteResponse value) {
        return new JAXBElement<CanWriteResponse>(_CanWriteResponse_QNAME, CanWriteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccessByRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authorization.service.soap.mika.com/", name = "GetAccessByRoleResponse")
    public JAXBElement<GetAccessByRoleResponse> createGetAccessByRoleResponse(GetAccessByRoleResponse value) {
        return new JAXBElement<GetAccessByRoleResponse>(_GetAccessByRoleResponse_QNAME, GetAccessByRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasAccessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authorization.service.soap.mika.com/", name = "HasAccessResponse")
    public JAXBElement<HasAccessResponse> createHasAccessResponse(HasAccessResponse value) {
        return new JAXBElement<HasAccessResponse>(_HasAccessResponse_QNAME, HasAccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanDelete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authorization.service.soap.mika.com/", name = "canDelete")
    public JAXBElement<CanDelete> createCanDelete(CanDelete value) {
        return new JAXBElement<CanDelete>(_CanDelete_QNAME, CanDelete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanRead }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authorization.service.soap.mika.com/", name = "canRead")
    public JAXBElement<CanRead> createCanRead(CanRead value) {
        return new JAXBElement<CanRead>(_CanRead_QNAME, CanRead.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanWrite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authorization.service.soap.mika.com/", name = "canWrite")
    public JAXBElement<CanWrite> createCanWrite(CanWrite value) {
        return new JAXBElement<CanWrite>(_CanWrite_QNAME, CanWrite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccessByRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authorization.service.soap.mika.com/", name = "getAccessByRole")
    public JAXBElement<GetAccessByRole> createGetAccessByRole(GetAccessByRole value) {
        return new JAXBElement<GetAccessByRole>(_GetAccessByRole_QNAME, GetAccessByRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasAccess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authorization.service.soap.mika.com/", name = "hasAccess")
    public JAXBElement<HasAccess> createHasAccess(HasAccess value) {
        return new JAXBElement<HasAccess>(_HasAccess_QNAME, HasAccess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceNotFound }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authorization.service.soap.mika.com/", name = "ResourceNotFound")
    public JAXBElement<ResourceNotFound> createResourceNotFound(ResourceNotFound value) {
        return new JAXBElement<ResourceNotFound>(_ResourceNotFound_QNAME, ResourceNotFound.class, null, value);
    }

}
