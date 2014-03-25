package test.client;

import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.phase.Phase;

import test.service.CustomerService;
import test.service.HelloWorld;
import test.service.MyInterceptor;


public final class Client {

	private Client(){
		
	}
	
	public static void visitSimplyServer(){
		JaxWsProxyFactoryBean factoryBean=new JaxWsProxyFactoryBean();
		factoryBean.setServiceClass(HelloWorld.class);
		factoryBean.setAddress("http://localhost:1234/hw");
		factoryBean.getInInterceptors().add(new LoggingOutInterceptor());
		factoryBean.getInInterceptors().add(new MyInterceptor());
		factoryBean.getOutInterceptors().add(new MyInterceptor(Phase.SEND));
		factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
		HelloWorld client=(HelloWorld) factoryBean.create();
		System.out.println(client.sayHi("111"));
	}
	
	public static void visitComplexServer(){
		JaxWsProxyFactoryBean factoryBean=new JaxWsProxyFactoryBean();
		factoryBean.setServiceClass(CustomerService.class);
		factoryBean.setAddress("http://localhost:1234/lcs");
		factoryBean.getInInterceptors().add(new LoggingOutInterceptor());
		factoryBean.getInInterceptors().add(new MyInterceptor());
		factoryBean.getOutInterceptors().add(new MyInterceptor(Phase.SEND));
		factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
		CustomerService client=(CustomerService) factoryBean.create();
		System.out.println(client.getUserByName(null).getName());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		visitComplexServer();
	}

}
