// jhtp8LOV_ch06.pptx, P27, program that calculates values to be placed into elements of an array

package L7;

public class L7_5
{
	public static void main(String[] args)
	{
		final int ARRAY_LENGTH = 10; // declare a constant
		int[] array = new int[ARRAY_LENGTH];
		
		System.out.printf("%s%8s\n", "Index", "Value");
		
		// output each array element's value
		for (int count = 0; count < array.length; ++count)
		{
			array[count] = 2 + 2 * count;
			
			System.out.printf("%5d%8d\n", count, array[count]);
		} // end for	
	} // end main
} // end class L7_5