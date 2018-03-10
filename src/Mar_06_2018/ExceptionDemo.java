package Mar_06_2018;

public class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		try
		{
		int months = 0;
		int age = 57;
		int res = age/months;
		
		System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("Now the program ended");
		}
		
	}
	
		

}
