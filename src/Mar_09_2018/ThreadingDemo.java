package Mar_09_2018;

public class ThreadingDemo 
{
	public static void main(String[] args) 
	{
		Thread m = Thread.currentThread();
		System.out.println("ThreadName: "+ m.getName());
		System.out.println("Thread priority:"+ m.getPriority());
	
		
		m.setName("First Thread");
		m.setPriority(9);
		
		
		System.out.println("ThreadName: "+ m.getName());
		System.out.println("Thread priority " + m.getPriority());

	}
}
