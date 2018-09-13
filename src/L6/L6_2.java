/*
 * 2017.11.06, jhtp8LOV_ch05.pptx, P56-58, dice-rolling program
 * compared with L7_8.java, this program prints one possible frequency of each face of a 6-sided dice rolled 6,000 times using a switch statement
 */

package L6;

import java.util.Random;

public class L6_2
{
	public static void main( String[] args )
	{
		Random randomNumber = new Random();
	    
		int frequency1 = 0, frequency2 = 0, frequency3 = 0, frequency4 = 0, frequency5 = 0, frequency6 = 0, face;
		
		//roll a 6-sided dice 6,000 times
		for( int roll = 1; roll <= 6000; roll++ )
	    {
	    	face = 1 + randomNumber.nextInt( 6 ); //a number between 1 and 6
	    	
	    	//increment the appropriate counter according to the value of "face"
	    	switch( face )
	        {
	        case 1:
	            ++frequency1;
	            break;
	            
	        case 2:
	            ++frequency2;
	            break;
	            
	        case 3:
	            ++frequency3;
	            break;
	            
	        case 4:
	            ++frequency4;
	            break;
	            
	        case 5:
	            ++frequency5;
	            break;
	            
	        case 6:
	            ++frequency6;
	        } //end switch-case
	    } //end for
	    
	    System.out.println( "Face\tFrequency" );
	    System.out.printf( "1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n", frequency1, frequency2, frequency3, frequency4, frequency5, frequency6 ); 
	} //end method main
} //end class L6_2