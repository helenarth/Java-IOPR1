package ex5_12;


public class Exercise05_12 {
	
public static void main(String[] args) {
	
	printChars('1', 'z', 10);
		
		
	}

public static  void  printChars( char ch1, char ch2 , int numberPerLine )
{
	int count  = 1;
	for (int i = ch1 ; i <= ch2 ; i++ , count++)
	{
		
		if (count % numberPerLine == 0)
		{
			System.out.println((char)i);
			
		}
		else{
			
			System.out.println((char)i);
		}
		
	}
	
	
	
	
	
}


}