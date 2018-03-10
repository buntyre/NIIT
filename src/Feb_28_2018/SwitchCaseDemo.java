package Feb_28_2018;

import java.util.Scanner;

public class SwitchCaseDemo 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<5;i++)
		{
		System.out.println("Enter your movie choice");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("You chose: Dark knights");
		break;
		
		case 2: System.out.println("You chose: Amazing Sipder Man");
		break;
		
		case 3: System.out.println("You chose: Transformers");
		break;
		
		default: System.out.println("You enter invalid input");
		break;
		}
		
	}
}
}