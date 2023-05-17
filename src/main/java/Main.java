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

        System.out.println("Enter a letter: ");
        interaction.readInput();

        char guessedLetter = interaction.returnLetter();
        guess.addLetter(guessedLetter);
        boolean userGuess = guess.guess(guessedLetter, newWordArray, hiddenWordArray);

        if (userGuess==true) {
            System.out.println(guess.correctGuess());
        } else {
            System.out.println(guess.incorrectGuess());
        }

        System.out.println(guess.nextTurn(hiddenWordArray));





    }
}
