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
 * 2014-03-07T14:31:19.504+08:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://service.test/", name = "HelloWorld")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorld {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayHi", targetNamespace = "http://service.test/", className = "webserivce.client.SayHi")
    @WebMethod
    @ResponseWrapper(localName = "sayHiResponse", targetNamespace = "http://service.test/", className = "webserivce.client.SayHiResponse")
    public java.lang.String sayHi(
        @WebParam(name = "text", targetNamespace = "")
        java.lang.String text
    );
}
