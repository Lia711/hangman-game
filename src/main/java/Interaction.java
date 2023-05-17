import java.util.Scanner;
public class Interaction {

    public void readInput() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Your letter is: " + myObj.nextLine().toLowerCase().charAt(0));
    }

    //String letter = myObj.nextLine();
       // System.out.println("Your letter is: " + letter.toLowerCase().charAt(0));
}
