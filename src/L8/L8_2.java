//2017.11.20, jhtp8LOV_ch06.pptx, P51 & 52, program that demonstrates the difference between passing arrays and passing individual array elements to methods

package L8;

public class L8_2
{
	public static void main( String[] args )
	{
		int[] array = { 1, 2, 3, 4, 5 };
		
		System.out.println( "----- Effects of passing a reference to an entire array -----\n" + " The values of the original array:" );
		
		for( int value : array )
			System.out.printf( "    %d", value );
		
		ModifyArray( array ); //pass a reference to the array named array to the specified method to modify the array
		
		System.out.println( "\n\nThe values of the modified array:" );
		
		for( int value : array )
			System.out.printf( "    %d", value );
		
		System.out.printf( "\n\n----- Effects of passing an array element value -----\n" + "array[ 3 ] before calling method ModifyElement: %d\n", array[ 3 ] );
		
		ModifyElement( array[ 3 ] ); //call the specified method to attempt to modify array[ 3 ]
		
		System.out.printf( "array[ 3 ] after calling method ModifyElement: %d\n", array[ 3 ] );
	} //end main
	
	/**
	 * Modify an array.
	 * @param array the array to be modified
	 */
	public static void ModifyArray( int[] array )
	{
		//multiply each array element by 2
		for( int counter = 0; counter < array.length; counter++ )
			array[ counter ] *= 2;
	} //end method modifyArray
	
	/**
	 * Modify an array element.
	 * @param element the element to be modified
	 */
	public static void ModifyElement( int element )
	{
		element *= 2; //multiply an argument by 2
		
		System.out.printf( "The value of the element in modifyElement: %d\n", element );
	} //end method modifyElement
} //end class L8_2