package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author dancye, 2018
 */
public abstract class Game {

    private String playerName;
    Scanner in = new Scanner(System.in);

    /**
     * the players of the game
     *
     * @param givenName
     */
    public Game(String givenName) {
        // TODO - implement Game.Game
        throw new UnsupportedOperationException();
        
    }

    /**
     * Play the game. This might be one method or many method calls depending on
     * your game.
     */
    public abstract void play();{
    
    
}
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();

//	public void getPlayers() {
//		// TODO - implement Game.getPlayers
//		throw new UnsupportedOperationException();
//	}
    public void SetPlayerName() {
        System.out.println("Please enter your name: ");
        playerName = in.nextLine();
    }

    public String getPlayerName() {

        return playerName;
    }

}
