package SplitStrings;
/*Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters then it should replace
the missing second character of the final pair with an underscore ('_').

 Examples:

 - 'abc' =>  ['ab', 'c_']
 - 'abcdef' => ['ab', 'cd', 'ef']
*/

public class StringSplit {
    public static String[] stringSplitter(String s) {
        if (s.length() % 2 != 0) {
            s += "_";
        }
        int arrayLength = s.length() / 2;

        String[] pairs = new String[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            pairs[i] = s.substring(i * 2, (i * 2) + 2);
        }
        return pairs;
    }
}
