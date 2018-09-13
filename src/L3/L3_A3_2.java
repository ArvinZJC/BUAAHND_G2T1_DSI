/*
 * 2017.10.17, an extension of Assignment 3, program that print even integers between 0 and 1,000 using the knowledge that was learned in Lesson 3
 * my 2nd method
 */

package L3;

public class L3_A3_2
{
	public static void main( String[] args )
	{
		int number = 0, result;
		
		//the loop-continuation condition enables that numbers printed are even integers between 0 and 1,000
		while( number <= 1000 / 2 )
		{
			result = 2 * number;
			
			System.out.println( result );
			
			number += 1;
		} //end while
	} //end method main
} //end class L3_A3_2