//2017.11.27, jhtp8LOV_ch06.pptx, P131-133, program that uses methods replace, toLowerCase, toUpperCase, trim and toCharArray from class String

package L9;

public class L9_10
{
	public static void main( String[] args )
	{
		String str1 = "hello", str2 = "GOODBYE", str3 = "   spaces   ";
	    char[] array = str1.toCharArray();
	    
	    System.out.printf( "str1: %s\nstr2: %s\nstr3: %s\n\n", str1, str2, str3 );
	    System.out.printf( "Replace 'l' with 'L' in str1: %s\n\n", str1.replace( 'l', 'L' ) );
	    System.out.printf( "str1.toUpperCase(): %s\n", str1.toUpperCase() );
	    System.out.printf( "str2.toLowerCase(): %s\n\n", str2.toLowerCase() );
	    System.out.printf( "str3.trim: \"%s\"\n\n", str3.trim() ); //remove all white-space characters at the beginning and the end of the string on which method trim operates
	    System.out.print( "str1 as a character array: " );
	    
	    for( char character : array )
	    	System.out.print( character + "  " );

	    System.out.println();
	} //end main
} //end class L9_10