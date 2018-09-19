//2017.11.27, jhtp8LOV_ch06.pptx, P135 & 136, program that uses method valueOf from class String

package L9;

public class L9_11
{
	public static void main( String[] args )
	{
		char[] array = { 'a', 'b', 'c', 'd', 'e', 'f' };
	    boolean value1 = true;
	    char value2 = 'Z';
	    int value3 = 7;
	    long value4 = 10000000000L;
	    float value5 = 2.5f;
	    double value6 = 33.333;
	    Object reference = "hello"; //assign a string to an Object reference
	    
	    System.out.printf( "A character array: %s\n", String.valueOf( array ) );
	    System.out.printf( "A part of chararacter array: %s\n", String.valueOf( array, 3, 3 ) );
	    System.out.printf( "Type boolean: %s\n", String.valueOf( value1 ) );
	    System.out.printf( "Type char: %s\n", String.valueOf( value2 ) );
	    System.out.printf( "Type int: %s\n", String.valueOf( value3 ) );
	    System.out.printf( "Type long: %s\n", String.valueOf( value4 ) ); 
	    System.out.printf( "Type float: %s\n", String.valueOf( value5 ) ); 
	    System.out.printf( "Type double: %s\n", String.valueOf( value6 ) ); 
	    System.out.printf( "An object: %s\n", String.valueOf( reference ) );
	} //end main
} //end class L9_11