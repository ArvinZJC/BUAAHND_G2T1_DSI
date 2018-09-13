//2017.11.16, LS2.docx, Exercise 2, hypotenuse calculator

package LS2;

public class LS2_E2_1
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
			hypotenuse = Hypotenuse( side1[ counter ], side2[ counter ] ); //call the specified method to calculate the length of the hypotenuse
			
			System.out.printf( "%8d%10.1f%10.1f%14.1f\n", counter + 1, side1[ counter ], side2[ counter ], hypotenuse );
		} //end for
	} //end method main
	
	/**
	 * Calculate the length of the hypotenuse.
	 * @param side1
	 * @param side2
	 * @return the length of the hypotenuse
	 */
	public static double Hypotenuse( double side1, double side2 )
	{
		double hypotenuse = Math.sqrt( Math.pow( side1, 2 ) + Math.pow( side2, 2 ) );
		
		return hypotenuse;
	} //end method Hypotenuse
} //end class LS2_E2_1