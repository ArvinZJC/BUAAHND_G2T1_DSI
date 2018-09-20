/* 
 * 2017.12.12, an extension of Task 2, program that finds how many files sent, the total memory size and the average memory size
 * this program written from LS4_T2_1.java enables the user to enter the memory sizes of the files sent to the program
 */

package LS4;

import java.util.ArrayList;
import java.util.Scanner;

public class LS4_T2_2
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
			OutputResult( size ); //call the specified method to output the number of files sent, the total memory size and the average memory size
		else
			System.out.println( "\nError! No data is entered." );
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end main
	
	/**
	 * Output the number of files sent, the total memory size and the average memory size.
	 * @param size an array list storing memory sizes
	 */
	public static void OutputResult( ArrayList< Integer > size )
	{
		int total = 0;
		double average;
		
		//add each memory size to "total"
		for( int number : size )
			total += number;
		
		/* 
		 * calculate the average memory size
		 * "size.size()" is equal to the number of files sent
		 */
		average = ( double ) total / size.size();
		
		System.out.println( "\nThe number of files sent: " + size.size() +
				            "\nThe total memory size: " + total + " MB" );
		System.out.printf( "The average memory size: %.1f MB\n", average ); //print the average memory size with one decimal point kept
	} //end method OutputResult
} //end class LS4_T2_2