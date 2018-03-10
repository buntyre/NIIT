package Mar_10_2018;
import java.io.*;

public class FileReadingDemo 
{
	public static void main(String[] args) 
	{
		try
		{
		FileInputStream fis = new FileInputStream("E:\\Java\\FileDemo\\lol.txt");
		
		int i=0;
		while((i=fis.read())!=-1)//-1 os EOF
		{
			System.out.print((char)i);
		}
		fis.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
