package SplitStrings;

import java.util.List;
import static SplitStrings.StringSplit.stringSplitter;


public class StringSplitMain {
    public static void main(String[] args) {
        String str = "abcd";
        List<String> pairs = List.of(stringSplitter(str));

        for (String pair : pairs) {
            System.out.println(pair);
        }
    }
}
