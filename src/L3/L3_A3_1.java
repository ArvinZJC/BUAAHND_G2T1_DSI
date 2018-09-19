/*
 * 2017.10.17, Assignment 3, program that print even integers between 0 and 1,000 using the knowledge that was learned in Lesson 3
 * my 1st method (enumeration method)
 */

package L3;

public class L3_A3_1
{
	public static void main( String[] args )
	{
		int number = 0;
		
		while( number <= 1000 )
		{
			//"%" is the remainder operator
			if( number % 2 == 0 )
		    {
				System.out.println( number );
				number += 1; //"number = number + 1" can be rewritten with the addition compound assignment operator (+=) as it shows
			}
			else
				number += 1;
		} //end while
	} //end main
} //end class L3_A3_1