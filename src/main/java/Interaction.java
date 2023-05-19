import java.util.Scanner;
public class Interaction {
    char letter;
    int number;

    public void readInput() {
        Scanner myObj = new Scanner(System.in);
        letter = myObj.nextLine().toLowerCase().charAt(0);
        System.out.println("Your letter is: " + letter);
    }
    public char returnLetter() {
        return letter;
    }
    public int readNumber() {
        Scanner myObj = new Scanner(System.in);
        number = myObj.nextInt();
        return number;
    }
}
