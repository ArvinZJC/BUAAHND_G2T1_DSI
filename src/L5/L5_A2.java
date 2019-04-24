/*
 * Assignment 2, program that gets the max of 3 numberbers using a programmer-declared method;
 * this program rewritten from L5_5.java can do the comparison more than once
 */

package L5;

import java.util.Scanner;

public class L5_A2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int run = 1;
		double number1, number2, number3, result;
		
		// loop until the sentinel value read from the user
		while (run != 0)
		{
			System.out.print("Enter 3 numbers each separated by a space: ");
			number1 = input.nextDouble();
			number2 = input.nextDouble();
			number3 = input.nextDouble();
			
			result = getMax(number1, number2, number3); // call the specified method to determine the max of 3 numbers
			
			System.out.println("The max: " + result);
			System.out.print("\nEnter 0 to quit or any integer to continue: ");
		    run = input.nextInt();
		    System.out.println("********************************************************************"); // these asterisks are used for a better layout
		} // end while
		
		input.close(); // close "input" of class Scanner to avoid resource leak
	} //end main
	
	/**
	 * Determine the max of 3 numbers.
	 * @param number1 Number 1 to be compared
	 * @param number2 Number 2 to be compared
	 * @param number3 Number 3 to be compared
	 * @return the max of 3 numbers
	 */
	public static double getMax(double number1, double number2, double number3)
	{
		double temp, max;
		
		temp = (number1 > number2) ? number1 : number2; // assign the max of "number1" and "number2" to "temp"
		max = (number3 > temp) ? number3 : temp; // assign the max of "number3" and "temp" to "max"
		
		return max;
	} // end method getMax
} // end class L5_A2