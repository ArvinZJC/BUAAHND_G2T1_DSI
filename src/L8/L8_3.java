//2017.11.20, jhtp8LOV_ch06.pptx, P63 & 64, program that initialises 2-dimensional arrays

package L8;

public class L8_3
{
	public static void main( String[] args )
	{
		int[][] array1 = { { 1, 2, 3 },
				           { 4, 5, 6 } };
		int[][] array2 = { { 1, 2 },
				           { 3 },
				           { 4, 5, 6 } };
		
		System.out.println( "Values in the array named array1 by row:" );
		
		OutputArray( array1 ); //call the specified method to display array1 by row
		
		System.out.println( "Values in the array named array2 by row:" );
		
		OutputArray( array2 ); //call the specified method to display array2 by row
	} //end method main
	
	/**
	 * Output a 2-dimensional array by row.
	 * @param array
	 */
	public static void OutputArray( int[][] array )
	{
		//loop through the array's rows
		for( int row = 0; row < array.length; ++row )
		{
			//loop through columns of the current row
			for( int column = 0; column < array[ row ].length; ++column )
				System.out.printf( "%d  ", array[ row ][ column ] );
			
			System.out.println();
		} //end for
	} //end method outputArray
} //end class L8_3