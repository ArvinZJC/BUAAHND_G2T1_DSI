// jhtp8LOV_ch05.pptx, P20 & 21, program that gets the max of 3 numbers using a programmer-declared method

package L5;

import java.util.Scanner;

public class L5_5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double number1, number2, number3, result;
		
		System.out.print("Enter 3 numbers each separated by a space: ");
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		number3 = input.nextDouble();
		/*
		 * call the specified method to determine the max of 3 numbers;
		 * if the programmer-declared method getMax below was not written, this statement would be incorrect and could not determine the max
		 */
		result = getMax(number1, number2, number3);
		System.out.println("The max: " + result);
		
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
		double max = number1; // assume that "number1" is the largest to start
		
		// determine whether "number2" is larger than "max"
		if (number2 > max)
			max = number2;
		
		// determine whether "number3" is larger than "max"
		if (number3 > max)
			max = number3;
		
		return max;
	} // end method getMax
} // end class L5_5