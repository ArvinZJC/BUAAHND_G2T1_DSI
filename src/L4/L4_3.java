// jhtp8LOV_ch03.pptx, P75 & 76, program that shows simple analysis of examination results using nested control structures

package L4;

import java.util.Scanner;

public class L4_3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int pass = 0, fail = 0, count = 1, result;
		
		// loop 10 times
		while (count <= 10)
		{
			System.out.print("Enter the result (1 = PASS, 2 = FAIL): ");
			result = input.nextInt();
			
			if (result == 1)
				pass += 1;
			else
				fail++;
			
			++count;
		} // end while
		
		System.out.printf("Passed: %d\nFailed: %d\n", pass, fail);
		
		if (pass >= 9)
			System.out.println("Bonus to the instructor!");
		
		input.close(); // close "input" of class Scanner to avoid resource leak
	} // end main
} // end class L4_3