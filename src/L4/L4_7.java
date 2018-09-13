//2017.10.28, jhtp8LOV_ch04.pptx, P37, program that solves a problem containing compound-interest calculations with a for repetition statement

package L4;

public class L4_7
{
	public static void main( String[] args )
	{
		double amount, principal = 1000.00, rate = 0.05; //PRINCIPAL, not PRINCIPLE
		
		/*
		 * the integer 20 in the format specifier "%20s" indicates that the value output should be displayed with a field width of 20
		 * if the value to be output is less than 20 character positions wide, the value is right justified in the field by default
		 * if the value to be output has more characters than the field width, the field width would be extended to the right to accommodate the entire value
		 * to indicate that values should be output left justified, precede the field width with the minus sign (-) formatting flag (e.g., %-20s)
		 */
		System.out.printf( "%s%20s\n", "Year", "Amount on deposit" );
		
		//loop 10 times
		for( int year = 1; year <= 10; ++year )
		{
			/*
			 * "Math.pow( x, y )" calculates the value of x raised to the yth power, and the method receives 2 double arguments and returns a double value
			 * a static method is called by specifying the class name followed by a dot (.) and the method name, as in "ClassName.methodName( arguments )"
			 */
			amount = principal * Math.pow( 1.00 + rate, year );
			
			/*
			 * the comma (,) formatting flag in the format specifier "%,20.2f" indicates that the floating-point value is output with a grouping separator
			 * the number in English is usually output using commas to separate every three digits, as it is in 1,000,234
			 * pay attention that the comma formatting flag be used only in texts output, so this means "int a = 1,000" is incorrect
			 */
			System.out.printf( "%4d%,20.2f\n", year, amount );
		} //end for
	} //end method main
} //end class L4_7