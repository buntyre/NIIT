package Mar_08_2018;



public class ThreadExample extends Thread
{
	public void run()
	{
		for(int i=1 ; i<4 ; i++)
		{
			Thread t = Thread.currentThread();
			System.out.println(t.getName());
		}
	}
	public static void main(String[] args) 
	{
		ThreadExample a = new ThreadExample();
		ThreadExample s = new ThreadExample();
		a.setName("Child Thread 1");
		s.setName("Child Thread 2");
		
		System.out.println(a.isAlive());
		System.out.println(s.isAlive());
		
		a.start();
		s.start();
		
		System.out.println(a.isAlive());
		System.out.println(s.isAlive());
		
	}
}
