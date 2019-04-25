// Assignment 1, program rewritten from L4_1.java with a do...while repetition statement

package L4;

import java.util.Scanner;

public class L4_A1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int total = 0, grade, count = 1, average;
		
		do
		{
			System.out.print("Enter grade: ");
			grade = input.nextInt();
			
			total += grade;
			count++;
		} while (count <= 10); // loop 10 times
		
		average = total / 10;
		
		System.out.printf("\nTotal of all 10 grades: %d\n", total);
		System.out.printf("Class average: %d\n", average);
		
		input.close();
	} // end main
} // end class L4_A1