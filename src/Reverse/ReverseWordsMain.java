package Reverse;

import static Reverse.ReverseWords.spinWords;

public class ReverseWordsMain {
    public static void main(String[] args) {
        String sentence1 = "Hey fellow warriors";
        String sentence2 = "This is a test";
        String sentence3 = "This is another test";

        System.out.println(spinWords(sentence1));
        System.out.println(spinWords(sentence2));
        System.out.println(spinWords(sentence3));
    }
}
