//2017.11.14, jhtp8LOV_ch06.pptx, P33, program that computes the sum of the elements of an array

package L7;

public class L7_6
{
	public static void main( String[] args )
	{
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int total = 0;
		
		//add each array element's value to "total"
		for( int counter = 0; counter < array.length; counter++ )
			total += array[ counter ];
		
		System.out.printf( "Total of array elements: %d\n", total );
	} //end method main
} //end class L7_6