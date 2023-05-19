import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean playAgain = true;
    static String result;

    public static void main(String[] args) {

        while (playAgain) {
            boolean game = false;
            Word word = new Word();
            Interaction interaction = new Interaction();
            Guesses guess = new Guesses();
            Graphics graphics = new Graphics();

            System.out.println("Press 1 for a random word.");
            int begin = interaction.readNumber();

            if (begin == 1) {
                game = true;
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

                while ((lives > 0) && !(Arrays.equals(hiddenWordArray, wordToCheckArray))) {
                    System.out.println("Enter a letter: ");
                    interaction.readInput();

                    char guessedLetter = interaction.returnLetter();
                    guess.addLetter(guessedLetter);
                    boolean userGuess = guess.guess(guessedLetter, newWordArray, hiddenWordArray);

                    if (userGuess == true) {
                        System.out.println(guess.correctGuess());
                    } else {
                        System.out.println(guess.incorrectGuess());
                        lives--;
                        System.out.println(graphics.incorrectGuess(lives));
                    }

                    System.out.println(guess.nextTurn());
                    System.out.println(hiddenWordArray);
                }

                if (lives == 0) {
                    System.out.println("You have lost all your lives.");
                    game = false;
                    result = "lose";
                } else if (Arrays.equals(hiddenWordArray, wordToCheckArray)) {
                    System.out.println("You've won the game!");
                    game = false;
                    result = "win";
                }
            }
            System.out.println("Press 1 to continue. Press any other number to exit.");
            int choice = interaction.readNumber();
            if (choice == 1) {
                playAgain=true;
            } else {
                System.out.println("Thank you for playing!");
                playAgain=false;
            }
        }
    }
}
