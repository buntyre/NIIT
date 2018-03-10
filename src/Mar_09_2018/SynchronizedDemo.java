package Mar_09_2018;

class SyncEx
{
	public synchronized static void display(String arr[])
	{
		for(int i=0 ; i<arr.length ; i++)
		{
			try
			{
				Thread.sleep(3000);
			}
			catch (Exception e) 
			{
				System.out.println("Exception Occured "+ e.getMessage());
			}
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+" : "+ arr[i]);
		}
	}
}

public class SynchronizedDemo extends Thread
{
	String val[] = {"Enter card", "Enter pin", "Enter amount", "Collect cash", "Exit"};
	
	public void run()
	{
		SyncEx.display(val);
	}

	
	public static void main(String[] args) 
	{
		SynchronizedDemo t1 = new SynchronizedDemo();
		SynchronizedDemo t2 = new SynchronizedDemo();
			
		t1.setName("Harry");
		t2.setName("Barry");
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
	}
}
