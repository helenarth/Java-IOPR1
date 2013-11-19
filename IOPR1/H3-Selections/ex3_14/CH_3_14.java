package ex3_14;

import java.util.Scanner;

public class CH_3_14 {
	public static void main (String[ ] args)
	{
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter a number, a 1 for head and 0 for tail: ");
		
		int invoer = input.nextInt();
		
		int number = (int)(Math.random() * 2);
		
		if( invoer == number )
		{
			
			System.out.println(" you have tail");
			
			
		}
		else {
			
			
			System.out.println(" Sorry your are not right");
		}

		
		
		
	}

}
