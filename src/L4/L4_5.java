// jhtp8LOV_ch04.pptx, P13, program that prints integers between 1 and 10 using counter-controlled repetition with a for repetition statement

package L4;

public class L4_5
{
	public static void main(String[] args)
	{
		/*
		 * loop 10 times;
		 * the for repetition statement is typically used for counter-controlled repetition and the while repetition statement for sentinel-controlled repetition
		 */
		for (int count = 1; count <= 10; count++)
			System.out.printf("%d ", count);
		
		System.out.println();
	} // end main
} // end class L4_5