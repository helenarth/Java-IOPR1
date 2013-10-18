import java.util.Scanner;


public class ex_9_11 {
public static void main(String[] args) {
	
	Scanner input = new Scanner ( System.in);
	
	System.out.println( "Enter a String: ");
	
	String s = input.nextLine()	;
	
	System.out.println( "the sorted string is " + s);
}


public static String sort (String s) 
{
	StringBuilder stringbuilder = new StringBuilder(s) ;// create a String builder
	
	char currentMax;
	int currentmaxIndex;
	
	
	for (int i = stringbuilder.length() - 1; i >= 1; i--)
	{
	    currentMax = stringbuilder.charAt(i);
	    currentmaxIndex = i;
			
			
	    for (int j = 1; j <= i; j++) {
	        if (currentMax < stringbuilder.charAt(j)) {
	          currentMax = stringbuilder.charAt(j);
	          currentmaxIndex = j;
	        }
	      }
	    
	    if (currentmaxIndex != i) {
	    	stringbuilder.setCharAt(currentmaxIndex, stringbuilder.charAt(i));
	    	stringbuilder.setCharAt(i, currentMax);
	      }
		}
		
	

	return stringbuilder.toString();
	
	
}


}
