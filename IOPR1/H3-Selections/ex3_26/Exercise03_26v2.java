package ex3_26;

import java.util.Scanner;

public class Exercise03_26v2 {
	
	public static void main(String[] args) {
		
		boolean kanniet = false ;
		boolean kanwel = true;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter an Integer:");
		
		int number = scan.nextInt();
		
		if ( number %  5 == 0 && number % 6 == 0 || number % 6== 0    );
		
		System.out.println(" is "  + number + " divisble by "  + " 5" + " and " + " 6"  + " ?" + kanniet );
		System.out.println(" is "  + number + " divisble by "  + " 5" + " and " + " 6"  + " ?" + kanwel );
		System.out.println(" is "  + number + " divisble by "  + " 5" + " and " + " 6"  + " ," + " but not both" + "" + kanwel );
			
	}

}
