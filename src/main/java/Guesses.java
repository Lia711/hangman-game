import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Guesses {
    int livesCounter = 8;
    private ArrayList<Character> usedLettersArray = new ArrayList<>();

    public void addLetter (char letter) {
        this.usedLettersArray.add(letter);
    }

    public boolean guess(char letter, char[] wordArray, char[] hiddenWord) {
        boolean result = false;

        for (int i=0; i<wordArray.length; i++) {
            if (wordArray[i]==letter) {
                hiddenWord[i]=letter;
                result = true;

            }
            } return result;
    }

    public String correctGuess() {
        return "Correct!";
    }

    public String incorrectGuess() {
        livesCounter--;
        return "Incorrect!";

    }

    public String nextTurn(char[] hiddenWord) {
        return "Used letters: " + usedLettersArray + ". Remaining lives: "
                + livesCounter + ". Word to guess: " + hiddenWord;

    }



}
