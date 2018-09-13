//2017.11.14, jhtp8LOV_ch06.pptx, P24, program that initialises the elements of an array with an array initialiser

package L7;

public class L7_4
{
	public static void main( String[] args )
	{
		int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
		
		System.out.printf( "%s%8s\n", "Index", "Value" );
		
		//output each array element's value
		for( int counter = 0; counter < array.length; ++counter )
			System.out.printf( "%5d%8d\n", counter, array[ counter ] );
	} //end method main
} //end class L7_4