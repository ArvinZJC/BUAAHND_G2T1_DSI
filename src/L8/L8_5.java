// program that uses Bubble Sort

package L8;

public class L8_5
{
	public static void main(String[] args)
	{
		int temp;
		int[] array = {5, 5, 2, 5, 3};
		boolean run;
		
		System.out.println("Before sorting:");
		OutputArray(array); // call the specified method to output the specified array
		
		for (int i = 0; i < array.length - 1; i++)
		{
			run = true;
			
			for (int j = 0; j < array.length - 1 - i; j++)
			{
				if (array[j] > array[j + 1])
				{
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					run = false;
				} // end if
			} // end for
			
			if (run)
				break;
		} // end for
		
		System.out.println("\nAfter sorting:");
		OutputArray(array); // call the specified method to output the specified array
	} // end main
	
	/**
	 * Output the specified array.
	 * @param array the array to be output
	 */
	public static void OutputArray(int[] array)
	{
		for (int number : array)
			System.out.print(number + "  ");
	} // end method OutputArray
} // end class L8_5