//2017.10.28, Assignment 3, program rewritten from L4_7.java with a while repetition statement

package L4;

public class L4_A3
{
	public static void main( String[] args )
	{
		int year = 1;
		double amount, principal = 1000.00, rate = 0.05; //PRINCIPAL, not PRINCIPLE
		
		System.out.printf( "%s%20s\n", "Year", "Amount on deposit" );
		
		//loop 10 times
		while( year <= 10 )
		{
			amount = principal * Math.pow( 1.00 + rate, year ); //calculate the amount on deposit
			
			System.out.printf( "%4d%,20.2f\n", year, amount );
			
			++year;
		} //end while
	} //end main
} //end class L4_A3