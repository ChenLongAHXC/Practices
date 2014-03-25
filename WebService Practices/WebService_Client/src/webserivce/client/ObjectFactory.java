
package webserivce.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webserivce.client package. 
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

    private final static QName _GetUserByName_QNAME = new QName("http://service.test/", "getUserByName");
    private final static QName _GetUserByNameResponse_QNAME = new QName("http://service.test/", "getUserByNameResponse");
    private final static QName _NoSuchCustomerType_QNAME = new QName("http://service.test/", "NoSuchCustomerType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webserivce.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserByNameResponse }
     * 
     */
    public GetUserByNameResponse createGetUserByNameResponse() {
        return new GetUserByNameResponse();
    }

    /**
     * Create an instance of {@link GetUserByName }
     * 
     */
    public GetUserByName createGetUserByName() {
        return new GetUserByName();
    }

    /**
     * Create an instance of {@link NoSuchCustomerType }
     * 
     */
    public NoSuchCustomerType createNoSuchCustomerType() {
        return new NoSuchCustomerType();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.test/", name = "getUserByName")
    public JAXBElement<GetUserByName> createGetUserByName(GetUserByName value) {
        return new JAXBElement<GetUserByName>(_GetUserByName_QNAME, GetUserByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.test/", name = "getUserByNameResponse")
    public JAXBElement<GetUserByNameResponse> createGetUserByNameResponse(GetUserByNameResponse value) {
        return new JAXBElement<GetUserByNameResponse>(_GetUserByNameResponse_QNAME, GetUserByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoSuchCustomerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.test/", name = "NoSuchCustomerType")
    public JAXBElement<NoSuchCustomerType> createNoSuchCustomerType(NoSuchCustomerType value) {
        return new JAXBElement<NoSuchCustomerType>(_NoSuchCustomerType_QNAME, NoSuchCustomerType.class, null, value);
    }

}
