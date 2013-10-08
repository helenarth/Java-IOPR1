import java.util.Scanner;


public class ex_7_13 {
	
	
	public static void main(String[] args) {
		
		
		
		
		Scanner input = new Scanner ( System.in);
		System.out.print("Enter the number of roaws and columns of the array: ");
		
		
		int numberOfRows = input.nextInt();
		int numberOfColumns = input.nextInt();
		
		double[][] m = new double[numberOfRows][numberOfColumns];
		System.out.println(" Enter the array:");
		
		
		for ( int i = 0 ; i <m.length ; i++)
		{
			for (int j = 0 ; j <m[i].length ; j++)
				m[i][j] = input.nextDouble();
			
		}

		int[] location = locateLargest(m);
		System.out.println("The location of the largest element is at (" +
		location[0] + ", " + location[1] + ")");
	}
	
	public static int[] locateLargest  ( double [] [] s) 
	{
		int[] location = new int[2];
		double largest = s[0][0];
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				if (largest < s[i][j]) {
					
					
					largest = s[i][j];
					location[0] = i;
					location[1] = j;
				}
			}
		}
		return location;
		
	}
	
	

}
