// jhtp8LOV_ch07.pptx, P46 & 47, program that creates and manipulates 2 Account objects

package L11.L11_2;

import java.util.Scanner;

public class Account_Test
{
	public static void main(String[] args)
	{
		Account account1 = new Account(50.00); // create an Account object and assign it to "account1"
	    Account account2 = new Account(-7.53); // create an Account object and assign it to "account2"
	    Scanner input = new Scanner(System.in);
	    double depositAmount1, depositAmount2;
	    
	    System.out.printf("The balance of Account 1: $%.2f\n", account1.getBalance()); // call the specified method in class Account to display the starting balance of Account 1
	    System.out.printf("The balance of Account 2: $%.2f\n\n", account2.getBalance()); // call the specified method in class Account to display the starting balance of Account 2
	    System.out.print("Enter the deposit amount for Account 1: $");
	    depositAmount1 = input.nextDouble();
	    
	    System.out.print("Enter the deposit amount for Account 2: $");
	    depositAmount2 = input.nextDouble();
	    
	    account1.Deposit(depositAmount1); // call the specified method in class Account to add the deposit amount for Account 1 to the balance
	    account2.Deposit(depositAmount2); // call the specfied method in class Account to add the deposit amount for Account 2 to the balance
	    System.out.printf("\nAfter adding $%.2f to the balance of Account 1 and $%.2f to the balance of Account 2,\n", depositAmount1, depositAmount2);
	    System.out.printf("     the balance of Account 1: $%.2f\n", account1.getBalance()); // call the specified method in class Account to display the current balance of Account 1
	    System.out.printf("     the balance of Account 2: $%.2f\n", account2.getBalance()); // call the specified method in class Account to display the current balance of Account 2
	    
	    input.close(); // close "input" to avoid resource leak
	} // end main
} // end class Account_Test