/* 
 * an extension of Exercise 3, triangle printing program;
 * this program rewritten from LS1_E3_2.java enables the user to set the number of lines
 */

package LS1;

import java.util.Scanner;

public class LS1_E3_4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of lines (a proper positive integer): ");
		int line = input.nextInt();
		System.out.println();
		
		/* 
		 * print a left-aligned regular triangle (10 lines);
		 * determine the lines
		 */
		for (int i = 1; i <= line; i++)
		{
			// determine how many asterisks a specified line has
			for (int j = 1; j <= i; j++)
				System.out.print("*");
		    
			System.out.println();
		} // end for
		
		System.out.println();
		
		// print a left-aligned inverted triangle
		for (int i = line; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			
			System.out.println();
		} // end for
		
		System.out.println();
		
		// print a right-aligned inverted triangle
		for (int i = 1; i <= line; i++)
		{
			for (int s = 1; s < i; s++)
				System.out.print(" ");
			
			for (int j = line - i; j >= 0; j--)
				System.out.print("*");
			
			System.out.println();
		} // end for
		
		System.out.println();
		
		// print a right-aligned regular triangle
		for (int i = line; i >= 1; i--)
		{
			for (int s = 1; s < i; s++)
				System.out.print(" ");
			
		    for (int j = line - i; j >= 0; j--)
		    	System.out.print("*");
		    
		    System.out.println();
		} // end for
		
		input.close(); // close "input" of class Scanner to avoid resource leak
	} // end main
} // end class LS1_E3_4