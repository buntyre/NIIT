package Mar_07_2018;

import java.util.*;


public class CollectionDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<String> obj = new ArrayList<String>();//typrof
		obj.add("Mike");
		obj.add("Barry");
		obj.add("Oliver");
		obj.add("39.23");
		obj.add("Barry");// duplicate value is allowed
		//maintains order of insertion
		
		Iterator<String> itr = obj.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
