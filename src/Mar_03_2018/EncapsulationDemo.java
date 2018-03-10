package Mar_03_2018;

class Employee
{
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

public class EncapsulationDemo 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.setPassword("meet@123");
		System.out.println(e.getPassword());
	}
}
