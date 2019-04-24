// jhtp8LOV_ch04.pptx, P68, program that displays how a break statement works

package L5;

public class L5_2
{
	public static void main(String[] args)
	{
		int count; // the control variable is also used after the loop terminates, so it needs declaring here but not later in the for statement
		
		// it would loop 10 times without the following break statement
		for (count = 1; count <= 10; count++)
		{
			if (count == 5)
				break; // terminate the loop
			
			System.out.printf("%d ", count);
		} // end for
		
		System.out.printf("\nBroke out of loop at count = %d\n", count);
	} // end main
} // end class L5_2