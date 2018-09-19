//2017.10.26, jhtp8LOV_ch03.pptx, P85, program that compares prefix increment operators (++x) and postfix increment operators (x++)

package L4;

public class L4_4
{
	public static void main( String[] args )
	{
		int x = 5;
		
		System.out.println( x );
		System.out.println( ++x );
		System.out.println( x );
		System.out.println(); //skip a line
		
		x = 5;
		
		System.out.println( x );
		System.out.println( x++ );
		System.out.println( x );
	} //end main
} //end class L4_4