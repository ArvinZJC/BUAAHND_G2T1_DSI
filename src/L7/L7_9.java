//2017.11.14, jhtp8LOV_ch06.pptx, P41, poll analysis program

package L7;

public class L7_9
{
	public static void main( String[] args )
	{
		int[] response = { 1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6, 10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6, 4, 8, 6, 8, 10 };
		int[] frequency = new int[ 11 ];
		
		for( int answer = 0; answer < response.length; answer++ )
			++frequency[ response[ answer ] ];
		
		System.out.printf( "%s%10s\n", "Rating", "Frequency" );
		
		//output each array element's value
		for( int rating = 1; rating < frequency.length; rating++ )
			System.out.printf( "%6d%10d\n", rating, frequency[ rating ] );
	} //end main
} //end class L7_9