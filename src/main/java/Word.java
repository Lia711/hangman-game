public class Word {
        String[] words = {"elephant", "giraffe", "tiger", "llama", "penguin", "crocodile", "tortoise", "monkey", "flamingo", "panda"};
        String newWord;
        String hiddenWord;
        public String getWord() {
            newWord = words[(int) (Math.random() * words.length)];
            return newWord;
        }
        public String hideWord() {
            hiddenWord = newWord.replaceAll("[a-z]", "_").replace("", " ").trim();
            return hiddenWord;
        }
}
