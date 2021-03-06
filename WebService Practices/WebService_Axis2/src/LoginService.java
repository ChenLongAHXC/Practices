import org.apache.axis2.context.MessageContext;
import org.apache.axis2.context.ServiceContext;


public class LoginService {
	public boolean login(String username, String password){
		MessageContext context=MessageContext.getCurrentMessageContext();
		ServiceContext serviceContext=context.getServiceContext();
		if("abc".equals(username)&&"123".equals(password)){
			serviceContext.setProperty("username", username);
			serviceContext.setProperty("password", password);
			serviceContext.setProperty("login status", "login success");
			return true;
		}
		serviceContext.setProperty("login status", "login failure");
		return false;
	}
	
	public String getLoginMessage(){
		MessageContext context=MessageContext.getCurrentMessageContext();
		ServiceContext serviceContext=context.getServiceContext();
		return serviceContext.getProperty("login status")+" | "+ serviceContext.getProperty("username")+" | "+serviceContext.getProperty("password");
		
	}
}
