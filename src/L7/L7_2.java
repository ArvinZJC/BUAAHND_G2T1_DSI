// jhtp8LOV_ch05.pptx, P81 & 82, program that demonstrates overloaded method declarations
package L7;

public class L7_2
{
	public static void main(String[] args)
	{
		System.out.printf("Square of 7: %d\n", Square(7)); // call the specified method to calculate square of an integer
		System.out.printf("Square of 7.5: %.2f\n", Square(7.5)); // call the specified method to calculate square of a number of type double
	} // end main
	
	/**
	 * Calculate square of an integer.
	 * @param x an integer to be calculated
	 * @return square value
	 */
	public static int Square(int x)
	{
		System.out.printf("\nCalled method Square with an int argument: %d\n", x);
		
		return x * x;
	} // end method Square
	
	/**
	 * Calculate square of a number of type double.
	 * @param x a number of type double to be calculated
	 * @return square value
	 */
	public static double Square(double x)
	{
		System.out.printf("\nCalled method Square with a double argument: %.1f\n", x);
		
		return x * x;
	} // end method Square
} // end class L7_2