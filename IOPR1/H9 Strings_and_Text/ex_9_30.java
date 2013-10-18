import java.util.Scanner;

public class ex_9_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two strings
		System.out.print("Enter a string: ");

		String s = input.nextLine();

		System.out.println("The new string is " + title(s));

	}

	public static String title(String s) {

		StringBuilder sb = new StringBuilder(s);

		for (int i = 0; i < sb.length(); i++){
			
			char ch = sb.charAt(i);
		
		if ((i == 0 && Character.isLowerCase(ch)) || (i > 0 && sb.charAt(i - 1) == ' ' && Character.isLowerCase(ch))) 
	        sb.replace(i, i + 1, Character.toUpperCase(ch) + "");
	    }
			
			
			
			return sb.toString();

	}
}
