package opdrachten;

public class Exercise04_11 {
	
	public static void main(String[] args) {
		
		
		// vragen aan Berry hoe het werkt? 
	boolean num = true;
		
		for (int  i = 1 ; i <= 100 ; i++ )
			
			 num = (i % 6 == 0 || i % 7 == 0) && !(i % 6 == 0 && i % 7 == 0);
		
		
		if ( num == true)
		{
			System.out.println(		" is dividible ");
			
			
			
		}
		
	}

}
