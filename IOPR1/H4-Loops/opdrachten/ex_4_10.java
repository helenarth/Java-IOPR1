package opdrachten;

public class ex_4_10 {
public static void main(String[] args) {
	
	int cunt = 1;
	for ( int i = 100 ; i < 100 ; i++)
	{
		
		if ( i % 5 ==0 && i % 6 ==0)
		{
			
			
			System.out.print((cunt++ % 10 != 0) ? i + " ": i + "\n");
		}
		
	}
}
}
