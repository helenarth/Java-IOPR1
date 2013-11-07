package opdrachten;

public class ex_4_2 {
public static void main(String[] args) {
	System.out.printf("%-14s%-10s\n", "Kilograms", "Pounds");
	
	
	int kilo = 1;
	while ( kilo < 200)
	{
		
		  System.out.printf("%-14d%-10.1f\n", kilo, kilo * 2.2);
		  kilo+=2;
		  
	}
	
//	for ( int kilo1 = 0 ; kilo1 < 199; kilo1++)
//	{
//		
//		
//		
//	}
	
}
}
