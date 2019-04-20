/*
 * Obada Alasali
 * Student ID: 991404478
 */
package ca.sheridancollege.project;

/**
 *
 * @author Obada
 */
public class BlackJack {
public static void main(String[] args){
    
    GroupOfCards ch = new GroupOfCards();
                    //create 52 Cards
                ch.createDeck();
                
                
                for(Card c: ch.deck)
                {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }
               System.out.println(ch.deck);// show what happens when there is no toString()
    Player playerA = new Player("obada");
    playerA.play();


}
    
}
