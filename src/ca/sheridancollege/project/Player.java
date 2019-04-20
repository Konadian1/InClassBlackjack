package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public class Player {
    
        private GroupOfCards deck = new GroupOfCards();
	private String playerID;

	public String getPlayerID() {
		return this.playerID;
	}


	public Player(String name) {
		playerID = name;
		
	}

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
                
            deck.hit();
            }
            else if(extraCard.equalsIgnoreCase("n")){
            // do something
            }
                
        }

}