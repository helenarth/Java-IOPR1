package opdrachten;

import java.util.Random;
import java.util.Scanner;

public class Exercise04_40 {
	public static void main(String[] args) {

		int heads = 0;
		int tails = 0;

		// random generator

		// Random toss = new Random();

		// for loop om 1 mil times to loopen
		for (int i = 0; i < 1000000; i++) {

			//
			// Scanner scan = new Scanner(System.in);
			// System.out.println(" type wat");
			//
			//
			// int number = scan.nextInt();
		// 	int side = toss.nextInt(2);

			if (heads == 0) {
				heads++;

			} else {

				tails++;

			}

		}
		// display resulats

		System.out.println(" number of heads are: \n" + heads);
		System.out.println(" number of tails: \n" + tails);

	}
}
