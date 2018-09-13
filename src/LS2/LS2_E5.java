//2017.11.17, LS2.docx, Exercise 5, program that displays a square of asterisks

package LS2;

import java.util.Scanner;

public class LS2_E5
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		int sideLength;
		
		System.out.print( "Enter a proper positive integer to print a solid square: " );
		sideLength = input.nextInt();
		System.out.println();
		
		DisplaySquare( sideLength ); //call the specified method to display a square of asterisks
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end method main
	
	/**
	 * Display a square of asterisks.
	 * @param sideLength
	 */
	public static void DisplaySquare( int sideLength )
	{
		//determine the lines
		for( int i = 1; i <= sideLength; ++i )
		{
			//determine how many asterisks a specified line has
			for( int j = 1; j <= sideLength; ++j )
				System.out.print( "*" );
			
			System.out.println();
		} //end for
	} //end method DisplaySquare
} //end class LS2_E5