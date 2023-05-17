import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Word word = new Word();
        Interaction interaction = new Interaction();
        word.getWord();
        System.out.println("Your word is: " + word.hideWord());

        System.out.println("Enter a letter: ");
        interaction.readInput();



    }
}
