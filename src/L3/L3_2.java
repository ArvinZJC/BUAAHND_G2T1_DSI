//2017.10.17, jhtp8LOV_ch03.pptx, P23, program that shows whether a student's grade (XX.00) achieves PASS or FAIL

package L3;

import java.util.Scanner;

public class L3_2
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		int grade;
		
		System.out.print( "Enter student's grade: " );
		grade = input.nextInt();
		
		System.out.println( grade >= 60 ? "PASS" : "FAIL" ); //conditional operator (?:) which is Java’s only ternary operator (operator that takes three operands) can be used in place of an if...else statement
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end main
} //end class L3_2