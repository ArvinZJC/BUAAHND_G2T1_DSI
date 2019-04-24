// jhtp8LOV_ch04.pptx, P51 - 54, program that uses a switch statement to count letter grades

package L5;

import java.util.Scanner;

public class L5_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int grade, total = 0, count = 0, aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0;
		
		System.out.println("Enter the integer grades between 0 and 100 or type the end-of-file indicator to terminate input:\n" +
				           "(TIPS: On UNIX, Linux and Mac OS X, the end-of-file indicator is Ctrl + D.\n" +
				           "       On Windows, the end-of-file indicator is Ctrl + Z.)");
		
		/*
		 * loop until the end-of-file indicator is entered；
		 * Scanner method hasNext returns the boolean value false if there is no more data to input (e.g., the end-of-file indicator has been typed)
		 */
		while (input.hasNext()) 
		{
			grade = input.nextInt();
			
			total += grade;
			++count;
			
			switch (grade / 10)
			{
			// although there is more than one statement in the case part, we do not need to use "{}"
			case 10:
			case 9:
			    aCount++;
			    break; // exit switch
			    
			case 8:
			    bCount++;
			    break;
			    
			case 7:
			    cCount++;
			    break;
			    
			case 6:
			    dCount++;
			    break;
			    
			default:
			    fCount++;
			} // end switch-case
		} // end while
		
		System.out.println( "\n*************** Grade Report ***************" );
		
		// execute the following code block if the user enters at least 1 grade
		if (count != 0)
		{
			double average = (double) total / count;
			
			System.out.printf("Total of the %d grades entered: %d\n", count, total);
			System.out.printf("Class average: %.2f\n", average);
			System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
					"Number of students who received each grade: ",
					"A: ", aCount,
					"B: ", bCount,
					"C: ", cCount,
					"D: ", dCount,
					"F: ", fCount);
		}
		else
			System.out.println("No grades were entered.");
		
		input.close(); // close "input" of class Scanner to avoid resource leak
	} // end main
} // end class L5_1