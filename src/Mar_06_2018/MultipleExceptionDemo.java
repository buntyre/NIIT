package Mar_06_2018;

public class MultipleExceptionDemo 
{
	public static void main(String[] args) 
	{
		try
		{
		int arr[] = new int[4];
		
		arr[5] = 50/0;
		
		System.out.println(arr[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());
		}
		catch (ArithmeticException f) 
		{
			System.out.println(f.getMessage());
		}
		finally 
		{
			System.out.println("Program ended");
		}
	}
}
