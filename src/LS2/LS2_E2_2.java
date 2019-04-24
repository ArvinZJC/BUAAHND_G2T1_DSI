/* 
 * an extension of Exercise 2, hypotenuse calculator;
 * this program rewritten from LS2_E2_1.java enables the user to enter the length of the sides of a right triangle
 */

package LS2;

import java.util.Scanner;

public class LS2_E2_2
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
			System.out.println("************************************************"); // these asterisks are used for a better layout
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
			
			hypotenuse = Hypotenuse(side1, side2); // call the specified method to calculate the length of the hypotenuse
			System.out.printf("\nThe length of the hypotenuse: %.1f\n", hypotenuse);
		    System.out.print("\nEnter 0 to quit or any integer to start a new calculation: "); // ask the user whether to start a new calculation
		    run = input.nextInt();
		    System.out.println();
		} // end while
		
		input.close(); // close "input" of class Scanner to avoid resource leak
	} // end main
	
	/**
	 * Calculate the length of the hypotenuse.
	 * @param side1 the length of Side 1
	 * @param side2 the length of Side 2
	 * @return the length of the hypotenuse
	 */
	public static double Hypotenuse(double side1, double side2)
	{
		double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
		
		return hypotenuse;
	} // end method Hypotenuse
} // end class LS2_E2_2