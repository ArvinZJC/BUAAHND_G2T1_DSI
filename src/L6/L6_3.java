/*
 * 2017.11.06, jhtp8LOV_ch05.pptx, P63-66, the dice game Craps
 * this program simulates the process
 */

package L6;

import java.util.Random;

public class L6_3
{
	private static final Random randomNumber = new Random();
	
	/*
	 * remember that "enum" means enumeration and pay attention that the "c" in the "continue" must be a capital letter "C"
	 * in enum type, ";" can be omitted if there is no programmer-declared method
	 */
	private enum Status
	{
		Continue,
		Win,
		Lose;
	} //end enum Status
	
	private static final int win1 = 7, win2 = 11, lose1 = 2, lose2 = 3, lose3 = 7, lose4 = 12; //statements like "String x" and "case 7" can be used instead of "enum" and "final int" in this program, which are just for practising using new things
	
	public static void main( String[] args )
	{
		int sum = RollDice(), point = 0; //the first roll of the dice by calling the specified method
	    Status status;
	    
	    //determine the game status and point based on the first roll
	    switch( sum )
	    {
	    //win with 7 on the first roll
	    case win1:
	    //win with 11 on the first roll
	    case win2:
	        status = Status.Win;
	        break;
	        
	    //lose with 2 on the first roll
	    case lose1:
	    //lose with 3 on the first roll
	    case lose2:
	    //lose with 12 on the first roll
	    case lose4:
	        status = Status.Lose;
	        break;
	        
	    //if the sum is 4, 5, 6, 8, 9 or 10 on the first roll, the game is not over and that sum becomes the point for the next roll
	    default:
	        status = Status.Continue;
	        point = sum;
	        System.out.printf( "Point is %d.\n", point );
	    } //end switch-case
	    
	    while( status == Status.Continue )
	    {
	    	sum = RollDice(); //call the specified method to roll the dice again
	    	
	    	//win by making the point
	        if( sum == point )
	          status = Status.Win;
	        //lose by rolling a 7 before making the point
	        else if( sum == lose3 )
	          status = Status.Lose;
	    } //end while
	    
	    if( status == Status.Win )
	      System.out.println( "Player wins." );
	    else
	      System.out.println( "Player loses." );
    } //end method main
	
	/**
	 * Roll the dice.
	 * @return the total of the dice values
	 */
	public static int RollDice()
	{
		int dice1 = 1 + randomNumber.nextInt( 6 ), dice2 = 1 + randomNumber.nextInt( 6 ), total = dice1 + dice2; //pick random dice values for the 2 dices and sum the dice values
		
	    System.out.printf( "Player rolled %d + %d = %d.\n", dice1, dice2, total );
	    
	    return total;
	} //end method RollDice
} //end class L6_3