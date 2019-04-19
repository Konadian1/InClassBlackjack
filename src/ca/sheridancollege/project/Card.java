package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public  class Card {

	private int value;
	private String suit;
        public enum Suit {HEART, DIAMOND,CLUB,SPADE};
        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, 
        NINE, TEN, JACK, QUEEN, KING };
	/**
	 * Students should implement this method for their specific children classes
	 * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
	 */
	//@Override
	//public abstract String toString();

	public Card() {
		// TODO - implement Card.Card
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 * @param name
	 */
	public Card(Suit s, Value v) {
		// TODO - implement Card.Card
		throw new UnsupportedOperationException();
	}

	public int getValue() {
		return this.value;
	}

	public String getSuit() {
		// TODO - implement Card.getSuit
                return this.suit;
		
	}

	public String showCard() {	
            throw new UnsupportedOperationException();
	}

}