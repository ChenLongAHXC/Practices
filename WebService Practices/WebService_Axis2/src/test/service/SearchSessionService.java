package test.service;

import org.apache.axis2.context.MessageContext;
import org.apache.axis2.context.ServiceGroupContext;

public class SearchSessionService {
	public String findSessionMessage(String key){
		MessageContext messageContext=MessageContext.getCurrentMessageContext();
		ServiceGroupContext context=messageContext.getServiceGroupContext();
		if(context.getProperty(key)!=null){
			return "Find the message about the key: "+context.getProperty(key);
		}else {
			return "Cannot find the message about the key: "+context.getProperty(key);
		}
	}
}
