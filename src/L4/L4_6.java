// jhtp8LOV_ch04.pptx, P32, program that sums even integers between 2 and 20 with a for repetition statement

package L4;

public class L4_6
{
	public static void main(String[] args)
	{
		int total = 0;
		
		// loop to get even integers between 2 and 20
		for (int number = 2; number <= 20; number += 2)
			total += number; // add the even integer to "total" each time
		
		System.out.printf("Sum: %d\n", total);
	} // end main
} // end class L4_6