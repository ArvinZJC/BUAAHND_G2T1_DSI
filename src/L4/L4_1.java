//2017.10.25, jhtp8LOV_ch03.pptx, P44 & 45, program that solves a class-average problem using counter-controlled repetition

package L4;

import java.util.Scanner;

public class L4_1
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		int total = 0, grade, counter = 1, average;
		
		//looping 10 times shows that counter-controlled repetition is definite repetition
		while( counter <= 10 )
		{
			System.out.print( "Enter grade: " );
			grade = input.nextInt();
			
			total += grade;
			counter++; //as one single statement, "counter++", "++counter" and "counter += 1" can be seen as the same
		} //end while
		
		average = total / 10;
		
		System.out.printf( "\nTotal of all 10 grades: %d\n", total );
		System.out.printf( "Class average: %d\n", average );
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end method main
} //end class L4_1