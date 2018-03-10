package DAO;


public class DAOExample 
{
	public static void main(String[] args) 
	{
		CustomerDAO cd = new CustomerDAOImpl();// customerDAOImpl constructor is triggered
		for(Customer customer: cd.getAllCustomer())
		{
			System.out.println(customer.getId()+ " " + customer.getName());
		}
	}
}
