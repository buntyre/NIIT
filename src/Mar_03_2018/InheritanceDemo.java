package Mar_03_2018;

class mammal
{
	public void cb()
	{
		System.out.println("Mammals give child birth");
	}
}

class cat extends mammal
{
	/*@Override
	public void cb()
	{
		System.out.println("Cats give child birth");
	}*/
	
	public void softpaw()
	{
		System.out.println("Cats have a soft paws");
	}
}
class lion extends cat
{
	/*public void cb()
	{
		System.out.println("Lion gives child birth");
		
	}*/
	public void softpaw()
	{
		System.out.println("Lions have soft paws");
	}
	public void mane()
	{
		System.out.println("lions have mane");
	}
}
public class InheritanceDemo 
{
	public static void main(String[] args) 
	{
		mammal m = new mammal();
		m.cb();
		
		lion l = new lion();
		l.cb();
		l.softpaw();
		l.mane();
		
	}
}
