//2017.12.11, jhtp8LOV_ch07.pptx, P72 & 73, program that creates and manipulates a PackOfCard object

package L11.L11_3;

public class PackOfCard_Test
{
	public static void main( String[] args )
	{
		PackOfCard game = new PackOfCard(); //create a PackOfCard object and assign it to "game"
	    
		game.ShuffleCard(); //call the specified method in class PackOfCard to place cards in a random order
	    
	    System.out.printf( "%-19s%-19s%-19s%s\n", "Player 1", "Player 2", "Player 3", "Player 4" );
	    System.out.println( "****************************************************************************" ); //these asterisks are used for a better layout
		
	    //print all 52 cards in the order in which they are dealt
	    for( int counter = 1; counter <= 52; counter++ )
	    {
	        System.out.printf( "%-19s", game.DealCard() ); //call the specified method in class PackOfCard to deal a card
	        
	        //start a new line every 4 cards
	        if( counter % 4 == 0 )
				System.out.println();
	    } //end for
	} //end method main
} //end class PackOfCard_Test