package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public abstract class Card {

	private int value;
	private String suite;

	/**
	 * Students should implement this method for their specific children classes
	 * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
	 */
	@Override
	public abstract String toString();

	public Card() {
		// TODO - implement Card.Card
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 * @param name
	 */
	public Card(int number, String name) {
		// TODO - implement Card.Card
		throw new UnsupportedOperationException();
	}

	public int getValue() {
		return this.value;
	}

	public String getSuit() {
		// TODO - implement Card.getSuit
		throw new UnsupportedOperationException();
	}

	public String showCard() {
		// TODO - implement Card.showCard
		throw new UnsupportedOperationException();
	}

}