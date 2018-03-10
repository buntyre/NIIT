package Mar_10_2018;
import java.io.*;

public class FileCopyDemo 
{
	public static void main(String[] args) 
	{
		char []c = new char[50];
		int clen = c.length;
		try(FileReader fr = new FileReader("E:\\Java\\FileDemo\\mkk.txt");
				FileWriter fw = new FileWriter("E:\\Java\\FileDemo\\mkkCopy.txt"))
				{
					int count =0; 
					int read = 0;
					while((read=fr.read(c))!=-1)
					{
						if(read<clen)
							fw.write(c,0,read);
						
							count+=read;
					}
					System.out.println("Wrote "+count+" chars");
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}
				catch(IOException f)
				{
					f.printStackTrace();
				}
		
	}
}
