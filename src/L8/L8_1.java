//2017.11.20, jhtp8LOV_ch06.pptx, P48, program that uses an enhanced for statement to total integers in an array

package L8;

public class L8_1
{
	public static void main( String[] args )
	{
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int total = 0;
		
		//add each array element's value to "total"
		for( int number : array )
			total += number;
		
		System.out.printf( "Total of array elements: %d\n", total );
	} //end main
} //end class L8_1