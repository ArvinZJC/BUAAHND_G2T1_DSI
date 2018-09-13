/* 
 * 2017.12.12, an extension of Task 1, program that finds the greatest storage space
 * this program written from LS4_T1_1.java enables the user to enter the memory sizes of the files sent to the program
 */

package LS4;

import java.util.ArrayList;
import java.util.Scanner;

public class LS4_T1_2
{
	public static void main( String[] args )
	{
		ArrayList< Integer > size = new ArrayList< Integer >();
		Scanner input = new Scanner( System.in );
		int number;
		
		System.out.println( "Enter proper positive integers for the memory sizes of the files sent to the program (unit: MB):\n" +
	                        "(TIPS: On UNIX, Linux and Mac OS X, the end-of-file indicator is Ctrl + D.\n" +
	                        "       On Windows, the end-of-file indicator is Ctrl + Z.)" );
		
		//loop until the end-of-file indicator is entered
		while( input.hasNext() )
		{
			number = input.nextInt();
			
			//loop until a proper positive integer is entered
			while( number <= 0 )
			{
				System.out.print( "Error! Please enter again: " );
				
				number = input.nextInt();
			} //end while
			
			size.add( number );
		} //end while
		
		size.trimToSize();
		
		if( size.size() != 0 )
			getMax( size ); //call the specified method to find and print the largest memory size
		else
			System.out.println( "\nError! No data is entered." );
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end method main
	
	/**
	 * Find and print the largest memory size.
	 * @param size
	 */
	public static void getMax( ArrayList< Integer > size )
	{
		int max = 0; //assume 0 is the largest
		
		//loop to determine the maximum
		for( int number : size )
		{
			//execute if the value of the variable "number" is greater than that of the variable "max"
			if( number > max )
				max = number;
		} //end for
		
		System.out.println( "\nThe largest memory size: " + max + " MB" );
	} //end method getMax
} //end class LS4_T1_2