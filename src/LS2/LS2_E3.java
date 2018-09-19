//2017.11.17, LS2.docx, Exercise 3, program that determines whether the second value in a pair of integers is a multiple of the first

package LS2;

import java.util.Scanner;

public class LS2_E3
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		int number1, number2, run = 1;
		
		//loop until 0 is entered by the user
		while( run != 0 )
		{
			System.out.println( "**********************************************************" ); //these asterisks are used for a better layout
			System.out.print( "Enter a pair of integers separated by a space: " );
			number1 = input.nextInt();
			number2 = input.nextInt();
			System.out.println();
			
			//call the specified method to determine whether the statement "the second integer is a multiple of the first integer" is true or false
			if( IsMultiple( number1, number2 ) )
				System.out.println( "The second integer " + number2 + " is a multiple of " + "the first integer " + number1 + "." );
			else
				System.out.println( "The second integer " + number2 + " is NOT a multiple of " + "the first integer " + number1 + "." );
			
			System.out.print( "\nEnter 0 to quit or any integer to start a new calculation: " );  //ask the user whether to start a new calculation
		    run = input.nextInt();
		    System.out.println();
		} //end while
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end main
	
	/**
	 * Determine whether the statement "the second integer is a multiple of the first integer" is true or false.
	 * @param number1
	 * @param number2
	 * @return true (if the statement is true) or false (if the statement is false)
	 */
	public static boolean IsMultiple( int number1, int number2 )
	{
		if( number2 % number1 == 0 )
			return true;
		else
			return false;
	} //end method IsMultiple
} //end class LS2_E3