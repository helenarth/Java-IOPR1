import java.util.Scanner;

/*kijk opdrachten van hoofstuk  5*/
public class opdracht4 
{

	
	public static void main (String[] args	)
	{
		
		Scanner input = new Scanner(System.in);
		
		int optelReeks = 0;
		int getal = 0 ;
		
		do
		{
			
			System.out.print("Voer een getal in:" );
			
			getal = input.nextInt();
			optelReeks+=getal;
			
		}
		while (getal!=0);
		
			
			System.out.print(optelReeks);
			
		
	
}
}
