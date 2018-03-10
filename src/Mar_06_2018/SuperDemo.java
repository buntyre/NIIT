package Mar_06_2018;


class parent
{
	int x = 90;
	
	public parent()
	{
		System.out.println("this is parent constructor");
	}
}

class child extends parent
{
	public child()
	{
		super();
	}
	public void show()
	{
		System.out.println(super.x);
	}
}

public class SuperDemo 
{
	public static void main(String[] args) 
	{
		child c = new child();
		c.show();
	}
}
