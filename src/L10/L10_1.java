// jhtp8LOV_ch06.pptx, P147 - 150, program that writes data to a text file with class Formatter

package L10;

import java.util.Formatter;
import java.util.Scanner;

public class L10_1
{
	public static void main(String[] args) throws Exception
	{
		Formatter fileWritten = new Formatter("D:\\SD\\Java\\BUAAHND_G2T1_DSI\\src\\L10\\test_L10_1.txt");
	    Scanner input = new Scanner(System.in);
	    int accountNumber;
	    double balance;
	    String firstName, lastName;

	    System.out.println("Enter the account number, first Name, last Name and balance each separated by spaces:\n" +
                           "(TIPS: On UNIX, Linux and Mac OS X, the end-of-file indicator is Ctrl + D.\n" +
                           "       On Windows, the end-of-file indicator is Ctrl + Z.)");

	    // loop until the end-of-file indicator is entered
	    while (input.hasNext())
	    {
	    	accountNumber = input.nextInt();
	        firstName = input.next();
	        lastName = input.next();
	        balance = input.nextDouble();

	        if (accountNumber > 0)
	        	/* 
	        	 * the format specifier "%n" tells the program to output a platform-specific line separator;
	        	 * if "\n" is used instead, each record might not display on a separate line because different platforms use different line-separator characters;
	        	 * on UNIX, Linux and Mac OS X, the line separator is "\n", while it is represented as "\r\n" on Windows
	        	 */
	        	fileWritten.format("%d  %s  %s  %.2f%n", accountNumber, firstName, lastName, balance);
	        else
	        	System.out.println("Error! Account number must be greater than 0. Data in the previous line will not be recorded.");
	    } // end while

	    fileWritten.close(); // close the file associated with the program to avoid resource leak or any other problem
	    input.close();
	} // end main
} // end class L10_1