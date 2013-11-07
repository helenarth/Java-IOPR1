package Listing_3_9;

import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print(" Please enter your lottery number:");
		int guess = input.nextInt();

		int lottery = (int) (Math.random() * 100);

		int lotterydigit1 = lottery / 10;
		int lotterydigit2 = lottery % 10;

		int guessdigit1 = guess / 10;
		int guessdigit2 = guess % 10;
		System.out.println(" your lottery number is" + lottery);

		if (guess == lottery) {

			System.out.println(" Excat match, you win!");

		} else if (guessdigit2 == lotterydigit1 && guessdigit1 == lotterydigit2) {
			System.out.println(" Match number you win 3000$");

		} else if (guessdigit1 == lotterydigit2 || guessdigit2 == lotterydigit1)

		{
			System.out.println("Match one digi: you win $1,000");

		} else {

			System.out.println(" no match sorry! ");
		}

	}
}
