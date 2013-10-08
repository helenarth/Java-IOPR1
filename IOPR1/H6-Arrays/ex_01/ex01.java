package ex_01;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		
		
	//	int numofStudents = 0 ;
		int best = 0 ;
		char grade ; 

		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println(" Enter the number of students");
		
		int numofStudents= scan.nextInt();
		
		
		int [] scores = new int[numofStudents] ;
		
		
		
		
		for ( int i = 0 ; i < scores.length; i ++)
		{
			
			if(scores[i] > best)
				best = scores[i];
		}
			
		String output = " " ;
		for( int i = 0 ; i< scores.length; i ++)
		{
			
			
			if ( scores [ i]  >= best - 10)
				grade= 'A';
				
			else if ( scores [ i] >= best - 20 )
				grade = 'B' ;
			
			else if ( scores [ i] >= best- 30 )
				grade = 'C' ;
			else if ( scores [ i] >= best - 40 )
				grade = 'D' ;
			else 
				grade =  'F';
			
			
			
			
			output  += " Student " + i + " Score is " + scores[i] + " and grade is " + grade + "\n ";
			
			
			
		scan.close();
			
		}
		
		System.out.println(output);
		
		
		
		
	}

}
