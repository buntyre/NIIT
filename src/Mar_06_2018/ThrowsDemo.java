package Mar_06_2018;


class MyownException extends Exception
{
	public MyownException(String msg)
	{
		super(msg);
	}
}


public class ThrowsDemo 
{
	
		static void employeeAge(int age) throws MyownException
		{
			if(age < 18)
				throw new MyownException("Age is invalid");
			else
				System.out.println("Age valig");
		}
		public static void main(String[] args)
		{
			try
			{
				employeeAge(2);
			}
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}

	}
}
