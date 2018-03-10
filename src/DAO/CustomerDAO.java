package DAO;

import java.util.List;

public interface CustomerDAO 
{
	public List<Customer> getAllCustomer();// method to display the list of name
	public void updateCust(Customer cust);//method to update the names and ids
	public Customer getCust(int id);//method to fetch
}
