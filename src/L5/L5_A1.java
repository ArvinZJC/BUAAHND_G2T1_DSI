//2017.11.04, Assignment 1, program that decide whether the number entered is a positive integer

package L5;

import java.util.Scanner;

public class L5_A1
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Enter a numberber: " );
		double number = input.nextDouble();
		
		//this is the very condition to determine whether a number is a positive integer
		if( number > 0 && number % 1 == 0 )
			System.out.println( "It is a positive integer." );
		else
			System.out.println( "It is not a positive integer." );
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end method main
} //end class L5_A1