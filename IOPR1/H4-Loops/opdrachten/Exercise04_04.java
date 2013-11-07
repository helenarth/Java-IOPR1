package opdrachten;

public class Exercise04_04 {
public static void main(String[] args) {
	
	String output = " Miles              Kilometers";
	
	output += "  ";
	
	for ( int i = 1 ; i <= 3 ; i++)
	{
		
		
		output += "";
		
		output += " \n";
		for ( double j = 1.609 ; j <= 3 ; j++)
		{
			
			if ( j * j < 10)
				
				output += "   " + i * j;
			
		}
		output += "\n";
	}
	 System.out.println(output);
}
}
