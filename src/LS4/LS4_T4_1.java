/* 
 * 2017.12.12, LS4.docx, Task 4, times sorting program
 * this program avoids using method sort in class Arrays
 */

package LS4;

public class LS4_T4_1
{
	public static void main( String[] args )
	{
		double[] times = { 2, 0.07, 2.86, 1.1 };
		
		System.out.println( "The resultant times:" );
		System.out.print( "    " ); //these spaces are used for a better layout
		
		OutputTimes( times ); //call the specified method to output the resultant times
		SortTimes( times ); //call the specified method to sort and output the resultant times from fastest to slowest
	} //end method main
	
	/**
	 * Output the resultant times.
	 * @param times
	 */
	public static void OutputTimes( double[] times )
	{
		for( double number : times )
			System.out.print( number + " ms    " );
		
		System.out.println();
	} //end method OutputTimes
	
	/**
	 * Sort and output the resultant times from fastest to slowest.
	 * @param times
	 */
	public static void SortTimes( double[] times )
	{
		double temp;
		
		//use Selection Sort to sort from fastest to slowest
		for( int i = 0; i < times.length - 1; i++ )
		{
			for( int j = i + 1; j < times.length; j++ )
			{
				//change positions if the previous element is greater than the latter one
				if( times[ i ] > times[ j ] )
				{
					temp = times[ i ];
					times[ i ] = times[ j ];
					times[ j ] = temp;
				} //end if
			} //end for
		} //end for
		
		System.out.println( "From fastest to slowest:" );
		System.out.print( "    " ); //these spaces are used for a better layout
		
		OutputTimes( times ); //call the specified method to output the resultant times after sorting
	} //end method SortTimes
} //end class LS4_T4_1