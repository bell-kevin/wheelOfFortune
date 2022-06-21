/** ****************************************************************************
 * Game.java
 * Kevin Bell
 *
 * This class is associated with WheelofFortune.java
 **************************************************************************** */
package wheeloffortune;

public class Game {

    private char[][] game;
    private String word = "generator";
    private int wordLength = word.length();

    public Game() {
        game = new char[2][wordLength];
        for (int i = 0; i < wordLength; i++) {
            game[0][i] = word.charAt(i);
            game[1][i] = '=';
        } //end for
    } // end Game constructor

    public void display() {
        for (int i = 0; i < wordLength; i++) {
            System.out.printf("  %s", game[1][i]);
        } //end for
        System.out.println("");
    } //end display

    public void findLetter(char guess) {
        int count = 0;
        for (int i = 0; i < wordLength; i++) {
            if (guess == game[0][i]) {
                game[1][i] = guess;
                count++;
            } //end if
        } //end for
        if (count > 0) {
            System.out.printf("Fount it %d times\n", count);
        } else {
            System.out.println("Letter was not found");
        } //end if
        display();
    } //end findLetter

    public boolean isGameOver() {
        for (int i = 0; i < wordLength; i++) {
            if (game[0][i] != game[1][i]) {
                return false;
            }
        } //end for
        return true;
    } //end isGameOver  
} //end class Game
