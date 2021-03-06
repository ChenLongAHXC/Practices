package webserivce.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-07T15:06:03.395+08:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://service.test/", name = "CustomerService")
@XmlSeeAlso({ObjectFactory.class})
public interface CustomerService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getUserByName", targetNamespace = "http://service.test/", className = "webserivce.client.GetUserByName")
    @WebMethod
    @ResponseWrapper(localName = "getUserByNameResponse", targetNamespace = "http://service.test/", className = "webserivce.client.GetUserByNameResponse")
    public webserivce.client.User getUserByName(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    ) throws NoSuchCustomerTypeException;
}
