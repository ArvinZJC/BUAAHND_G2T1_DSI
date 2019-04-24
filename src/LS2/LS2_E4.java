// LS2.docx, Exercise 4, program that determines whether an integer is even or odd

package LS2;

import java.util.Scanner;

public class LS2_E4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number, run = 1;
		
		// loop until 0 is entered by the user
		while (run != 0)
		{
			System.out.println("**********************************************************"); // these asterisks are used for a better layout
			System.out.print("Enter an integer: ");
			number= input.nextInt();
			System.out.println();
			
			// call the specified method to determine whether the statement "the integer is even" is true or false
			if (IsEven(number))
				System.out.println("The integer " + number + " is even.");
			else
				System.out.println("The integer " + number + " is odd.");
			
			System.out.print("\nEnter 0 to quit or any integer to start a new calculation: "); // ask the user whether to start a new calculation
		    run = input.nextInt();
		    System.out.println();
		} // end while
		
		input.close(); // close "input" of class Scanner to avoid resource leak
	} // end main
	
	/**
	 * Determine whether the statement "the integer is even" is true or false.
	 * @param number the number to be validated
	 * @return true (if the statement is true) or false (if the statement is false)
	 */
	public static boolean IsEven(int number)
	{
		if (number % 2 == 0)
			return true;
		else
			return false;
	} // end method IsEven
} // end class LS2_E4