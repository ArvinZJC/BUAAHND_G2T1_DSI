//2017.11.03, jhtp8LOV_ch04.pptx, P70, program that displays how a continue statement works

package L5;

public class L5_3
{
	public static void main( String[] args )
	{
		//loop 10 times
		for( int counter = 1; counter <= 10; ++counter )
		{
			if( counter == 5 )
				continue; //skip the remaining code in the loop
			
			System.out.printf( "%d ", counter );
		} //end for
		
		System.out.println( "\nUsed continue to skip printing 5." );
	} //end method main
} //end class L5_3