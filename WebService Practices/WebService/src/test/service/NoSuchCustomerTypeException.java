package test.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.ws.WebFault;

@WebFault(name="NoSuchCustomerType")
@XmlAccessorType(XmlAccessType.FIELD)
public class NoSuchCustomerTypeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7946485611880400906L;
	
	String customerName;
}
