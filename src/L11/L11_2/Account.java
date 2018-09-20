//2017.12.11, jhtp8LOV_ch07.pptx, P54 & 55, class Account (with a programmer-declared constructor) that can modify the account balance

package L11.L11_2;

public class Account
{
	/**
	 * This variable is declared to store the account balance and is initialised to 0.
	 */
	private double balance = 0;
	
	//someone may open an account to deposit money immediately, so the variable "initialBalance" is declared to store the starting balance
	public Account( double initialBalance )
	{
		//modify the account balance if the value of the variable "initialBalance" is greater than 0; otherwise, the account balance remains 0
		if( initialBalance > 0 )
	    	balance = initialBalance; 
	} //end constructor Account
	
	/**
	 * Add the deposit amount to the account balance
	 * @param depositAmount the deposit amount to be added
	 */
	public void Deposit( double depositAmount )
	{
		balance += depositAmount; 
	} // end method Deposit
	
	/**
	 * Get the balance of the account.
	 * @return the balance
	 */
	public double getBalance()
	{
		return balance;
	} // end method getBalance
} //end class Account