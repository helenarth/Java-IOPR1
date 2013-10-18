package ex_02;


public class ex02 {
	public static void main(String[] args) {
		
		  java.util.Scanner input = new java.util.Scanner(System.in);

		    // Prompt the user to enter the first number
		    System.out.print("Enter an integer: ");
		    int max = input.nextInt();
		    int count = 0;
		    String inputNumbers = max + " ";

		    // Prompt the user to enter the remaining five numbers
		    for (int i = 0; i <= 2; i++) {
		      System.out.print("Enter an integer: ");
		      int temp = input.nextInt();
		      inputNumbers += temp + " ";

		      if (temp > max) {
		        max = temp;
		        count =1;
		      }
		      else if (temp == max)
		        count++;
		    }

		    System.out.println(
		      "The array is: " + inputNumbers + "\n" +
		      "max is " + max + "\n" +
		      "the occurrence count is " + count);
		
	}
}
