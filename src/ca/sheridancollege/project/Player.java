package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public  class Player {
private GroupOfCards playerA;
	private String playerID;

	public String getPlayerID() {
		return this.playerID;
	}

	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}

	/**
	 * A constructor that allows you to set the player's unique ID
	 * @param name the unique ID to assign to this player.
	 */
	public Player(String name) {
		// TODO - implement Player.Player
		//throw new UnsupportedOperationException();
	}

	/**
	 * The method to be instantiated when you subclass the Player class
	 * with your specific type of Player and filled in with logic to play your game.
	 */
	public void play(){
            Scanner input = new Scanner(System.in);
        

            // if user inputs something other then y/n have them try again
            System.out.println("Would you like extra cards(Y/N)");
            String extraCard = input.nextLine();
            while(true){

            if(extraCard.equalsIgnoreCase("y")){
                break;
                }
            if(extraCard.equalsIgnoreCase("n")){
                 break;
                }
            System.out.println("Invalid Input please try again(Y/N)");
            extraCard = input.nextLine();
                if(extraCard.equalsIgnoreCase("y")){
                     break;
                    }
                if(extraCard.equalsIgnoreCase("n")){
                     break;
                    }
             }
            
            // if player chooses yes deal them
            if(extraCard.equalsIgnoreCase("y")){
            
            playerA.deal();
            }
            else if(extraCard.equalsIgnoreCase("n")){
            // do something
            }
                
        }

}