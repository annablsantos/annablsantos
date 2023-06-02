package DetectPangram;

import static DetectPangram.PangramChecker.check;

public class PangramCheckerMain {
    public static void main(String[] args) {
        //output true
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = check(sentence);
        System.out.println(isPangram);
    }
}
