// jhtp8LOV_ch06.pptx, P35 & 36, bar chart printing program

package L7;

public class L7_7
{
	public static void main(String[] args)
	{
		int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
		
		System.out.println("Grade distribution: ");
		
		// for each array element, output a bar of the chart
		for (int count = 0; count < array.length; count++)
		{
			// output the bar label "100: "
			if (count == 10)
				System.out.printf("%5d: ", 100);
			// output bar labels "00-09: ", "10-19: ", ... and "90-99: "
			else
				System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
			
			// print bars of asterisks
			for (int asterisk = 0; asterisk < array[count]; asterisk++)
				System.out.print("*");
			
			System.out.println();
		} // end for
	} // end main
} // end class L7_7