import java.util.Scanner;


public class opdracht4 {

	
	public static void main (String[] args	)
	{
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("voer een geheel getal in: ");
		
		int invoer = input.nextInt();
		int optelreeks = 0;
		
		while ( invoer != 0)
		{
			
			optelreeks += invoer;
			
		}
		
		System.out.print("de Optelgetal is:" + optelreeks);
		
	}
}
