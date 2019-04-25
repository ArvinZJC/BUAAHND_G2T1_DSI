// jhtp8LOV_ch06.pptx, P161 & 162, program that reads a text file and displays each record with class Scanner

package L10;

import java.io.File;
import java.util.Scanner;

public class L10_2
{
	public static void main(String[] args) throws Exception
	{
		Scanner fileRead = new Scanner(new File("C:\\SD\\Java\\BUAAHND_G2T1_DSI\\src\\L10\\test_L10_2.txt"));
		int accountNumber;
	    double balance;
	    String firstName, lastName;

	    System.out.printf("%-10s%-12s%-12s%10s\n", "Account", "First Name", "Last Name", "Balance");

	    while (fileRead.hasNext())
	    {
	    	accountNumber = fileRead.nextInt();
	        firstName = fileRead.next();
	        lastName = fileRead.next();
	        balance = fileRead.nextDouble();
	        
	        System.out.printf("%-10d%-12s%-12s%10.2f\n", accountNumber, firstName, lastName, balance);
	    } // end while

	    fileRead.close();
	} // end main
} // end class L10_2