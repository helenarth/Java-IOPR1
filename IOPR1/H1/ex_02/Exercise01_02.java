package ex_02;

import java.util.Scanner;

public class Exercise01_02 {
	public static void main(String[] args)
  {
	  Scanner sd = new Scanner (System.in);
	  
	  System.out.println(" Enter a shit:");
		double d1 = sd.nextInt();


	  
	  if ( d1 % 2 == 0 && d1 %3 == 0 )
	
		  
		  System.out.println(" je hebt de hele boel gef***ed up! bitch!" + d1);
	  sd.close();
  }
	
}