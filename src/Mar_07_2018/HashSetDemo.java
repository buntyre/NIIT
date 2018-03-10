package Mar_07_2018;

import java.util.Iterator;
import java.util.*;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet<String> obj = new HashSet<String>();
		obj.add("Mike");
		obj.add("Barry");
		obj.add("Oliver");
		obj.add("39.23");
		obj.add("Barry");// duplicate value is not allowed
		//maintains random + alphabetic order
		// Stores value with hashing mechanism
		Iterator<String> itr = obj.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}
}
