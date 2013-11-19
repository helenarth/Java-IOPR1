package ex3_14;

import java.util.Scanner;

public class ex_3_14 {

	public static void main(String[] args) {
		
	
	int number = (int)(Math.random() * 2) ;
	
	Scanner input = new Scanner ( System.in);
	
	System.out.print("Guess head or tail? " +     "Enter 0 for head and 1 for tail: ");
int guess = input.nextInt();

System.out.print(" try one more time, for fun: ");

int guess2 = input.nextInt();


	
	if ( guess == number)
	{
		  System.out.println("Correct guess");
		if  (guess2 == number)
		{
			
			System.out.println("Correct guess");
			
		}
		
	}
	else if  ( guess == 0 )
	{
		
		
	     System.out.println("Sorry, it is a head");
		
	}
	
	
	 else
	      System.out.println("Sorry, it is a tail");
	
	
	
}}
