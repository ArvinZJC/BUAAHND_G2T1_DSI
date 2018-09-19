//2017.11.27, jhtp8LOV_ch06.pptx, P86-89, program that uses methods from class Arrays

package L9;

import java.util.Arrays;

public class L9_3
{
	public static void main( String[] args )
	{
		int location1, location2;
		int[] array1 = new int[ 10 ];
		int[] array2 = { 1, 2, 3, 4, 5, 6 };
		int[] array2_copy = new int[ array1.length ];
		double[] array3 = { 8.4, 9.3, 0.2, 7.9, 3.4 };
		
		Arrays.fill( array1, 7 ); //fill the 10-element array named array1 with 7
		Arrays.sort( array3 ); //sort the array named array3 into an ascending order
		System.arraycopy( array2, 0, array2_copy, 0, array2.length ); //copy the array named array2 to the array named array2_copy
		
		System.out.print( "The array named array3: " );
		
		//output each array element's value
		for( double number : array3 )
			System.out.printf( "%.1f  ", number );
		
		OutputArray( array1, "The array named array1" ); //call the specified method to output values in the array named array1
		OutputArray( array2, "The array named array2" ); //call the specified method to output values in the array named array2
		OutputArray( array2_copy, "The array named array2_copy" ); //call the specified method to output values in the array named array2_copy
		
		System.out.printf( "\n\narray1 %s array2\n", Arrays.equals( array1, array2 ) ? "=" : "≠" ); //compare the array named array1 and the array named array2 for equality
		System.out.printf( "array2 %s array2_copy\n", Arrays.equals( array2, array2_copy ) ? "=" : "≠" ); //compare the array named array2 and the array named array2_copy for equality
		
		location1 = Arrays.binarySearch( array2, 5 ); //search the array named array2 for the value "5"
		location2 = Arrays.binarySearch( array2, 8763 ); //search the array named array2 for the value "8763"
		
		if( location1 >= 0 )
			System.out.printf( "5 is the value for Index %d in the array named array2.\n", location1 );
		else
			System.out.println( "There is no 5 in the array named array2." );
		
		if( location2 >= 0 )
			System.out.printf( "8763 is the value for Index %d in the array named array2.\n", location1 );
		else
			System.out.println( "There is no 8763 in the array named array2." );
	} //end main
	
	/**
	 * Output the specified array.
	 * @param array
	 * @param header
	 */
	public static void OutputArray( int[] array, String header )
	{
		System.out.printf( "\n%s: ", header );
		
		//output each array element's value
		for( int number : array )
			System.out.print( number + "  " );
	} //end method OutputArray
} //end class L9_3