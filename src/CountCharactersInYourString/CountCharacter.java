package CountCharactersInYourString;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
    public static Map<Character, Integer> countCharacters(String string) {
        Map<Character, Integer> countChar = new HashMap<>();

        for (char c : string.toCharArray()) {
            countChar.put(c, countChar.getOrDefault(c, 0) + 1);
        }

        return countChar;
    }
}
