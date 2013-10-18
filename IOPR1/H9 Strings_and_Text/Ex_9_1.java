import java.util.Scanner;

public class Ex_9_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out
				.println(" Please enter a your fucking Social shit like this XXX-XX-XXXX: ");

		String s = input.nextLine();

		if (isValidSSN(s))
			System.out.println(s + " is a vaild SSN ");

		else
			System.out.println(s + "is not valid SSN ");

	}

	public static boolean isValidSSN(String ssn) {

		// int low = 0 ;
		//
		//
		// int high = s.length() - 1;
		//
		// while ( low < high){
		//
		// if (s.charAt(low)) != s.charAt(high)
		//
		// return false;
		//
		// low++;
		// high--;
		// }
		// return true;

		return (ssn.length() == 11) && (Character.isDigit(ssn.charAt(0)))
				&& (Character.isDigit(ssn.charAt(1)))
				&& (Character.isDigit(ssn.charAt(2))) && (ssn.charAt(3) == '-')
				&& (Character.isDigit(ssn.charAt(4)))
				&& (Character.isDigit(ssn.charAt(5))) && (ssn.charAt(6) == '-')
				&& (Character.isDigit(ssn.charAt(7)))
				&& (Character.isDigit(ssn.charAt(8)))
				&& (Character.isDigit(ssn.charAt(9)))
				&& (Character.isDigit(ssn.charAt(10)));

	}
}
