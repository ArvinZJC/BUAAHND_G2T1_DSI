//2017.11.27, jhtp8LOV_ch06.pptx, P106 & 107, program that uses methods length, charAt and getChars from class String

package L9;

public class L9_5
{
	public static void main( String[] args )
	{
		String str = "hello there";
		char[] array = new char[ 5 ];
		
		System.out.printf( "The string: %s", str );
		System.out.printf( "\nIts length: %d", str.length() );
		System.out.print( "\nThe string reversed: " );
		
		for( int counter = str.length() - 1; counter >= 0; counter-- )
			System.out.printf( "%c  ", str.charAt( counter ) );
		
		str.getChars( 0, 5, array, 0 ); //copy characters from the string into the array named array
		
		System.out.print( "\nThe array named array: " );
		
		for( char character : array )
			System.out.print( character + "  " );
		
		System.out.println();
	} //end method main
} //end class L9_5