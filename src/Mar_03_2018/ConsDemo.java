package Mar_03_2018;

class cons
{
	public  cons()
	{
		System.out.println("This Method has no parameter");
	}
	public  cons(int x, int y) 
	{
		System.out.println(x+y);
	
	}
	
	public  cons(String name)
	{
		System.out.println(name);
		
	}
}



public class ConsDemo 
{
	public static void main(String[] args) 
	{
		cons c = new cons("Harry");
		new cons ("Tom");
/*		cons obj = new cons(5,6);
		cons third = new cons();*/
	}
}
