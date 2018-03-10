package Mar_07_2018;

import java.util.*;
import java.util.Iterator;

public class TreeSetDemo 
{
	public static void main(String[] args) 
	{
		TreeSet<String> obj = new TreeSet<String>();
		obj.add("Mike");
		obj.add("Barry");
		obj.add("Oliver");
		obj.add("39.23");
		obj.add("Barry");// duplicate value is not allowed
		//maintains ascending order
		// Stores value with bit tree mechanism
		Iterator<String> itr = obj.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}
}
