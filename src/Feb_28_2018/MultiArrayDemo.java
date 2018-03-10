package Feb_28_2018;

import java.util.Scanner;

public class MultiArrayDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int size = sc.nextInt();// take input f size variable
		int size1 = sc.nextInt();
		int marks[][] = new int[size][size1];
		
		System.out.println("Enter values in array");
		for(int row=0 ; row<size ; row++)//for row navigation..2
		{
			for(int col=0 ; col<size1 ; col++)//col navigation..3
			{
				marks[row][col] = sc.nextInt();//to take input in each cell of the array
			}
		}
		for(int row=0 ; row<size ; row++)// for row navigation
		{
			for(int col=0 ; col<size1 ; col++)// col navigation
			{
				System.out.println(marks[row][col]);
			}
			System.out.println("\n");
		}
	}
}
