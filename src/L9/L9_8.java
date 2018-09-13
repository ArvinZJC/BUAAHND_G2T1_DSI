//2017.11.27, jhtp8LOV_ch06.pptx, P122-124, program that uses methods indexOf and lastIndexOf from class String

package L9;

public class L9_8
{
	public static void main( String[] args )
	{
		String str = "abcdefghijklmabcdefghijklm";
		
		System.out.println( "Index -1 means that there is no such character or substring." );
		System.out.println( "*************************************************************" ); //these asterisks are used for a better layout
	    System.out.printf( "'c' is located at Index %d.\n", str.indexOf( 'c' ) );
	    System.out.printf( "'a' is located at Index %d.\n", str.indexOf( 'a', 1 ) );
	    System.out.printf( "'$' is located at Index %d.\n\n", str.indexOf( '$' ) );
	    System.out.printf( "Last 'c' is located at Index %d.\n", str.lastIndexOf( 'c' ) );
	    System.out.printf( "Last 'a' is located at Index %d.\n", str.lastIndexOf( 'a', 25 ) );
	    System.out.printf( "Last '$' is located at Index %d.\n\n", str.lastIndexOf( '$' ) );
	    System.out.printf( "\"def\" is located at Index %d.\n", str.indexOf( "def" ) );
	    System.out.printf( "\"def\" is located at Index %d.\n", str.indexOf( "def", 7 ) );
	    System.out.printf( "\"hello\" is located at Index %d.\n\n", str.indexOf( "hello" ) );
	    System.out.printf( "Last \"def\" is located at Index %d.\n", str.lastIndexOf( "def" ) );
	    System.out.printf( "Last \"def\" is located at Index %d.\n", str.lastIndexOf( "def", 25 ) );
	    System.out.printf( "Last \"hello\" is located at Index %d.\n", str.lastIndexOf( "hello" ) );
	} //end method main
} //end class L9_8