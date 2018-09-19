//2017.11.22, LS3.docx, Exercise 3, simplified airline reservations system

package LS3;

import java.util.Scanner;
import java.util.Random;

public class LS3_E3
{
	private static final Random randomNumber = new Random();
	/**
	 * Numbers 1-10 each represent Seats 1-10 and 0 represents that there is no remaining seat in First Class or Economy.
	 */
	private static int seat;
	/** 
	 * The value "true" indicates that the seat is assigned, while "false" indicates that the seat is empty.
	 * The element whose index is 0 does not participate in the process to make it convenient to indicate the status of Seats 1-10.
	 */
	private static boolean[] status = new boolean[ 11 ];
	
	public static void main( String[] args )
	{	
		Scanner input = new Scanner( System.in );
		
		int firstSelection, secondSelection_FirstClass, secondSelection_Economy, run;
		
		//loop at most 10 times to assign the seats
		for( int counter = 1; counter <= 10; ++counter )
		{
			System.out.printf( "******************************************************* Reservation %d\n", counter ); //these asterisks are used for a better layout
			System.out.print( "Enter 1 for First Class or 2 for Economy: " );
			firstSelection = input.nextInt();
			
			//loop until a proper selection is entered
			while( firstSelection != 1 && firstSelection != 2 )
		    {
		    	System.out.print( "Error! Please enter again: " );
		    	firstSelection = input.nextInt();
		    } //end while
			
			if( firstSelection == 1 )
			{
				FirstClass(); //call the specified method to assign a seat in First Class
				
				//execute if First Class is full
				if( seat == 0 )
				{
					System.out.print( "\nEnter any integer to turn to Economy or 0 to cancel the reservation: " );
					secondSelection_FirstClass = input.nextInt();
					
					if( secondSelection_FirstClass == 0 )
					{
						--counter;
						
						System.out.println( "\nNext flight leaves in 3 hours." );	
					}
					else
						Economy(); //call the specified method to turn to Economy for a seat
				} //end if
			}
			else
			{
				Economy(); //call the specified method to assign a seat in Economy
				
				//execute if Economy is full
				if( seat == 0 )
				{
					System.out.print( "\nEnter any integer to turn to First Class or 0 to cancel the reservation: " );
					secondSelection_Economy = input.nextInt();
					
					if( secondSelection_Economy == 0 )
					{
						--counter;
						
						System.out.println( "\nNext flight leaves in 3 hours." );	
					}
					else
						FirstClass(); //call the specified method to turn to First Class for a seat
				} //end if
			} //end if...else
			
			System.out.print( "\nEnter 0 to quit or any integer to start a new reservation: " );
		    run = input.nextInt();
		    
		    if( run == 0 )
		    	break;
		    else
		    {
		    	System.out.println();
		    	
		    	if( counter == 10 )
		    	{
		    		System.out.println( "^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^_^" ); //these symbols are used for a better layout
					System.out.println( "No seat available. Next flight leaves in 3 hours." );
		    	} //end if
		    } //end if...else
		} //end for
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end main
	
	/**
	 * Attempt to assign a seat in First Class.
	 */
	public static void FirstClass()
	{
		do
		{
			seat = 1 + randomNumber.nextInt( 5 ); //pick a random seat between Seat 1 and Seat 5
			
			if( status[ seat ] )
				seat = 0;
			else
			{
				status[ seat ] = true;
				
				System.out.printf( "\nYour boarding pass: Seat %d in First Class\n", seat );
				
				break;
			} //end if...else
		} while( status[ 1 ] == false || status[ 2 ] == false || status[ 3 ] == false || status[ 4 ] == false || status[ 5 ] == false );
		
		if( seat == 0 )
			System.out.println( "\nFailed! First Class is full." );
	} //end method FirstClass
	
	/**
	 * Attempt to assign a seat in Economy.
	 */
	public static void Economy()
	{
		do
		{
			seat = 6 + randomNumber.nextInt( 5 ); //pick a random seat between Seat 6 and Seat 10
			
			if( status[ seat ] )
				seat = 0;
			else
			{
				status[ seat ] = true;
				
				System.out.printf( "\nYour boarding pass: Seat %d in Economy\n", seat );
				
				break;
			} //end if...else
		} while( status[ 6 ] == false || status[ 7 ] == false || status[ 8 ] == false || status[ 9 ] == false || status[ 10 ] == false );
		
		if( seat == 0 )
			System.out.println( "\nFailed! Economy is full." );
	} //end method Economy
} //end class LS3_E3_2