//2017.11.27, jhtp8LOV_ch06.pptx, P79 & 80, program that uses a variable-length argument list

package L9;

public class L9_1
{
	public static void main( String[] args )
	{
		double number1 = 10.0, number2 = 20.0, number3 = 30.0, number4 = 40.0;
		
		System.out.printf( "number1 = %.1f\nnumber2 = %.1f\nnumber3 = %.1f\nnumber4 = %.1f\n\n", number1, number2, number3, number4 );
		System.out.printf( "The average of number1 and number2: %.1f\n", getAverage( number1, number2 ) ); //call the specified method to calculate the average of number1 and number2
		System.out.printf( "The average of number1, number2 and number3: %.1f\n", getAverage( number1, number2, number3 ) ); //call the specified method to calculate the average of number1, number2 and number3;
		System.out.printf( "The average of number1, number2, number3 and number4: %.1f\n", getAverage( number1, number2, number3, number4 ) ); //call the specified method to calculate the average of number1, number2, number3 and number4;
	} //end main
	
	/***
	 * Get the average of numbers.
	 * @param sequence a variable-length argument list of type double for numbers calculated
	 * @return the average of numbers
	 */
	public static double getAverage( double ... sequence )
	{
		double total = 0.0;
		
		for( double number : sequence )
			total += number;
		
		return total / sequence.length;
	} //end method getAverage
} //end class L9_1