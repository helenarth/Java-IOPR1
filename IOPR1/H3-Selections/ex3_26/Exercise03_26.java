package ex3_26;

import java.util.Scanner;

public class Exercise03_26 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println(" Enter a number: ");

		int number = scanner.nextInt();

		if (number % 2 == 0 && number % 3 == 0)
			;
		System.out.println(number
				+ " das niet de juiste G, je moet die andere boy hebbe matti, schiet eens op kakerlak " );
		
		
		System.out.println(" probeer nog een keer.. ");
				
		Scanner ad = new Scanner(System.in);
		int asd = scanner.nextInt();
		
		if ( asd % 2 == 2 || asd %2 == 0)
			System.out.println(asd + " ja deze matie, deze moete whe hebben boy");
		
		scanner.close();
		
	}
}
