package Mar_07_2018;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("Mike");
		obj.add("Barry");
		obj.add("Oliver");
		obj.add("39.23");
		obj.add("Barry");// duplicate value is  allowed
		//maintains order of insertion
		// work as double linked list
		Iterator<String> itr = obj.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}
}
