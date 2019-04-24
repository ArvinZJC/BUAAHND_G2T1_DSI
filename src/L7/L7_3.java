// jhtp8LOV_ch06.pptx, P21, program that initialises the elements of an array to default values of 0

package L7;

public class L7_3
{
	public static void main(String[] args)
	{
		/*
		 * declare an array named array and create the array object;
		 * pay attention that 10 indicates Index 0-9 and also the array's length which is equal to the number of elements in the array
		 */
		int[] array = new int[10];
		
		System.out.printf("%s%8s\n", "Index", "Value");
		
		// output each array element's value
		for (int count = 0; count < array.length; count++)
			System.out.printf("%5d%8d\n", count, array[count]);
	} // end main
} // end class L7_3