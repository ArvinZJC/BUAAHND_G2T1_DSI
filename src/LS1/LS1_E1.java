//2017.11.01, LS1.docx, Exercise 1, gas mileage calculator

package LS1;

import java.util.Scanner;

public class LS1_E1
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		int mile, gallon, totalMile = 0, totalGallon = 0, counter = 0, run = 1;
		double milePerGallon_Current, milePerGallon_All;
	    
		//loop until 0 is entered by the user
		while( run != 0 )
		{
			counter++; //trip counter
			
			System.out.printf( "******************************************* Trip %d\n", counter ); //these asterisks are used for a better layout
		    System.out.print( "Enter miles driven (a proper positive integer): " );
		    mile = input.nextInt();
		    
		    //loop until a proper positive integer is entered
		    while( mile <= 0 )
		    {
		    	System.out.print( "Error! Please enter again: " );
		    	mile = input.nextInt();
		    } //end while
		    
		    System.out.print( "Enter gallons used (a proper positive integer): " );
		    gallon = input.nextInt();
		    
		    //loop until a proper positive integer is entered
		    while( gallon <= 0 )
		    {
		    	System.out.print( "Error! Please enter again: " );
		    	gallon = input.nextInt();
		    } //end while
		    
		    milePerGallon_Current = ( double ) mile / gallon; //calculate miles per gallon of this trip
		    totalMile += mile; //calculate miles of all
		    totalGallon += gallon; //calculate gallons of all
		    
		    System.out.println( "\nMiles of this trip: " + mile );
		    System.out.println( "Gallons of this trip: " + gallon );
		    System.out.printf( "Miles per gallon of this trip: %.2f\n", milePerGallon_Current );
		    System.out.print( "\nEnter 0 to quit or any integer to continue: " ); //ask the user whether to continue calculations for another trip
		    run = input.nextInt();
		    System.out.println();
		} //end while
		
		milePerGallon_All = ( double ) totalMile / totalGallon; //calculate miles per gallon of all
		
		System.out.println( "^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^" ); //these symbols are used for a better layout
		System.out.printf( "Miles per gallon of all: %.2f\n", milePerGallon_All );
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end method main
} //end class LS1_E1