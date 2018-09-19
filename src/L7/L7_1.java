//2017.11.14, jhtp8LOV_ch05.pptx, P77 & 78, program that demonstrates field and local variable scopes

package L7;

public class L7_1
{
	private static int x = 1; //a field that is accessible to all methods of this class
	
	public static void main( String[] args )
	{
		int x = 5; //method's local variable "x" shadows the field "x"
		
		System.out.printf( "The value of the local variable \"x\" in method main: %d\n", x );
		
		LocalVariable();
		Field();
		LocalVariable();
		Field();
		
		System.out.printf( "\nThe value of the local variable \"x\" in method main: %d\n", x );
	} //end main
	
	/**
	 * Create and initialise the local variable "x".
	 */
	public static void LocalVariable()
	{
		int x = 25; //initialise local variable "x" each time method LocalVariable is called
		
		System.out.printf( "\nThe value of the local variable \"x\" on entering method LocalVariable: %d\n", x );
		
		++x; //modify this method's local variable "x"
		
		System.out.printf( "The value of the local variable \"x\" before exiting method LocalVariable: %d\n", x );
	} //end method LocalVariable
	
	/**
	 * Modify this class's field "x".
	 */
	public static void Field()
	{
		System.out.printf( "\nThe value of the field \"x\" on entering method Field: %d\n", x );
		
		x *= 10;
		
		System.out.printf( "The value of the field \"x\" before exiting method Field: %d\n", x );
	} //end method Field
} //end class L7_1