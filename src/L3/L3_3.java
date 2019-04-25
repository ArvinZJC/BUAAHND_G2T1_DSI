// jhtp8LOV_ch03.pptx, P26 & 27, program that shows the level that a student's grade (XX.00) achieves

package L3;

import java.util.Scanner;

public class L3_3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int grade;
		
		System.out.printf("Enter student's grade: ");
		grade = input.nextInt();
		
		if (grade >= 90)
			System.out.println("A");
		else
			if (grade >= 80)
				System.out.println("B"); // one form of nested if...else statements
			else if (grade >= 70)
				System.out.println("C"); // one common form of nested if...else statements that most Java programmers prefer to use
			else if (grade >= 60)
				System.out.println("D");
			else
				System.out.println("F");
		
		input.close();
	} // end main
} // end class L3_3