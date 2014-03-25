package test.service;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public User getUserByName(String name) throws NoSuchCustomerTypeException {
		User user=new User();
		if(name==null)
		{
			System.out.println("--null--");
			user.setName("NULL");
		}else if(name.length()<=4){
			System.out.println("--not null--");
			user.setName(name.toUpperCase());
		}else {
			throw new NoSuchCustomerTypeException();
		}
		return user;
	}

}
