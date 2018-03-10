package Mar_06_2018;

public class ThrowDemo 
{
	static void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("under age candidate");
		else
			System.out.println("Valid age");
	}
	public static void main(String[] args) 
	{
		//validate(12);
		validate(18);
	}
	
}
