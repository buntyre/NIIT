package Mar_07_2018;

import java.util.*;

public class PriorityQueueDemo 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> obj = new PriorityQueue<String>();
		obj.add("Mike");
		obj.add("Barry");
		obj.add("Oliver");
		obj.add("39.23");
		obj.add("Barry");// maintains FIFO order
		// it allows duplicate values
		// it rearranged the elements in ascending order
		System.out.println("1st element " + obj.peek());// return the top element
		System.out.println("1st element " + obj.element());// return the top element
		
		Iterator<String> itr = obj.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		obj.remove();// delete top element
		obj.poll();//delete top element but also return null if queue is empty
		System.out.println("After removing the top element");
		
		Iterator<String>itr2 = obj.iterator();
		
		while (itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
}
