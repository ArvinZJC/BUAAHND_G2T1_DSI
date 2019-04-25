// program that uses selection sort

package L8;

public class L8_6
{
	public static void main(String[] args)
	{
		int k, temp;
		int[] array = {5, 5, 2, 5, 3};
		
		System.out.println("Before sorting:");
		OutputArray(array); // call the specified method to output the specified array
		
		for (int i = 0; i < array.length - 1; i++)
		{
			k = i;
			
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[k] > array[j])
					k = j;
			} // end for
			
			if (i != k)
			{
				temp = array[i];
				array[i] = array[k];
				array[k] = temp;
			}
			else
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
} // end class L8_6