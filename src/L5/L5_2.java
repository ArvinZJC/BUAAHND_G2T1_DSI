//2017.11.03, jhtp8LOV_ch04.pptx, P68, program that displays how a break statement works

package L5;

public class L5_2
{
	public static void main( String[] args )
	{
		int counter; //the control variable is also used after the loop terminates, so it needs declaring here but not later in the for statement
		
		//it would loop 10 times without the following break statement
		for( counter = 1; counter <= 10; counter++ )
		{
			if( counter == 5 )
				break; //terminate the loop
			
			System.out.printf( "%d ", counter );
		} //end for
		
		System.out.printf( "\nBroke out of loop at counter = %d\n", counter );
	} //end main
} //end class L5_2