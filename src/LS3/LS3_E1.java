//2017.11.21, LS3.docx, Exercise 1, sales commission calculator

package LS3;

import java.util.Scanner;

public class LS3_E1
{
	private static int[] frequency = new int[ 9 ]; //store frequency of salary in each range of $10.00
	
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		int salary, counter = 0, run = 1;
		double sail;
		
		//loop until 0 is entered by the user
		while( run != 0 )
		{
			counter++; //salesperson counter
			
			System.out.printf( "******************************************************* Salesperson %d\n", counter ); //these asterisks are used for a better layout
			System.out.print( "Enter how much the salesperson grossed in sales in a week: $" );
			sail = input.nextDouble();
			
			//loop until a proper number is entered
			while( sail < 0 )
		    {
		    	System.out.print( "Error! Please enter again: $" );
		    	sail = input.nextDouble();
		    } //end while
			
			salary = CalculateSalary( sail ); //call the method to calculate this salesperson's earned salary that is truncated to an integer amount
			CalculateFrequency( salary ); //call the specified method to calculate each salary frequency
			
			System.out.println( "Earned salary that is truncated to an integer amount: $" + salary );
			System.out.print( "\nEnter 0 to quit or any integer to continue: " ); //ask the user whether to continue calculations for another salesperson
		    run = input.nextInt();
		    System.out.println();
		} //end while
		
		OutputFrequency(); //call the specified method to output the salary distribution chart of all salespeople
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end main
	
	/**
	 * Calculate the earned salary that is truncated to an integer amount.
	 * @param sail dollars that the salesperson grossed in sales in a week
	 * @return the earned salary
	 */
	public static int CalculateSalary( double sail )
	{
		int salary = 200 + ( int ) ( sail * 0.09 );
		
		return salary;
	} //end method CalculateSalary
	
	/**
	 * Calculate each salary frequency.
	 * @param salary the salesperson's earned salary
	 */
	public static void CalculateFrequency( int salary )
	{	
		//for each salary, increment the appropriate frequency
		if( salary >= 1000 )
			++frequency[ 8 ];
		else if( salary >= 900 )
			++frequency[ 7 ];
		else if( salary >= 800 )
			++frequency[ 6 ];
		else if( salary >= 700 )
			++frequency[ 5 ];
		else if( salary >= 600 )
			++frequency[ 4 ];
		else if( salary >= 500 )
			++frequency[ 3 ];
		else if( salary >= 400 )
			++frequency[ 2 ];
		else if( salary >= 300 )
			++frequency[ 1 ];
		else if( salary >= 200 )
			++frequency[ 0 ];
	} //end method CalculateFrequency
	
	/**
	 * Output the salary distribution chart of all salespeople.
	 */
	public static void OutputFrequency()
	{
		System.out.println( "^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^" ); //these symbols are used for a better layout
		System.out.println( "Overall salary distribution:" );
		
		int left, right;
		
		for( int counter = 0; counter < frequency.length; counter++ )
		{
			if( counter == 8 )
				System.out.println( "$1000 and over: " + frequency[ 8 ] );
			else
			{
				left = ( counter + 2 ) * 100;
				right = left + 99;
				
				System.out.printf( "$%d  ——  $%d: " + frequency[ counter ] + "\n", left, right );
			} //end if...else
		} //end for
	} //end method OutputFrequency
} //end class LS3_E1