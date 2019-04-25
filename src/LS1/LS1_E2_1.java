// LS1.docx, Exercise 2, sales commission calculator

package LS1;

import java.util.Scanner;

public class LS1_E2_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int amount1, amount2, amount3, amount4;
		double totalValue1, totalValue2, totalValue3, totalValue4, earnings;
		
		System.out.print("Enter the amount of Item 1 sold (a proper positive integer): ");
		amount1 = input.nextInt();
		
		// loop until a proper positive integer is entered
		while (amount1 <= 0)
	    {
	    	System.out.print("Error! Please enter again: ");
	    	amount1 = input.nextInt();
	    } // end while
	    
		System.out.print("Enter the amount of Item 2 sold (a proper positive integer): ");
		amount2 = input.nextInt();
		
		// loop until a proper positive integer is entered
		while (amount2 <= 0)
	    {
	    	System.out.print("Error! Please enter again: ");
	    	amount2 = input.nextInt();
	    } // end while
		
		System.out.print("Enter the amount of Item 3 sold (a proper positive integer): ");
		amount3 = input.nextInt();
		
		// loop until a proper positive integer is entered
		while (amount3 <= 0)
	    {
	    	System.out.print("Error! Please enter again: ");
	    	amount3 = input.nextInt();
	    } // end while
		
		System.out.print("Enter the amount of Item 4 sold (a proper positive integer): ");
		amount4 = input.nextInt();
		
		// loop until a proper positive integer is entered
		while (amount4 <= 0)
	    {
	    	System.out.print("Error! Please enter again: ");
	    	amount4 = input.nextInt();
	    } // end while
		
		totalValue1 = (double)239.99 * amount1; // calculate the value of Item 1 sold
		totalValue2 = (double)129.75 * amount2; // calculate the value of Item 2 sold
		totalValue3 = (double)99.95 * amount3; // calculate the value of Item 3 sold
		totalValue4 = (double)350.89 * amount4; // calculate the value of Item 4 sold
		earnings = 200 + (totalValue1 + totalValue2 + totalValue3 + totalValue4) * 0.09; // calculate the sales commission
		
		System.out.println("\nItem 1    Item 2    Item 3    Item 4    Earnings");
		System.out.printf("%6d%10d%10d%10d    $%.2f\n", amount1, amount2, amount3, amount4, earnings);
		
		input.close();
	} // end main
} // end class LS1_E2_1