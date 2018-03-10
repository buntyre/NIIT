package Mar_05_2018;

interface Radio
{
	public void radioSystem();
}

interface Window extends Radio
{
	public void sunguardGlass();
}

public class maruti implements Car,  Window
{
	public void engCC()
	{
		System.out.println("1000cc");
	}
	public void radioSystem()
	{
		System.out.println("Sony");
	}
	public void sunguardGlass()
	{
		System.out.println("Saaint Gobain");
	}
	public static void main(String[] args) 
	{
		maruti m = new maruti(); 
		m.engCC();
		m.sunguardGlass();
		m.radioSystem();
	}
}
