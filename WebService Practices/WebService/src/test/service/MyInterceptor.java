package test.service;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class MyInterceptor extends AbstractPhaseInterceptor<Message>{

	public MyInterceptor(String phase) {
		super(phase);
	}
	public MyInterceptor(){
		this(Phase.RECEIVE);
	}
	@Override
	public void handleMessage(Message arg0) throws Fault {
		System.out.println("Hello, this is my interceptor.");
		
	}
	@Override
	public void handleFault(Message message) {
		System.out.println("ERROR");
	}

}
