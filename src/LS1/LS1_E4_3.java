/* 
 * an extension of Exercise 4, diamond printing program;
 * this program rewritten from LS1_E4_1.java enables the user to set the number of lines
 */

package LS1;

import java.util.Scanner;

public class LS1_E4_3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of lines (a proper positive odd number): ");
		int line = input.nextInt();
		
		// loop until a proper positive odd number is entered
		while (line % 2 == 0)
		{
			System.out.print("Error! Please enter again: ");
			line = input.nextInt();
		} // end while
		
		System.out.println();
		
		int middle = line / 2 + 1;
		boolean a;
		
		// determine the lines
		for (int i = 1; i <= line; i++)
		{
			// determine how many asterisks a specified line has
			for (int j = 1; j <= line; j++)
			{
				if (i <= middle)
					a = middle - (i - 1) <= j && middle + (i - 1) >= j; // another expression with the same effect is "a = (middle - j < i && middle - j >= 0) || (j - middle < i && j - middle >= 0)"
				else
					a = i - (middle - 1) <= j && line - (i - middle) >= j; // another expression with the same effect is "a = (middle - j <= line - i && middle - j >= 0) || (j - middle <= line - i && j - middle >= 0)"
				
				if (a)
					System.out.print("*");
				else
					System.out.print(" ");
			} // end for
			
			System.out.println();
			
			input.close(); // close "input" of class Scanner to avoid resource leak
		} // end for
	} // end main
} // end class LS1_E4_3