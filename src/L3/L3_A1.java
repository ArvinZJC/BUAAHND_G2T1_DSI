//2017.10.17, Assignment 1, program that calculates age gap between two people

package L3;

import java.util.Scanner;

public class L3_A1
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		int year1, year2, month1, month2, total1, total2;
		
		System.out.print( "Enter the number of years it has been since birthday: " );
		year1 = input.nextInt();
		
		System.out.print( "Enter the number of extra months it has been since birthday: " );
		month1 = input.nextInt();
		
		System.out.print( "Enter the number of years it has been since birthday: " );
		year2 = input.nextInt();
		
		System.out.print( "Enter the number of extra months it has been since birthday: " );
		month2 = input.nextInt();
		
		total1 = 12 * year1 + month1; //use month as an equivalent unit in order to compare "total1" and "total2" easily
		total2 = 12 * year2 + month2;
		
		if( total1 < total2 )
			System.out.printf( "Age gap is %d year(s) and %d month(s).", ( total2 - total1 ) / 12, ( total2 - total1 ) % 12 );
		else if( total1 > total2 )
			System.out.printf( "Age gap is %d year(s) and %d month(s).", ( total1 - total2 ) / 12, ( total1 - total2 ) % 12 );
		else
			System.out.println( "You have the same age." );
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end main
} //end class L3_A1