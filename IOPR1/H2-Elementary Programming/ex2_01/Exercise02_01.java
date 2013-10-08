package ex2_01;

import java.util.Scanner;

public class Exercise02_01 {

	
	public static void main(String[] args) {
		double celsius = 90.00;
		double fahrenheit = 12.12;
		Scanner sd = new Scanner (System.in);
		System.out.print( "Enter a degree in Celsius: " );
		
		double d1  = sd.nextInt()	;
		
		if ( celsius % 2 ==  0 && celsius % 3 == 0 )
		
		System.out.println( celsius + " Celsius is " + fahrenheit + " Fahrenheit" );
		
		sd.close();
		
	}
}
