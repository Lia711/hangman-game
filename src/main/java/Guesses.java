import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Guesses {
    int livesCounter = 8;
    private ArrayList<Character> usedLettersArray = new ArrayList<>();

    public void addLetter (char letter) {
        this.usedLettersArray.add(letter);
    }

    public String guess(char letter, char[] wordArray, char[] hiddenWord) {


        for (int i=0; i<wordArray.length; i++) {
            if (wordArray[i]==letter) {
                hiddenWord[i]=letter;
                return "Correct!";
            } else {
                livesCounter--;
                return "Incorrect! You've lost 1 life.";
            }
            } return "Used letters: " + usedLettersArray.size() + ". Remaining lives: "
                + livesCounter + ". Word to guess: " + hiddenWord;

    }

    public String nextTurn(char[] hiddenWord) {
        return "Used letters: " + usedLettersArray.size() + ". Remaining lives: "
                + livesCounter + ". Word to guess: " + hiddenWord;

    }



}
