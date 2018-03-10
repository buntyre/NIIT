package Mar_09_2018;



public class Threading extends Thread
{
	public void run()
	{
		System.out.println("ThreadName: "+ Thread.currentThread().getName());
		System.out.println("Thread priority:"+ Thread.currentThread().getPriority());

	}


	public static void main(String[] args) 
	{
		
		Threading t1 = new Threading();
		Threading t2 = new Threading();
		
		t1.setName("Th 1");
		t2.setName("Th 2");
		t1.setPriority(5);
		t2.setPriority(9);
		t1.start();
		t2.start();
	}
}
