/* 
 * LS1.docx, Exercise 4, diamond printing program;
 * my 1st method (with for repetition statements and if...else statements)
 */

package LS1;

public class LS1_E4_1
{
	public static void main(String[] args)
	{
		boolean a;
		
		// determine the lines
		for (int i = 1; i <= 9; i++)
		{
			// determine how many asterisks a specified line has
			for (int j = 1; j <= 9; j++)
			{
				if (i <= 5)
					a = 5 - (i - 1) <= j && 5 + (i - 1) >= j; // another expression with the same effect is "a = (5 - j < i && 5 - j >= 0) || (j - 5 < i && j - 5 >= 0)"
				else
					a = i - (5 - 1) <= j && 9 - (i - 5) >= j; // another expression with the same effect is "a = (5 - j <= 9 - i && 5 - j >= 0) || (j - 5 <= 9 - i && j - 5 >= 0)"
				
				if (a)
					System.out.print("*");
				else
					System.out.print(" ");
			} // end for
			
			System.out.println();
		} // end for
	} // end main
} // end class LS1_E4_1