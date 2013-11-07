package opdrachten;

import java.util.Scanner;

public class Exercise04_03 {

public static void main(String[] args) {


	String output = " Kilograms              pounds ";

	// Display the number title
//	output += "    ";
//	for (int j = 0; j <= 10; j++)
//		output += "    " + j;

	output += "   ";

	output += " \n";

	// Print table body

	for (int i = 1; i <= 3; i++) {

		output += i + " | ";

		for (double j = 2.2; j <= 3; j++) {
			// Display the product and align properly

			if (j * j < 10)
				output += " 			" + i * j;

		}

		output += "\n";

	}

	 System.out.println(output);
// 	JOptionPane.showMessageDialog(null	, output);

}
	
}	


	
