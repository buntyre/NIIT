package Mar_01_2018;

class accessFunc
{
	protected void clac()
	{
		System.out.println("This Method is a member of accessfunc");
	}
	public void clac1()
	{
		System.out.println("This Method is a member of accessfunc");
	}
}

public class accessDemo 
{
	public static void main(String[] args) 
	{
		accessFunc af = new accessFunc();
		af.clac();
		af.clac1();
		
	}
}
