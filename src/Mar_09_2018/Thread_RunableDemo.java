package Mar_09_2018;

public class Thread_RunableDemo implements Runnable
{
	public void run()
	{
		for(int i=1 ; i<10 ; i++)
		{
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+" : " + i);
		}
	}
	public static void main(String[] args) 
	{
		Thread_RunableDemo s = new Thread_RunableDemo();
		Thread_RunableDemo s1 = new Thread_RunableDemo();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s1);
		t1.setName("Child Thread 1");
		t2.setName("Child Thread 2");
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}
