//2017.12.11, jhtp8LOV_ch07.pptx, P65, class Card (with a programmer-declared constructor) that can represent a playing card

package L11.L11_3;

public class Card
{
	/*
	 * the faces of cards are called "Ace", "Deuce", "Three", ..., "Ten", "Jack", "Queen" and "King"
	 * the suits of cards are called "Hearts", "Diamonds", "Clubs" and "Spades"
	 */
	private String face, suit;
	
	public Card( String cardFace, String cardSuit )
	{
		face = cardFace; //initialise the face of a card
	    suit = cardSuit; //initialise the suit of a card
	} //end constructor Card
	
	public String toString()
	{
		return face + " of " + suit; //return a string representation of a card
	} //end method toString
} //end class Card