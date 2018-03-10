package Mar_10_2018;

import java.io.*;
public class FileWritingDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("E:/Java/FileDemo/lol.txt");
			
			String val = "League of Legends is Game. It only play online"
					+ "There was multiplayer can play together at the same time ";
			
			byte a[] = val.getBytes();
			fos.write(a);
			fos.close();
			
		}
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
