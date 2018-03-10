package Feb_28_2018;

import java.util.Scanner;

public class ConditionalDemo 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter your age:-");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();//take input from the user at runtime
		
		
		if(age>0 && age < 13)
		{
			System.out.println("You are Child");
		}
		else if(age>= 13 && age <20)
		{
			System.out.println("You are teenager");
		}
		else if(age>=20 && age < 60)
		{
			System.out.println("You are adult");
		}
		else if(age >= 60 && age <120)
		{
			System.out.println("You are old");
		}
		else
		{
			System.out.println("You entered invalid input");
		}
	}
}
}