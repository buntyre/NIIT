package Mar_01_2018;

class cons
{
	//public void method1() 
		cons()//Explicit
	{
		System.out.println("Hello World");
	}
		void method1()
		{
			System.out.println("This is not constructor");
		}
}

public class constructorDemi 
{
	public static void main(String[] args) 
	{
		cons cn = new cons();// default
		cn.method1();
	}
}
