import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        boolean game=false;
        Word word = new Word();
        Interaction interaction = new Interaction();
        Guesses guess = new Guesses();

        System.out.println("Press 1 to start game.");
        int begin = interaction.readNumber();
        if (begin==1) {
            game=true;
        }

        while (game) {

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
            }

            if (lives==0){
                System.out.println("You have lost all your lives. Press 1 to play again. Press any other number to exit.");
                int answer = interaction.readNumber();
                if (answer==1) {
                    game=true;
                } else game=false;
            } else if (Arrays.equals(hiddenWordArray, wordToCheckArray)) {
                System.out.println("You've won the game! Press 1 to play again. Press any other number to exit.");
                int answer = interaction.readNumber();
                if (answer==1) {
                    game=true;
                } else game=false;
            }

        }

    }
}
