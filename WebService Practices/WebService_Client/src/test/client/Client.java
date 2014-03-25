package test.client;

import webserivce.client.CustomerService;
import webserivce.client.CustomerServiceService;
import webserivce.client.HelloWorld;
import webserivce.client.HelloWorldService;
import webserivce.client.NoSuchCustomerTypeException;

public class Client {
	
	public static void visitSimplyServer(){
		HelloWorld helloWorld=(new HelloWorldService()).getHelloWorldPort();
		System.out.println(helloWorld.sayHi("111"));
	}
	
	public static void visitComplexServer() throws NoSuchCustomerTypeException{
		CustomerService customerService=(new CustomerServiceService()).getCustomerServicePort();
		System.out.println(customerService.getUserByName("abc").getName());
	}
	/**
	 * @param args
	 * @throws NoSuchCustomerTypeException 
	 */
	public static void main(String[] args) throws NoSuchCustomerTypeException {
//		visitSimplyServer();
		visitComplexServer();
	}

}
