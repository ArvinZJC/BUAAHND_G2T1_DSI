//2017.11.27, jhtp8LOV_ch06.pptx, P109-112, program that uses methods equals, equalsIgnoreCase and regionMatchces from class String
package L9;

public class L9_6
{
	public static void main( String[] args )
	{
		String str1 = new String( "hello" ); //str1 is a copy of "hello", and they are not the same object
		String str2 = "goodbye";
		String str3 = "Happy Birthday";
		String str4 = "happy birthday";
		
		System.out.printf( "str1： %s\nstr2： %s\nstr3： %s\nstr4：%s\n\n", str1, str2, str3, str4 );
		
		if( str1.equals( "hello" ) )
			System.out.println( "str1 equals \"hello\"." );
		else
			System.out.println( "str1 does not equal \"hello\"." );
		
		if( str1 == "hello" )
			System.out.println( "str1 is the same object as \"hello\"." );
		else
			System.out.println( "str1 is not the same object as \"hello\"." );
		
		if( str3.equalsIgnoreCase( str4 ) )
			System.out.println( "str3 equals str4 with case ignored." );
		else
			System.out.println( "str1 does not equal str4 even with case ignored." );
		
		System.out.println( "\nstr1.compareTo( str2 ): " + str1.compareTo( str2 ) );
		System.out.println( "str2.compareTo( str1 ): " + str2.compareTo( str1 ) );
		System.out.println( "str1.compareTo( str1 ): " + str1.compareTo( str1 ) );
		System.out.println( "str3.compareTo( str4 ): " + str3.compareTo( str4 ) );
		System.out.println( "str4.compareTo( str3 ): " + str4.compareTo( str3 ) );
		
		if( str3.regionMatches( 0, str4, 0, 5 ) )
			System.out.println( "The first 5 characters of str3 and str4 match." );
		else
			System.out.println( "The first 5 characters of str3 and str4 do not match." );
		
		if( str3.regionMatches( true, 0, str4, 0, 5 ) )
			System.out.println( "The first 5 characters of str3 and str4 match with case ignored." );
		else
			System.out.println( "The first 5 characters of str3 and str4 do not match even with case ignored." );
	} //end method main
} //end class L9_6