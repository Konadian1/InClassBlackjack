/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 */
public class GroupOfCards extends Card{

    //The group of main, stored in an ArrayList
    private ArrayList<Card> main;
    private ArrayList<Card> player;
    private ArrayList<Card> dealer;
    private ArrayList<Card> discard;
    private int size;//the size of the grouping

    //Card []card = new Card[52];
    
    public GroupOfCards(int givenSize) {
        size = givenSize;
    }

    /**
     * A method that will get the group of main as an ArrayList
     *
     * @return the group of main.
     */
    public ArrayList<Card> showCards() {
        return main;
    }

    public void shuffle() {
        Collections.shuffle(main);
    }

    /**
     * @return the size of the group of main
     */
    public int getSize() {
        return size;
    }

    public void deal() {
        player.add(main.get(0));
        main.remove(0);
        player.add(main.get(0));
        main.remove(0);
        dealer.add(main.get(0));
        main.remove(0);
        dealer.add(main.get(0));
        main.remove(0);
    }

    /**
     * @param givenSize the max size for the group of main
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }

    public GroupOfCards() {
        // TODO - implement GroupOfCards.GroupOfCards
        throw new UnsupportedOperationException();
    }

    public Card nextCard() {
        // TODO - implement GroupOfCards.nextCard
        throw new UnsupportedOperationException();
    }

    public boolean empty() {
        // TODO - implement GroupOfCards.empty
        throw new UnsupportedOperationException();
    }
    public String toString(){
        return "";
    }
}//end class
