/* 
 * LS1.docx, Exercise 3, triangle printing program;
 * my 2nd method (with for repetition statements)
 */

package LS1;

public class LS1_E3_2
{
	public static void main(String[] args)
	{
		/* 
		 * print a left-aligned regular triangle (10 lines);
		 * determine the lines
		 */
		for (int i = 1; i <= 10; i++)
		{
			// determine how many asterisks a specified line has
			for (int j = 1; j <= i; j++)
				System.out.print("*");
		    
			System.out.println();
		} // end for
		
		System.out.println();
		
		// print a left-aligned inverted triangle (10 lines)
		for (int i = 10; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			
			System.out.println();
		} // end for
		
		System.out.println();
		
		// print a right-aligned inverted triangle (10 lines)
		for (int i = 1; i <= 10; i++)
		{
			for (int s = 1; s < i; s++)
				System.out.print(" ");
			
			for (int j = 10 - i; j >= 0; j--)
				System.out.print("*");
			
			System.out.println();
		} // end for
		
		System.out.println();
		
		// print a right-aligned regular triangle (10 lines)
		for (int i = 10; i >= 1; i--)
		{
			for (int s = 1; s < i; s++)
				System.out.print(" ");
			
		    for (int j = 10 - i; j >= 0; j--)
		    	System.out.print("*");
		    
		    System.out.println();
		} // end for
	} // end main
} // end class LS1_E3_2