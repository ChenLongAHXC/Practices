
package webserivce.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-07T15:06:03.362+08:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "NoSuchCustomerType", targetNamespace = "http://service.test/")
public class NoSuchCustomerTypeException extends Exception {
    
    private webserivce.client.NoSuchCustomerType noSuchCustomerType;

    public NoSuchCustomerTypeException() {
        super();
    }
    
    public NoSuchCustomerTypeException(String message) {
        super(message);
    }
    
    public NoSuchCustomerTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchCustomerTypeException(String message, webserivce.client.NoSuchCustomerType noSuchCustomerType) {
        super(message);
        this.noSuchCustomerType = noSuchCustomerType;
    }

    public NoSuchCustomerTypeException(String message, webserivce.client.NoSuchCustomerType noSuchCustomerType, Throwable cause) {
        super(message, cause);
        this.noSuchCustomerType = noSuchCustomerType;
    }

    public webserivce.client.NoSuchCustomerType getFaultInfo() {
        return this.noSuchCustomerType;
    }
}
