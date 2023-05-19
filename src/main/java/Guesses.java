import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Guesses {
    int livesCounter = 8;
    private ArrayList<Character> usedLettersArray = new ArrayList<>();

    public int displayLives() {

        return livesCounter;
    }

    public void addLetter (char letter) {
        if (!usedLettersArray.contains(letter)) {
            this.usedLettersArray.add(letter);
        }
    }

    public boolean guess(char letter, char[] wordArray, char[] hiddenWord) {
        boolean result = false;

        for (int i=0; i<wordArray.length; i++) {
            if (wordArray[i]==letter) {
                hiddenWord[i*2]=letter;
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

    public String nextTurn() {
        return "Used letters: " + usedLettersArray + ".";

    }

}
