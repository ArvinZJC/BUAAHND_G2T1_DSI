/* 
 * 2017.11.16, an extension of Exercise 2, hypotenuse calculator
 * this program rewritten from LS2_E2_1.java uses class Math method hypot instead of the programmer-declared method hypotenuse
 */

package LS2;

public class LS2_E2_3
{
	public static void main( String[] args )
	{
		double[] side1 = { 3.0, 5.0, 8.0 };
		double[] side2 = { 4.0, 12.0, 15.0 };
		double hypotenuse;
		
		System.out.printf( "%s%10s%10s%14s\n", "Triangle", "Side 1", "Side 2", "Hypotenuse" );
		
		//loop to print the length of each side of a triangle
		for( int counter = 0; counter < side1.length; counter++ )
		{
			hypotenuse = Math.hypot( side1[ counter ], side2[ counter ] ); //calculate the length of the hypotenuse
			
			System.out.printf( "%8d%10.1f%10.1f%14.1f\n", counter + 1, side1[ counter ], side2[ counter ], hypotenuse );
		} //end for
	} //end main
} //end class LS2_E2_3