import java.util.Scanner;

public class ex_6_9 {
	
	// krijg erro
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter 5 numbers");

		double[] number = new double[5];

		for (int i = 0; i < number.length; i++) {

			number[i] = scan.nextInt();

		}
		System.out.println(" the min number is: ");
		min(number);
	}

	public static double min(	double[] number) {

		double min = number[5];
		
		for ( int i = 0 ; i <number.length; i ++)
		{
			
			if (number[i] < min )
			{
				
				min = number[i];
				
				System.out.println(min);
			}
			
	
			
		}
		return min ;
	}

}
