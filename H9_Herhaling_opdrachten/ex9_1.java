import java.util.Scanner;

public class ex9_1 {
public static void main(String[] args) {
	boolean isValied;
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter your soical sec number as follows e.g. DDD-DD-DDDD: ");
	
	int wer = input.nextInt()	;
	
	
	if (isValied(wer))
	{
		System.out.println(wer +" its a valid social shit");
		
		
		
	}
	else
	{
		
		System.out.println(wer + " is not a valid SSN");
	}
	
	System.exit(wer);
}

private static boolean isValied(int wer) {
	
	return (wer.length == 11) && 
}
	
	}


