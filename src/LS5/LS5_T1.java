//2017.12.18, LS5.docx, Task 1, program providing a username creator and a factorial calculator for the user to choose

package LS5;

import java.util.Scanner;

public class LS5_T1
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int number, run = 1;
		char selection;
		String firstName, lastName;
		
		System.out.println( "  A: username creator\n  B: factorial calculator\n  Q: quit" );
		
		//loop until the menu option Q is chosen
		while( run != 0 )
		{		
			System.out.println( "*******************************************************" ); //these asterisks are used for a better layout
			System.out.print( "Enter your selection (A/B/Q, the lowercase letter also accepted): " );
			selection = input.next().charAt( 0 ); //read a character from the user
			System.out.println();
			
			switch( selection )
			{
			case 'A':
			case 'a':
				System.out.print( "Enter your first name: " );
				firstName = input.next();
				System.out.print( "Enter your last name: " );
				lastName = input.next();
				CreateUsername( firstName, lastName ); //call the specified method to create a username
				break;
				
			case 'B':
			case 'b':
				System.out.print( "Enter an integer between 0 and 20: " );
				number = input.nextInt();
				//loop until a proper integer is entered
				while( ( number < 0 ) || ( number > 20 ) )
				{
					System.out.print( "Error! Please enter again: " );
					number = input.nextInt();
				} //end while
				CalculateFactorial( number ); //call the specified method to calculate the factorial of a number
				break;
				
			case 'Q':
			case 'q':
				run = 0;
				break;
				
			//execute if the user enters 1 character which is an unspecified one
			default:
				System.out.println( "Error! There is no such selection." );
			} //end switch-case
			
			System.out.println();
		} //end while
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end main
	
	/**
	 * Create a username.
	 * @param firstName the first name
	 * @param lastName the last name
	 */
	public static void CreateUsername( String firstName, String lastName )
	{
		String username = firstName.substring( 0, 1 ) + lastName; //create a username from the first letter of the first name and the whole of the surname
		
		System.out.println( "Your username: " + username );
	} //end method CreateUsername
	
	/**
	 * Calculate the factorial of a number.
	 * @param number the number to be calculated
	 */
	public static void CalculateFactorial( int number )
	{
		/* 
		 * type long enables the calculator to correctly calculate at most 20!, while type int at most 12!
		 * 0 should not be assigned to "product" as an initial value since the product of any number and 0 is 0
		 * 1 should be assigned to "product" as an initial value to directly print the result 1 when number = 0 or 1
		 */
		long product = 1;
		
		//calculate the factorial using the formula "x! = x * ( x – 1 ) * ( x – 2 ) * … * 2" when 2 ≤ number ≤ 20
		for( int x = number; x > 1; x-- )
			product *= x;
			
		System.out.println( number + "! = " + product );
	} //end method CalculateFactorial
} //end class LS5_T1