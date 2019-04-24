// LS2.docx, Exercise 6, temperature converter

package LS2;

import java.util.Scanner;

public class LS2_E6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int selection, run = 1;
		double C, F;
		
		// loop until 0 is entered by the user
		while (run != 0)
		{
			System.out.println("**********************************************************************************************"); // these asterisks are used for a better layout
			System.out.print("Select a converter (1: Fahrenheit to Celsius converter, 2: Celsius to Fahrenheit converter): ");
			selection = input.nextInt();
			
			// determine which converter to run
			switch (selection)
			{
			case 1:
				System.out.print("\nEnter a temperature (℉): ");
			    F = input.nextDouble();
			    Celsius(F); // call the specified method to calculate the Celsius equivalent of a Fahrenheit temperature
			    break;
			    
			case 2:
			    System.out.print("\nEnter a temperature (℃): ");
			    C = input.nextDouble();
			    Fahrenheit(C); // call the specified method to calculate the Fahrenheit equivalent of a Celsius temperature
			    break;
			    
			// execute if the user enters 1 number which is an unspecified one
			default:
			    System.out.println("\nError! There is no such selection.");
			} // end switch-case
			
			System.out.print("\nEnter 0 to quit or any integer to start a new calculation: "); // ask the user whether to start a new calculation
		    run = input.nextInt();
		    System.out.println();
		} // end while
		
		input.close(); // close "input" of class Scanner to avoid resource leak
	} // end main
	
	/**
	 * Calculate the Celsius equivalent of a Fahrenheit temperature.
	 * @param F a Fahrenheit temperature to be calculated
	 */
	public static void Celsius(double F)
	{
		double result = 5.0 / 9.0 * (F - 32);
		
		System.out.printf("\nThe Celsius equivalent: %.1f℃\n", result);
	} // end method Celsius
	
	/**
	 * Calculate the Fahrenheit equivalent of a Celsius temperature.
	 * @param C a Celsius temperature to be calculated
	 */
	public static void Fahrenheit(double C)
	{
		double result = 9.0 / 5.0 * C + 32;
		
		System.out.printf("\nThe Fahrenheit equivalent: %.1f℉\n", result);
	} // end method Fahrenheit
} // end class LS2_E6