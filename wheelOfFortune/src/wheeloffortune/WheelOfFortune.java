/** ****************************************************************************
 * WheelOfFortune.java
 * Kevin Bell
 *
 * This program creates a game that allows users to guess letters in a secret
 * word
 **************************************************************************** */
package wheeloffortune;

import java.util.Scanner;

public class WheelOfFortune {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Game game = new Game(); //create a new game
        String input;
        char guess;
        //play game
        System.out.println("Ch 9 Hangman by Kevin Bell\n");
        game.display(); //display the board
        do {
            System.out.print("Guess a letter: ");
            input = stdIn.nextLine();
            guess = input.charAt(0);
            game.findLetter(guess); //find letter           
        } while (!game.isGameOver()); //check if game over
        //end game
        System.out.println("Congratulations, game is over");
    } //end main
} //end class WheelOfFortune
