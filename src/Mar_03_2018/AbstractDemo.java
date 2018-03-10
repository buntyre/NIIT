package Mar_03_2018;

abstract class Student
{
	public abstract void courseFee();
	
	public void display()
	{
		System.out.println("This is non abstract method");
	}
}
class computer extends Student
{
	public void courseFee()
	{
		System.out.println("This course has a fee of $150");
	}
}

public class AbstractDemo 
{
	public static void main(String[] args) 
	{
		computer s = new computer();
		s.courseFee();
		s.display();
	}
}
