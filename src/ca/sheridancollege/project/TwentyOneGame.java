/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Konadian
 */
public class TwentyOneGame extends Game {

 public TwentyOneGame(String givenName) {
        // TODO - implement Game.Game
        super(givenName);
        throw new UnsupportedOperationException();
        
    }
    @Override
    public void play() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Welcome to Twenty One! You are dealt cards and must try to get closer than the dealer to 21. but be careful, if you go over, you lose!/n please enter your Name and we will begin!");
        SetPlayerName();
        GroupOfCards dealerCards = new GroupOfCards();
        dealerCards.deal();
    }

    @Override
    public void declareWinner() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
