/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author Konadian
 */
public class TwentyOneGame extends Game {

    String playerName;
    int wins;
    int losses;
    int doneTotal;
    boolean continue;
    public TwentyOneGame(String givenName) {
        // TODO - implement Game.Game
        super(givenName);

    }

    @Override
    public void play() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Twenty One! You are dealt cards and must try to get closer than the dealer to 21. but be careful, if you go over, you lose!/n please enter your Name and we will begin!");
        setPlayerName(input.nextLine());
        GroupOfCards newGame = new GroupOfCards();
        newGame.deal();
        while (continue == true){
        System.out.println("You currently have "+newGame.currentTotal());
        if(Turn()==true){
         newGame.hit();   
        }
        else{
            continue = false;
        }
    }
            doneTotal = newGame.currentTotal();
        //need to add player drawing cards, then comparing each time to see if they've gone over, 
        //if so, auto loss, else print their total and let them draw or stay.
        //once player is done, the have the dealer do their thing.
        //after, compare totals. if tie the dealer wins
        //add win or loss to the totals and ask if player would like to play again, and run play() again.

    }

    public boolean Turn() {
        Scanner input = new Scanner(System.in);

        // if user inputs something other then y/n have them try again
        System.out.println("Would you like to draw another card(Y/N)");
        String extraCard = input.nextLine();

            if (extraCard.equalsIgnoreCase("y")) {
                return true;
            }
            if (extraCard.equalsIgnoreCase("n")) {
                return false;
            }
            System.out.println("Invalid Input please try again(Y/N)");
            extraCard = input.nextLine();
            if (extraCard.equalsIgnoreCase("y")) {
                return true;
            }
            if (extraCard.equalsIgnoreCase("n")) {
                return false;
            }
            System.out.println("Still invalid, returning false");
            return false;
        }

    @Override
    public void declareWinner() {
        if (wins > losses) {
            System.out.println("Congrats You won " + wins + " to " + losses);
        } else {
            System.out.println("too bad. You lost " + losses + " to " + wins);
        }
    }

    private void setPlayerName(String name) {
        if (name != null) {
            this.playerName = name;
        } else {
            System.out.println("Please input a valid name:");
            Scanner input = new Scanner(System.in);
            setPlayerName(input.nextLine());
        }
    }

}
