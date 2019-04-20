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
public class GroupOfCards {

    //The group of main, stored in an ArrayList
    public ArrayList<Card> deck = new ArrayList<Card>();
    private ArrayList<Card> player;
    private ArrayList<Card> dealer;
    private int handSize = 52;
   //public Card[] cards = new Card[handSize];
    private int size;//the size of the grouping
    
    public GroupOfCards(int givenSize) {
        
        handSize = givenSize;
    }
   
    public ArrayList<Card> createDeck(){  
        
    for(int countCards = 0;countCards < handSize;countCards++){
    for(Card.Suit c: Card.Suit.values())
     {
     for(Card.Value v: Card.Value.values())
     {

      deck.add(new Card(c,v));
    
       }
       }//end outter for
    
    }   
    return deck;
    }
    
  
    public ArrayList<Card> showCards() {
        return deck;
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

 
    public int getSize() {
        return size;
    }

    public void deal() {
        player.add(deck.get(0));
        deck.remove(0);
        player.add(deck.get(0));
        deck.remove(0);
        dealer.add(deck.get(0));
        deck.remove(0);
        dealer.add(deck.get(0));
        deck.remove(0);
    }
    public void hit() {
        createDeck();
        player.add(deck.get(0));
        deck.remove(0);
        
    }
    public int currentTotal(){
        int total = 0;
        for(int e=0; e>player.size(); e++){
          //  player.addTotal(); //get total value of player hand
        }
        return total;
    }


    public void setSize(int givenSize) {
        size = givenSize;
    }

    public GroupOfCards() {}

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
