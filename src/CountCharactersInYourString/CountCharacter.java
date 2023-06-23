package CountCharactersInYourString;

import java.util.HashMap;
import java.util.Map;
/*
The main idea is to count all the occurring characters in a string.
If you have a string like aba, then the result should be {'a': 2, 'b': 1}.

What if the string is empty? Then the result should be empty object literal, {}.
 */
public class CountCharacter {
    public static Map<Character, Integer> countCharacters(String string) {
        Map<Character, Integer> countChar = new HashMap<>();

        for (char c : string.toCharArray()) {
            countChar.put(c, countChar.getOrDefault(c, 0) + 1);
        }

        return countChar;
    }
}
