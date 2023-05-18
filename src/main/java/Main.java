import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Word word = new Word();
        Interaction interaction = new Interaction();
        Guesses guess = new Guesses();

        String newWord = word.getWord();
        System.out.println(newWord);
        System.out.println("Your word is: " + word.hideWord());
        String hiddenWord = word.hideWord();

        char[] newWordArray = newWord.toCharArray();
        char[] hiddenWordArray = hiddenWord.toCharArray();
        char[] wordToCheckArray = newWord.replace("", " ").trim().toCharArray();

        int lives = guess.displayLives();
        System.out.println(lives);

       while ((lives>0)&&!(Arrays.equals(hiddenWordArray, wordToCheckArray ))){
           System.out.println("Enter a letter: ");
           interaction.readInput();

           char guessedLetter = interaction.returnLetter();
           guess.addLetter(guessedLetter);
           boolean userGuess = guess.guess(guessedLetter, newWordArray, hiddenWordArray);

           if (userGuess==true) {
               System.out.println(guess.correctGuess());
           } else {
               System.out.println(guess.incorrectGuess());
               lives--;
           }

           System.out.println(guess.nextTurn());
           System.out.println(hiddenWordArray);
           System.out.println(wordToCheckArray);
       }

       if (lives==0){
           System.out.println("You have lost all your lives. Press 1 to play again.");
       }

       if (Arrays.equals(hiddenWordArray, wordToCheckArray)) {
            System.out.println("You've won the game! Press 1 to play again.");
        }

    }
}
