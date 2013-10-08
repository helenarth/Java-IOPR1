import java.util.Scanner;


public class ex_6_15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner ( System.in);
		
		System.out.println( "Enter ten numbers ");
		
		int [ ] list = new int[ 10];
		
		
		for ( int i = 0 ; i < list.length; i++)
		{
			
			list[i] = scan.nextInt();
		}
		
		System.out.println(" the number is:");
		eliminteDuplicaties(list);
		
		
	}
	
	public static int [] eliminteDuplicaties ( int [] list)
	{
		
		for ( int i = 0 ; i < list.length ; i++)
		{
			
			
			boolean distinct  = true;
			for ( int j = 0 ; j < i ; j++){
				
				if (list[i] == list[j] )
				{
					distinct = false;
					break;
					
				}
				if (distinct)
				{
					
					System.out.println(list[i]);
					
				}
				
			}
		}
		
		
		return eliminteDuplicaties;
		
	}
	
}
