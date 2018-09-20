//2017.12.12, LS4.docx, Task 1, program that finds the greatest storage space

package LS4;

public class LS4_T1_1
{
	public static void main( String[] args )
	{
		int[] size = { 1, 34, 15, 50 };
		
		OutputSize( size ); //call the specified method to output the memory sizes of the files sent to the program
		getMax( size ); //call the specified method to find and print the largest memory size
	} //end main
	
	/**
	 * Output the memory sizes of the files sent to the program.
	 * @param size an array storing memory sizes
	 */
	public static void OutputSize( int[] size )
	{
		System.out.println( "The memory sizes of the files sent to the program:" );
		System.out.print( "    " ); //these spaces are used for a better layout
		
		for( int number : size )
			System.out.print( number + " MB    " );
		
		System.out.println();
	} //end method OutputSize
	
	/**
	 * Find and print the largest memory size.
	 * @param size an array storing memory sizes
	 */
	public static void getMax( int[] size )
	{
		int max = 0; //assume 0 is the largest
		
		//loop to determine the maximum
		for( int number : size )
		{
			//execute if the value of the variable "number" is greater than that of the variable "max"
			if( number > max )
				max = number;
		} //end for
		
		System.out.println( "The largest memory size: " + max + " MB" );
	} //end method getMax
} //end class LS4_T1_1