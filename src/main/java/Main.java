import java.util.Arrays;

public class Main {
    static boolean playAgain = true;

    public static void main(String[] args) {

        while (playAgain) {
            boolean game = false;
            int difficulty = 0;

            Word word = new Word();
            Interaction interaction = new Interaction();
            Guesses guess = new Guesses();
            Graphics graphics = new Graphics();

            System.out.println("Select difficulty: Press 1 for easy mode. Press 2 for normal mode. Press 3 for hard mode.");
            try {
                int begin = interaction.readNumber();
                if (begin == 1) {
                    difficulty = 1;
                    game = true;
                } else if (begin == 2) {
                    difficulty = 2;
                    game = true;
                } else if (begin == 3) {
                    difficulty = 3;
                    game = true;
                } else System.out.println("You must enter a number between 1 and 3.");
            } catch (Exception e) {
                System.out.println("You must enter a valid number.");
            }

            while (game) {
                String newWord = word.getWord();
                System.out.println("Your word is: " + word.hideWord());
                String hiddenWord = word.hideWord();

                char[] newWordArray = newWord.toCharArray();
                char[] hiddenWordArray = hiddenWord.toCharArray();
                char[] wordToCheckArray = newWord.replace("", " ").trim().toCharArray();

                int lives = 0;
                if (difficulty == 1) {
                    lives = 8;
                } else if (difficulty == 2) {
                    lives = 5;
                } else if (difficulty == 3) {
                    lives = 3;
                }
                System.out.println("Remaining lives: " + lives + ".");

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
                    System.out.println("Remaining lives: " + lives + ".");
                    System.out.println(guess.nextTurn());
                    System.out.println(hiddenWordArray);
                }
                if (lives == 0) {
                    System.out.println("You have lost all your lives.");
                    game = false;
                } else if (Arrays.equals(hiddenWordArray, wordToCheckArray)) {
                    System.out.println("You've won the game!");
                    game = false;
                }
            }
            System.out.println("Press 1 to continue. Press any other number to exit.");
            try {
                int choice = interaction.readNumber();
                if (choice == 1) {
                    playAgain = true;
                } else {
                    System.out.println("Thank you for playing!");
                    playAgain = false;
                }
            } catch (Exception e) {
                System.out.println("You must enter a number.");
            }
        }
    }
}
