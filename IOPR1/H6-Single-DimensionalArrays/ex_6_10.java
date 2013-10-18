import java.util.Scanner;

public class ex_6_10 {
	public static void main(String[] args) {
		// double me = 9.0;
		
		// vragen aan Berry wat hier de probleem is? 
		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter  5 numbers ");

		int[] number = new int[5];

		for (int i = 0; i < number.length; i++) {

			number[i] = scan.nextInt();

		}

	}

	public static int indexOfSmallestElement(int[] number)

	{
		int min = number[0];
		int indexOfSmallestElement = 0;
		for (int i = 0; i < number.length; i++) {

			if (min > number[i]) {

				min = number[i];

				indexOfSmallestElement = i;

			}

		}

		return indexOfSmallestElement;
	}

}
