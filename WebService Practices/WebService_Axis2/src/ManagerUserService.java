import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import data.User;


public class ManagerUserService {
	public User editUser(User user){
		user.setId(new Random().nextInt(100));
		return user;
	}
	
	public List<User> getUsers(int j){
		List<User> list=new ArrayList<User>();
		if(j>0){
			for(int i=0;i<j;i++ ){
				User user=new User();
				user.setAddress("adress"+i);
				user.setEmail("email"+i);
				user.setName("name");
				user.setId(i);
				list.add(user);
			}
		}
		return list;
	}
	
	public Map<Integer, User> getUserMap(int j){
		Map<Integer, User> users=new HashMap<Integer, User>();
		if(j>0){
			for(int i=0;i<j;i++ ){
				User user=new User();
				user.setAddress("adress"+i);
				user.setEmail("email"+i);
				user.setName("name");
				user.setId(i);
				users.put(i, user);
			}
		}
		return users;
	}
	
	public User[] getUserArray(int j){
		if(j>0){
			User[] users=new User[j];
			for(int i=0;i<j;i++ ){
				User user=new User();
				user.setAddress("adress"+i);
				user.setEmail("email"+i);
				user.setName("name");
				user.setId(i);
				users[i]=user;
			}
			return users;
		}
		return null;
	}
}
