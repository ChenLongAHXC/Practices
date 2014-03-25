package test.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;

import java_cup.runtime.lr_parser;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.apache.ws.axis2.EditUser;
import org.apache.ws.axis2.EditUserResponse;
import org.apache.ws.axis2.GetUserArray;
import org.apache.ws.axis2.GetUserArrayResponse;
import org.apache.ws.axis2.GetUserMap;
import org.apache.ws.axis2.GetUserMapResponse;
import org.apache.ws.axis2.GetUsers;
import org.apache.ws.axis2.GetUsersResponse;
import org.apache.ws.axis2.ManagerUserServiceStub;

public class HelloAxis2Client {

	private static void simplyWebService()throws AxisFault {
		RPCServiceClient client=new RPCServiceClient();
		Options options=client.getOptions();
		String address="http://localhost:8080/axis2/services/HelloAxis2";
		EndpointReference epf=new EndpointReference(address);
		options.setTo(epf);
		//
		QName qName=new QName("http://ws.apache.org/axis2","sayHello");
		Object[] result=client.invokeBlocking(qName, new Object[]{"jack"}, new Class[]{String.class});
		System.out.println(result[0]);
		//
		qName=new QName("http://ws.apache.org/axis2","getAge");
		result=client.invokeBlocking(qName, new Object[]{new Integer(11)}, new Class[]{Integer.class});
		System.out.println(result[0]);
	}
	
	private static void complexWebService()throws Exception {
		RPCServiceClient client=new RPCServiceClient();
		Options options=client.getOptions();
		String address="http://localhost:8080/axis2/services/ComplexTypeService";
		EndpointReference reference=new EndpointReference(address);
		options.setTo(reference);
		
		QName qName=new QName("http://ws.apache.org/axis2","uploadByte");
		File file=new File("C:\\long\\project\\WS\\testAxis2.txt");
		FileInputStream fis=new FileInputStream(file);
		int length=(int) file.length();
		byte[] bytes=new byte[length];
		fis.read(bytes);
		Object[] result=client.invokeBlocking(qName, new Object[]{bytes,length}, new Class[]{String.class});
		System.out.println(result[0]);
		
		//
		qName=new QName("http://ws.apache.org/axis2","getIntArray");
		result=client.invokeBlocking(qName, new Object[]{}, new Class[]{int[].class});
		int[] ints=(int[]) result[0];
		for(int i: ints){
			System.out.println(i);
		}
		//
		qName=new QName("http://ws.apache.org/axis2","getStringArray");
		result=client.invokeBlocking(qName, new Object[]{}, new Class[]{String[].class});
		String[] strings=(String[]) result[0];
		for(String i: strings){
			System.out.println(i);
		}
		
		//
		qName=new QName("http://ws.apache.org/axis2","getUser");
		result=client.invokeBlocking(qName, new Object[]{}, new Class[]{User.class});
		System.out.println(result[0]);
	}
	
	//
	private static void testAxisAutomaticalGenerate() throws Exception{
		ManagerUserServiceStub stub=new ManagerUserServiceStub("http://localhost:8080/axis2/services/ManagerUserService");
		System.out.println("-----------调用 user bean-----------");
		//调用 user bean
		EditUser editUser=new EditUser();
		data.xsd.User user=new data.xsd.User();
		user.setAddress("address");
		user.setEmail("email");
		user.setId(1);
		user.setName("name");
		editUser.setArgs0(user);
		EditUserResponse response=stub.editUser(editUser);
		user=response.get_return();
		System.out.println(user);
		System.out.println("-----------user数组模式-----------");
		//user数组模式
		GetUserArray array=new GetUserArray();
		array.setArgs0(10);
		GetUserArrayResponse arrayResponse=stub.getUserArray(array);
		data.xsd.User [] userArray=arrayResponse.get_return();
		for(data.xsd.User user2: userArray){
			System.out.println(user2);
		}

		//Map User模式                              不支持
//		System.out.println("-----------Map User模式-----------");
//		GetUserMap userMap=new GetUserMap();
//		userMap.setArgs0(5);
//		GetUserMapResponse mapResponse=stub.getUserMap(userMap);
//		int[] maps=mapResponse.get_return();
//		for(int i:maps){
//			System.out.println(i);
//		}

		//List User模式
		System.out.println("-----------List User模式-----------");
		GetUsers getUsers=new GetUsers();
		getUsers.setArgs0(5);
		GetUsersResponse usersResponse=stub.getUsers(getUsers);
		data.xsd.User [] userList=usersResponse.get_return();
		for(data.xsd.User user2: userList){
			System.out.println(user2);
		}
	}
	
	private static void testWebServiceSession() throws Exception{
		RPCServiceClient client=new RPCServiceClient();
		Options options=client.getOptions();
		EndpointReference reference=new EndpointReference("http://localhost:8080/axis2/services/LoginService");
		options.setTo(reference);
		
		QName qName=new QName("http://ws.apache.org/axis2", "login");
		Object[] result=client.invokeBlocking(qName, new Object[]{"abc","123"}, new Class[]{boolean.class});
		System.out.println(result[0]);
		
		//
		qName=new QName("http://ws.apache.org/axis2", "getLoginMessage");
		result=client.invokeBlocking(qName, new Object[]{}, new Class[]{String.class});
		System.out.println(result[0]);
	}
	
	private static void testApplicationSessionService()throws Exception{
		RPCServiceClient client=new RPCServiceClient();
		Options options=client.getOptions();
		EndpointReference reference=new EndpointReference("http://localhost:8080/axis2/services/LoginSessionService");
		options.setTo(reference);
		
		QName qName=new QName("http://service.test", "login");
		Object[] result=client.invokeBlocking(qName, new Object[]{"abc","123"}, new Class[]{boolean.class});
		System.out.println(result[0]);
		
		qName=new QName("http://service.test", "getLoginMessage");
		result=client.invokeBlocking(qName, new Object[]{}, new Class[]{String.class});
		System.out.println(result[0]);
		
		//another web service
		reference=new EndpointReference("http://localhost:8080/axis2/services/SearchSessionService");
		options.setTo(reference);
		qName=new QName("http://service.test", "findSessionMessage");
		result=client.invokeBlocking(qName, new Object[]{"username1"}, new Class[]{String.class});
		System.out.println(result[0]);
		
	}
	/**
	 * @param args
	 * @throws AxisFault 
	 */
	public static void main(String[] args) throws Exception {
//		simplyWebService();
//		complexWebService();
//		testAxisAutomaticalGenerate();
//		testWebServiceSession();
		testApplicationSessionService();
	}

}


























