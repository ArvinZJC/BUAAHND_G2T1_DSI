/* 
 * 2017.12.12, an extension of Task 4, times sorting program
 * this program rewritten from LS4_T4_1.java enables the user to enter the resultant times
 */

package LS4;

import java.util.ArrayList;
import java.util.Scanner;

public class LS4_T4_2
{
	public static void main( String[] args )
	{
		ArrayList< Double > times = new ArrayList< Double >();
		Scanner input = new Scanner( System.in );
		double number;
		
		System.out.println( "Enter proper positive numbers for the resultant times (unit: ms):\n" +
	                        "(TIPS: On UNIX, Linux and Mac OS X, the end-of-file indicator is Ctrl + D.\n" +
	                        "       On Windows, the end-of-file indicator is Ctrl + Z.)" );
		
		//loop until the end-of-file indicator is entered
		while( input.hasNext() )
		{
			number = input.nextDouble();
			
			//loop until a proper positive number is entered
			while( number <= 0 )
			{
				System.out.print( "Error! Please enter again: " );
				
				number = input.nextDouble();
			} //end while
			
			times.add( number );
		} //end while
		
		times.trimToSize();
		
		if( times.size() != 0 )
			SortTimes( times ); //call the specified method to sort and output the resultant times from fastest to slowest
		else
			System.out.println( "\nError! No data is entered." );
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end main
	
	/**
	 * Output the resultant times.
	 * @param times
	 */
	public static void OutputTimes( Double[] times )
	{
		for( double number : times )
			System.out.print( number + " ms    " );
		
		System.out.println();
	} //end method OutputTimes
	
	/**
	 * Sort and output the resultant times from fastest to slowest.
	 * @param times
	 */
	public static void SortTimes( ArrayList< Double > times )
	{
		double temp;
		Double[] times_array = new Double[ times.size() ];
		
		times.toArray( times_array );
		
		//use Selection Sort to sort from fastest to slowest
		for( int i = 0; i < times_array.length - 1; i++ )
		{
			for( int j = i + 1; j < times_array.length; j++ )
			{
				//change positions if the previous element is greater than the latter one
				if( times_array[ i ] > times_array[ j ] )
				{
					temp = times_array[ i ];
					times_array[ i ] = times_array[ j ];
					times_array[ j ] = temp;
				} //end if
			} //end for
		} //end for
		
		System.out.println( "\nFrom fastest to slowest:" );
		System.out.print( "    " ); //these spaces are used for a better layout
		
		OutputTimes( times_array ); //call the specified method to output the resultant times after sorting
	} //end method SortTimes
} //end class LS4_T4_2