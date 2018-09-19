//2017.12.18, program that indicates one way to read a character from the user

package L12;

import java.util.Scanner;

public class L12_1
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		int run = 1;
		char selection;
		
		System.out.println( "  A: calculate 14 × 59\n  B: calculate 2442 ÷ 3\n  Q: quit" );
		
		//loop until the menu option Q is chosen
		while( run != 0 )
		{		
			System.out.println( "*******************************************************" ); //these asterisks are used for a better layout
			System.out.print( "Enter your selection (A/B/Q, the lowercase letter also accepted): " );
			selection = input.next().charAt( 0 ); //read a character from the user
			System.out.println();
			
			switch( selection )
			{
			case 'A':
			case 'a':
				System.out.println( "The result: " + 14 * 59 );
				break;
				
			case 'B':
			case 'b':
				System.out.println( "The result: " + 2442 / 3 );
				break;
				
			case 'Q':
			case 'q':
				run = 0;
				break;
			
			//execute if the user enters one character which is an unspecified one
			default:
				System.out.println( "Error! There is no such selection." );
			} //end switch-case
			
			System.out.println();
		} //end while
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end main
} //end class L12_1