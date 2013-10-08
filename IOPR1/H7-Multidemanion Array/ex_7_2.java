import java.util.Scanner;

public class ex_7_2 {

	
	public static void main(String[] args) {
		
		double[][] m = new double[4][4];
		
		Scanner input = new Scanner ( System.in);
		
		System.out.print("Enter a 4 by 4 matrix row by row: ");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
			m[i][j] = input.nextDouble();
			}
		
		
		System.out.print("Sum of the elements in the major diagonal is " +
				
		
		sumMajorDiagonal(m));
		
	}
		
		public static double sumMajorDiagonal  ( double [] [] m) 
		{
			
			
			int sum = 0; 
			for ( int i = 0 ; i <m.length ; i++)
			{
				
				sum = (int) ( sum  + m [ i] [i ]); 
				
			}
			
			return sum ;
		
	}
}
