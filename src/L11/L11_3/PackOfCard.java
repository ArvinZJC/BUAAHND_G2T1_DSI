// jhtp8LOV_ch07.pptx, P68 - 70, class PackOfCard (with a programmer-declared constructor) that can represent a pack of playing cards

package L11.L11_3;

import java.util.Random;

public class PackOfCard
{
	public PackOfCard()
	{
		String[] cardFace = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	    String[] cardSuit = {"Hearts", "Diamonds", "Clubs", "Spades"};
	    
	    pack = new Card[TOTAL_NUMBER]; // create an array of Card objects named pack for representing a pack of playing cards
	    currentCard = 0; // ensure the first card dealt is pack[0]
	    
	    // loop to represent each card in a pack of playing cards
	    for (int count = 0; count < pack.length; count++)
	    	pack[count] = new Card(cardFace[count % 13], cardSuit[count / 13]);
	} // end constructor PackOfCard
	
	/*
	 * this class has a reference to the object of class Card as a member;
	 * this is called composition, which is a basic way to achieve reusability in computer programming
	 */
	private Card[] pack;
	// it represents the index of the next card to be dealt
	private int currentCard;
	/* 
	 * a pack of cards usually contains 54 cards;
	 * 2 Jokers are excluded here
	 */
	private static final int TOTAL_NUMBER = 52;
	private static final Random randomNumber = new Random();
	
	/**
	 * Place cards in a random order.
	 */
	public void ShuffleCard()
	{
	    int second;
	    Card temp;
		
		currentCard = 0; // reinitialise the variable "currentCard" to 0 to ensure that dealing starts at pack[0] after shuffling cards again
	    
		// for each card, pick another random card and swap them
		for (int first = 0; first < pack.length; first++)
	    {
	        second = randomNumber.nextInt(TOTAL_NUMBER); // pick a random integer between 0 and 51
	        temp = pack[first];        
	        pack[first] = pack[second];   
	        pack[second] = temp;            
	    } // end for
	} // end method ShuffleCard
	
	/**
	 * Deal a card.
	 * @return the specified element of the array of Card objects named pack or null
	 */
	public Card DealCard()
	{
	    if (currentCard < pack.length)
	    	return pack[currentCard++]; // indicate that the card represented was dealt
	    else        
	        return null; // indicate that all cards were dealt
	} // end method DealCard
} // end class PackOfCard