import java.util.Scanner;


public class ex_7_1 {

	public static void main(String[] args) {
		double [][] matrix = new double[3][4];
		Scanner input = new Scanner ( System.in);
		
		System.out.println("Enter " + matrix.length + " rows and " + 
				matrix[0].length + " columns: ");
		for (int row = 0; row < matrix.length; row++){
			for ( int column = 0; column < matrix[row].length; column++){
			matrix[row][column] = input.nextDouble();
			}
			}
		
		sumColumn(matrix,0);
		
	}
	
	public static double sumColumn ( double [ ] [ ] m, int columnIndex)
	{
		double total = 0 ;
		for ( int column = 0; column <= columnIndex; column++){
			total = 0;
			for (int row = 0; row < m.length; row++){
			total += m[row][column];
		
			}
			System.out.println(total);
		}
		return total;
		
	
	}
	
}
