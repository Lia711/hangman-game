public class Graphics {
    public String incorrectGuess(int n) {
        String result="";
        if (n==7) {
            result= "_______";
        } else if (n==6) {
            result= "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "_________";
        } else if (n==5) {
            result = "--------------\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "_________";

        } else if (n==4) {
            result = "--------------\n" +
                    "|/    |\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "_________";
        } else if (n==3) {
            result = "--------------\n" +
                    "|/    |\n" +
                    "|    (_)\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "_________";
        } else if (n==2) {
            result = "--------------\n" +
                    "|/    |\n" +
                    "|    (_)\n" +
                    "|     |\n" +
                    "|     |\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "_________";
        } else if (n==1) {
            result = "--------------\n" +
                    "|/    |\n" +
                    "|   \\(_)/\n" +
                    "|    \\|/\n" +
                    "|     |\n" +
                    "|     |\n" +
                    "|\n" +
                    "|\n" +
                    "_________";
        }
        else if (n==0) {
            result = "--------------\n" +
                    "|/    |\n" +
                    "|   \\(_)/\n" +
                    "|    \\|/\n" +
                    "|     |\n" +
                    "|    / \\\n" +
                    "|   /   \\\n" +
                    "_________";
        }
        return result;

    }

}