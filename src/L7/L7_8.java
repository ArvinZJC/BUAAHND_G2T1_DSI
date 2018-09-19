/*
 * 2017.11.14, jhtp8LOV_ch06.pptx, P38, dice-rolling program
 * compared with L6_2.java, this program prints one possible frequency of each face of a 6-sided dice rolled 6,000 times using arrays
 */

package L7;

import java.util.Random;

public class L7_8
{
	public static void main( String[] args )
	{
		Random randomNumber = new Random();
		
		int[] frequency = new int[ 7 ]; //pay attention that although there are only 6 faces, 7 indexes are recommended because the index of an array should start from 0
		
		for( int roll = 1; roll <= 6000; ++roll )
			++frequency[ 1 + randomNumber.nextInt( 6 ) ];
		
		System.out.printf( "%s%13s\n", "Face", "Frequency" );
		
		//output each array element's value
		for( int face = 1; face < frequency.length; ++face )
			System.out.printf( "%-8d%d\n", face, frequency[ face ] );
	} //end main
} //end class L7_8