package opdrachten;

import javax.swing.JOptionPane;

public class Exercise04_10 {
	
	public static void main(String[] args) {
		
		int count = 0;
		
		
		System.out.println("Numbers that are divisible by 5: \n" );
		for (int i = 100; i <= 1000; i++) {
			if (i % 5 == 0)
				System.out.print((count++ % 10 != 0) ? i + " ": i + "\n");
			}

		System.out.println("\nNumbers that are divisible by 6:\n");
		for (int i = 100; i <= 1000; i++) {
			if (i % 6 == 0)
				System.out.print((count++ % 10 != 0) ? i + " ": i + "\n");
			}
		// JOptionPane.showMessageDialog(null	, output + output2);
		}
	
		
		
	}

