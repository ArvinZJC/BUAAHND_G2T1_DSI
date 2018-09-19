//2017.10.28, jhtp8LOV_ch04.pptx, P45, program that prints integers between 1 and 10 with a do...while repetition statement

package L4;

public class L4_8
{
	public static void main( String[] args )
	{
		int counter = 1;
		
		do
		{
			System.out.printf( "%d ", counter );
			
			counter++;
		} while( counter <= 10 ); //loop 10 times
		
		System.out.println();
	} //end main
} //end class L4_8