//2017.12.12, LS4.docx, Task 3, username creator

package LS4;

import java.util.Scanner;

public class LS4_T3
{
	public static void main( String[] args )
	{
		CreateUsername(); //call the specified method to create a username
	} //end method main
	
	/**
	 * Create a username.
	 */
	public static void CreateUsername()
	{
		Scanner input = new Scanner( System.in );
		
		String firstName, lastNM, username;
		
		System.out.print( "Enter your first name: " );
		firstName = input.next();
		System.out.print( "Enter your surname: " );
		lastNM = input.next();
		
		username = firstName.substring( 0, 1 ) + lastNM; //create a username from the first letter of the first name and the whole of the surname
		
		System.out.println( "Your username: " + username );
		
		input.close(); //close "input" of class Scanner to avoid resource leak
	} //end method CreateUsername
} //end class LS4_T3