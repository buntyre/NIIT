package DAO;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl 
{
	List<Customer> custs;//cust object will show the list of names and ids
	
	public CustomerDAOImpl()
	{
		custs = new ArrayList<Customer>();
		Customer customer = new Customer(101, "Barry");//storing the data
		custs.add(customer);
		//sending the data to pojo constructor
		
		public List<Customer> getAllCustomer()
		{
			return custs;
		}
		
		public void updateCusts(Customer cust)
		{
			custs.get(cust.getId()).setName(cust.getName());
			System.out.println("Cust Id"+ cust.getId());
			System.out.println("Cust name"+ cust.getName());
		}
		public Customer getCust(int id)
		{
			
		}
	}
}
