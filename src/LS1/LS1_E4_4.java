/* 
 * an extension of Exercise 4, diamond printing program;
 * this program rewritten from LS1_E4_2.java enables the user to set the number of lines;
 * ATTENTION: the result is actually different from that of LS1_E4_3.java because spaces (" ") are not printed on the right side of this "diamond"
 */

package LS1;

import java.util.Scanner;

public class LS1_E4_4
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
		
		// determine the lines
		for (int i = 1; i <= line; i++)
		{
			// determine how many spaces there are in front of the first asterisk of each line
			for (int s = Math.abs(middle - i); s >= 1; s--)
				System.out.print(" ");
			
			// determine how many asterisks a specified line has
			if (i <= middle)
				for (int j = 2 * i - 1; j >= 1; j--)
					System.out.print("*");
			else
				for (int j = -2 * i + 19; j >= 1; j--)
					System.out.print("*");
			
			System.out.println();
		} // end for
		
		input.close(); // close "input" of class Scanner to avoid resource leak
	} // end main
} // end class LS1_E4_4