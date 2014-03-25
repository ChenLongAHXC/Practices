package test.service;

import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.apache.cxf.phase.Phase;


public class ServerSimple {
	
	public ServerSimple(){
		
	}
	
	public static void launchSimpleServer(){
		System.out.println("Starting Server");
		HelloWorld helloWorld=new HelloWorldImpl();
		JaxWsServerFactoryBean factory=new JaxWsServerFactoryBean();
		factory.setServiceClass(HelloWorld.class);
		String address="http://localhost:9009/hw";
		factory.setAddress(address);
		factory.setServiceBean(helloWorld);
		factory.getInInterceptors().add(new LoggingOutInterceptor());
		factory.getInInterceptors().add(new MyInterceptor());
		factory.getOutInterceptors().add(new MyInterceptor(Phase.SEND));
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		factory.create();
	}
	
	public static void launchComplexServer(){
		System.out.println("Starting Server");
		CustomerService customerService=new CustomerServiceImpl();
		JaxWsServerFactoryBean factory=new JaxWsServerFactoryBean();
		factory.setServiceClass(CustomerService.class);
		String address="http://localhost:9008/lcs";
		factory.setAddress(address);
		factory.setServiceBean(customerService);
		factory.getInInterceptors().add(new LoggingOutInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		factory.create();
	}
	
	public static void main(String[] args)throws Exception {
//		launchSimpleServer();
		launchComplexServer();
//		System.out.println("Server ready...");
//		Thread.sleep(60000);
//		System.out.println("Server exiting...");
//		System.exit(0);
	}
}
