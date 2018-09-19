//2017.12.12, LS4.docx, Task 2, program that finds how many files sent, the total memory size and the average memory size

package LS4;

public class LS4_T2_1
{
	public static void main( String[] args )
	{
		int[] size = { 1, 34, 15, 50 };
		
		OutputSizeAndNumber( size ); //call the specified method to output the memory sizes of files sent and the number of files sent
		OutputTotalAndAverage( size ); //call the specified method to calculate and output the total memory size and the average memory size
	} //end main
	
	/**
	 * Output the memory sizes of files sent and the number of files sent.
	 * @param size
	 */
	public static void OutputSizeAndNumber( int[] size )
	{
		System.out.println( "The memory sizes of files sent:" );
		System.out.print( "    " ); //these spaces are used for a better layout
		
		for( int number : size )
			System.out.print( number + " MB    " );
		
		System.out.println( "\nThe number of files sent: " + size.length ); //"size.length" is equal to the number of files sent
	} //end method OutputSizeAndNumber
	
	/**
	 * Calculate and output the total memory size and the average memory size.
	 * @param size
	 */
	public static void OutputTotalAndAverage( int[] size )
	{
		int total = 0;
		double average;
		
		//add each memory size to "total"
		for( int number : size )
			total += number;
		
		/* 
		 * calculate the average memory size
		 * "size.length" is equal to the number of files sent
		 */
		average = ( double ) total / size.length;
		
		System.out.println( "The total memory size: " + total + " MB" );
		System.out.printf( "The average memory size: %.1f MB\n", average ); //print the average memory size with 1 decimal point kept
	} //end method OutputTotalAndAverage
} //end class LS4_T2_1