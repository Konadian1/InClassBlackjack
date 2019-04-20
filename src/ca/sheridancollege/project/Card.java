package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public class Card {

        public enum Suit{HEART, DIAMOND, CLUB, SPADE};
        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, 
        NINE, TEN, JACK, QUEEN, KING };
        private final Suit suit;
        private final Value value;



	public Card(Suit s, Value val) {
		suit = s;
                value = val;
	}
        


//	public String showCard() {	
//           throw new UnsupportedOperationException();
//	}

    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

}