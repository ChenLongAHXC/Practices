package test.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface CustomerService {
	public User getUserByName(@WebParam(name="name")String name)throws NoSuchCustomerTypeException;
}
