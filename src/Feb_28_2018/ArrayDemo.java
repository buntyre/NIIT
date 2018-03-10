package Feb_28_2018;

import java.util.Scanner;

public class ArrayDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length");
		int size = sc.nextInt();
		int marks[] = new int[size];
		
		System.out.println("Enter 5 values in array");
		
		for(int i=0;i<size;i++)//navigating
		{
			marks[i] = sc.nextInt();//to take input in each cell of the array
		}
		for(int i=0;i<size;i++)//navigating
		{
			System.out.println(marks[i]);//display
		}
	}
}
