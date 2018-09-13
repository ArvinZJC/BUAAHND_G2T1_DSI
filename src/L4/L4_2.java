//2017.10.25, jhtp8LOV_ch03.pptx, P61-63, program that solves a class-average problem using sentinel-controlled repetition

package L4;

import java.util.Scanner;

public class L4_2
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		int total = 0, grade, counter = 0;
        double average;
		
		System.out.print( "Enter grade or -1 to quit: " );
		grade = input.nextInt();
		
		//looping until the sentinel value read from the user shows that the sentinel-controlled repetition is indefinite repetition
		while( grade != -1 )
		{
			total += grade;
			++counter;
			
			System.out.print( "Enter grade or -1 to quit: " );
			grade = input.nextInt();
		} //end while
		
		//execute the following code block if the user enters at least one grade
		if( counter != 0 )
		{
			average = ( double ) total / counter; //the unary cast operator "(double)" which performs explicit conversion creates a temporary floating-point copy of its operand.
			
			System.out.printf( "\nTotal of the %d grades entered: %d\n", counter, total );
			System.out.printf( "Class average: %.2f", average );
		}
		else
			System.out.println( "Error! No grades were entered." );
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end method main
} //end class L4_2