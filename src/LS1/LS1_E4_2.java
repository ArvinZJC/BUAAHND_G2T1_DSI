/* 
 * 2017.11.02, LS1.docx, Exercise 4, diamond printing program
 * my 2nd method (with for repetition statements)
 * ATTENTION: the result is actually different from that of the 1st method because spaces (" ") are not printed on the right side of this "diamond"
 */

package LS1;

public class LS1_E4_2
{
	public static void main( String[] args )
	{
		//determine the lines
		for( int i = 1; i <= 9; i++ )
		{
			//determine how many spaces there are in front of the first asterisk of each line
			for( int s = Math.abs( 5 - i ); s >= 1; s-- )
				System.out.print( " " );
			
			//determine how many asterisks a specified line has
			if( i <= 5 )
				for( int j = 2 * i - 1; j >= 1; j-- )
					System.out.print( "*" );
			else
				for( int j = -2 * i + 19; j >= 1; j-- )
					System.out.print( "*" );
			
			System.out.println();
		} //end for
	} //end main
} //end class LS1_E4_2