// LS2.docx, Exercise 1, parking charge calculator

package LS2;

import java.util.Scanner;

public class LS2_E1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int count = 0, run = 1;
		double hour, charge, totalCharge = 0.00;
		
		// loop until 0 is entered by the user
		while (run != 0)
		{
			count++; // customer count
			
			System.out.printf("******************************************* Customer %d\n", count); // these asterisks are used for a better layout
		    System.out.print("Enter hours parked (0-24, 0 excluded): ");
		    hour = input.nextDouble();
		    
		    // loop until a proper number is entered
		    while (hour <= 0 || hour > 24)
		    {
		    	System.out.print("Error! Please enter again: ");
		    	hour = input.nextDouble();
		    } // end while
		    
		    charge = CalculateCharge(hour); // call the specified method to calculate the parking charge
		    
		    totalCharge += charge; // calculate the running total of yesterday's receipts
		    
		    System.out.printf("\nThe parking charge: $%.2f\n", charge);
		    System.out.print("\nEnter 0 to quit or any integer to continue: "); // ask the user whether to continue calculations for another customer
		    run = input.nextInt();
		    System.out.println();
		} // end while
		
		System.out.println("^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^"); // these symbols are used for a better layout
		System.out.printf("The running total of yesterday's receipts: $%.2f\n", totalCharge);
		
		input.close(); // close "input" of class Scanner to avoid resource leak
	} // end main
	
	/**
	 * Calculate the parking charge.
	 * @param hour hours parked
	 * @return the parking charge
	 */
	public static double CalculateCharge(double hour)
	{
		double charge;
		
		if (hour <= 3)
	    	charge = 2.00; // charge a $2.00 minimum fee to park for up to 3 hours
	    else if (hour > 3 && hour <= 18)
	    	charge = 2.00 + (Math.ceil(hour) - 3) * 0.50; // charge an additional $0.50 per hour for each hour or part thereof in excess of three hours
	    else
	    	charge = 10.00; // the maximum charge for any given 24-hour period is $10.00
	    
	    return charge;
	} // end method CalculateCharge
} // end class LS2_E1