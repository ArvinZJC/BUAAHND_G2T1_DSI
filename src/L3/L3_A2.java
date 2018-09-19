//2017.10.17, Assignment 2, program rewritten from L3_1.java with nested if...else statements

package L3;

import java.util.Scanner;

public class L3_A2
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		int number1, number2;
		
		System.out.print( "Enter the first integer: " );
		number1 = input.nextInt();
		
		System.out.print( "Enter the second integer: " );
		number2 = input.nextInt();
		
		if( number1 == number2 )
			System.out.printf( "%d == %d\n", number1, number2 );
		else
		{
			System.out.printf( "%d != %d\n", number1, number2 );
			if( number1 < number2 )
				System.out.printf( "%d < %d\n", number1, number2 );
			else
		        System.out.printf( "%d > %d\n", number1, number2 );		
		} //end if...else
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end main
} //end class L3_A2