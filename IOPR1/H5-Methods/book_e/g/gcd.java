package book_e.g;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
			
		// promot the user to enter two integers
		
		System.out.print(" Enter two int: ");
		int answer1  = input.nextInt();
		System.out.println( "Enter another int:");
		int answer2  = input.nextInt();
		
		System.out.println("the gcd for "+ answer1 + " and "+ answer2 + " is"+ gcd( answer2,  answer1));
	}

	public static int gcd(int answer2, int answer1) {
		
		int gcd = 1;
		int k = 2;
		
		while ( k <= answer1 && k <= answer2)
		{
			
			if ( answer1 % k == 0 && answer2 % k ==0 )
			{
				
				gcd=k;
				k++;
				
			}
		}
		return gcd;

	}
}
