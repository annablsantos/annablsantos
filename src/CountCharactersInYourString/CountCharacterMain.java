package CountCharactersInYourString;

import java.util.Map;

import static CountCharactersInYourString.CountCharacter.countCharacters;

public class CountCharacterMain {
    public static void main(String[] args) {
        String string = "aba";
        Map<Character, Integer> result = countCharacters(string);

        System.out.println("String: " + string);
        System.out.println("Character Count: " + result);


        //empty string
        String string2 = "";
        Map<Character, Integer> result2 = countCharacters(string2);

        System.out.println("String: " + string2);
        System.out.println("Character Count: " + result2);
    }
}
