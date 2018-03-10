package Mar_01_2018;

class myDemo// creating class
{
	public void add()// creating methods inside class
	{
		int a=9,b=5,c=0;
		
		c=a+b;
		System.out.println(c);
	}
}
public class OOPSdemo 
{

	public static void main(String[] args) 
	{
		//OOPSdemo obj = new OOPSdemo();
		myDemo obj = new myDemo();// creating object
		obj.add();//creating method
		accessFunc af1 = new accessFunc();
		af1.clac1();
	}
}
