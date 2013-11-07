package ex3_14;

import java.util.Scanner;

public class Exercise03_14 {

	
	
	public static void main(String[] args)
	  {
	    // Obtain the random number 0 or 1

	    int head  = 1;
	    int tail = 0;
	    
	    // Prompt the user to enter a guess
	    Scanner scan = new Scanner (System.in);	
	    
	    System.out.print("Guess head or tail? " +
	      "Enter 0 for head and 1 for tail: ");
	    
	    tail  = scan.nextInt()	;
	    head = scan.nextInt();
	    

	    // Check the guess
	    if ( tail % 1 == 0  )
	      System.out.println("Correct guess");
	    
	    if ( head % 0 == 0 || head % 3 == 0 )
	      System.out.println("Sorry, it is a head");
	    
	 
	    
	    scan.close();
	  }
}
