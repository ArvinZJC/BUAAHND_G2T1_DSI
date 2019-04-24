// jhtp8LOV_ch05.pptx, P54, 5 * 4 shifted and scaled random integer printing program

package L6;

import java.util.Random; // program uses class Random

public class L6_1
{
	public static void main(String[] args)
	{
		Random randomNumber = new Random(); // a random number generator is created
		int face;
		
	    for (int count = 1; count <= 20; count++)
	    {
	    	face = 1 + randomNumber.nextInt(6); // pick a random integer between 1 and 6
	        System.out.printf("%d  ", face); // display the generated value
	        
	        if (count % 5 == 0) // if the value of "count" is divisible by 5, start a new line of output
	          System.out.println();
	    } // end for
	} // end main
} // end class L6_1