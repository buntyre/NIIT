package Mar_03_2018;

class calculator
{
	public void calc()
	{
		System.out.println("This Method has no parameter");
	}
	public int calc(int x, int y) 
	{
		//System.out.println(x+y);
		return x+y;
	}
	
	public void calc(String name)
	{
		System.out.println(name);
		
		System.out.println();
	}
}


public class PolyDemo 
{
	public static void main(String[] args) 
	{
		calculator c = new calculator();
		System.out.println(c.calc(4,7));
		c.calc();
		c.calc("Barry");
		
	}
}
