//2017.11.03, jhtp8LOV_ch04.pptx, P87, program that displays truth tables of logic operators

package L5;

public class L5_4
{
	public static void main( String[] args )
	{
		System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", "Condition AND (&&)", 
				           "false && false", false, //" && false" is meaningless or dead code here because the result is confirmed at the first false
				           "false && true", false, //" && true" is meaningless or dead code here because the result is confirmed at the first false
				           "true && false", true && false, 
				           "true && true", true && true ); //the format specifier "%b" displays the word "true" or "false" based on a boolean expression's value
		System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", "Condition OR (||)", 
		           "false || false", false || false, 
		           "false || true", false || true, 
		           "true || false", true, //" || false" is meaningless or dead code here because the result is confirmed at the first true
		           "true || true", true //" || true" is meaningless or dead code here because the result is confirmed at the first true
				   );
		System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", "Boolean logical AND (&)", 
		           "false & false", false & false, 
		           "false & true", false & true, 
		           "true & false", true & false, 
		           "true & true", true & true );
		System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", "Boolean logical inclusive OR (|)", 
		           "false | false", false | false, 
		           "false | true", false | true, 
		           "true | false", true | false, 
		           "true | true", true | true );
		System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", "Boolean logical exclusive OR (^)", 
		           "false ^ false", false ^ false, 
		           "false ^ true", false ^ true, 
		           "true ^ false", true ^ false, 
		           "true ^ true", true ^ true );
		System.out.printf( "%s\n%s: %b\n%s: %b\n", "Logical NOT (!)", "! false", ! false , "! true", ! true );
	} //end main
} //end class L5_4