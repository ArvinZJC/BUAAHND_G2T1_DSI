// jhtp8LOV_ch02.pptx, P77 - 79, program that compares integers using if statements, relational operators and equality operators

package L3;

import java.util.Scanner;

public class L3_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number1, number2;
		
		System.out.print("Enter the first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		number2 = input.nextInt();
		
		if (number1 == number2)
			System.out.printf("%d == %d\n", number1, number2); // "==" is one of equality operators, while "=" is one of relational operators
		
		if (number1 != number2)
			System.out.printf("%d != %d\n", number1, number2);
		
		if (number1 < number2)
			System.out.printf("%d < %d\n", number1, number2);
		
		if (number1 > number2)
			System.out.printf("%d > %d\n", number1, number2);
		
		input.close();
	} // end main
} // end class L3_1