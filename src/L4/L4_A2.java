//2017.10.28, Assignment 2, program rewritten from L4_2.java with a do...while repetition statement

package L4;

import java.util.Scanner;

public class L4_A2
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		int total = 0, grade, counter = 0;
        double average;
		
		System.out.print( "Enter grade or -1 to quit: " );
		grade = input.nextInt();
		
		if( grade == -1 )
			System.out.println( "No grades were entered." );
		else
		{
			do
			{
				total += grade;
				++counter;
				
				System.out.print( "Enter grade or -1 to quit: " );
				grade = input.nextInt();
			} while( grade != -1 ); //loop until the sentinel value (-1) is entered
			
			average = ( double ) total / counter;
			
		    System.out.printf( "\nTotal of the %d grades entered: %d\n", counter, total );
		    System.out.printf( "Class average: %.2f", average );
		    
		    input.close(); //close "input" of class Scanner to avoid resource leak
		} //end if...else
	} //end method main
} //end class L4_A2