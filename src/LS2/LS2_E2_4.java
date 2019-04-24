/* 
 * an extension of Exercise 2, hypotenuse calculator;
 * this program rewritten from LS2_E2_2.java uses method hypot in class Math instead of the programmer-declared method hypotenuse
 */

package LS2;

import java.util.Scanner;

public class LS2_E2_4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int run = 1;
		double side1, side2, hypotenuse;
		
		System.out.println("ATTENTION: Proper positive numbers are required.");
		
		// loop until 0 is entered by the user
		while (run != 0)
		{
			System.out.println("***********************************************************"); // these asterisks are used for a better layout
			System.out.print("Enter the length of Side 1: ");
			side1 = input.nextDouble();
			
			// loop until a proper positive number is entered
			while (side1 <= 0)
		    {
		    	System.out.print("Error! Please enter again: ");
		    	side1 = input.nextDouble();
		    } // end while
			
			System.out.print("\nEnter the length of Side 2: ");
			side2 = input.nextDouble();
			
			// loop until a proper positive number is entered
			while (side2 <= 0)
		    {
		    	System.out.print("Error! Please enter again: ");
		    	side2 = input.nextDouble();
		    } // end while
			
			hypotenuse = Math.hypot(side1, side2); // calculate the length of the hypotenuse
			
			System.out.printf("\nThe length of the hypotenuse: %.1f\n", hypotenuse);
		    System.out.print("\nEnter 0 to quit or any integer to start a new calculation: "); // ask the user whether to start a new calculation
		    run = input.nextInt();
		    System.out.println();
		} // end while
		
		input.close(); // close "input" of class Scanner to avoid resource leak
	} // end main
} // end class LS2_E2_4