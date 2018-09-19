/* 
 * 2017.11.02, an extension of Exercise 3, triangle printing program
 * this program rewritten from LS1_E3_1.java enables the user to set the number of line
 */

package LS1;

import java.util.Scanner;

public class LS1_E3_3
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Enter the number of line (a proper positive integer): " );
		int line = input.nextInt();
		System.out.println();
		
		/* 
		 * print a left-aligned regular triangle (10 line)
		 * determine the line
		 */
		for( int i = 1; i <= line; i++ )
		{
			//determine how many asterisks a specified line has
			for( int j = 1; j <= i; j++ )
				System.out.print( "*" );
			
			System.out.println();
		} //end for
		
		System.out.println();
		
		//print a left-aligned inverted triangle
		for( int i = line; i >= 1; i-- )
		{
			for( int j = 1; j <= i; j++ )
				System.out.print( "*" );
			
			System.out.println();
		} //end for
		
		System.out.println();
		
		//print a right-aligned inverted triangle
		for( int i = 1; i <= line; i++ )
		{
			for( int j = 1; j <= line; j++ )
			{
				if( j < i )
					System.out.print( " " );
				else
					System.out.print( "*" );
			} //end for
			
			System.out.println();
		} //end for
		
		System.out.println();
		
		//print a right-aligned regular triangle
		for( int i = line; i >= 1; i-- )
		{
			for( int j = 1; j <= line; j++ )
			{
				if( j < i )
					System.out.print( " " );
				else
					System.out.print( "*" );
			} //end for
			
			System.out.println();
		} //end for
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end main
} //end class LS1_E3_3