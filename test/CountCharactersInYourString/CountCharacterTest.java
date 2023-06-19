package CountCharactersInYourString;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountCharacterTest {
    @Test
    @Order(1)
    public void testEmptyString() {
        Map<Character, Integer> expected = new HashMap<>();
        Map<Character, Integer> actual = CountCharacter.countCharacters("");
        assertEquals(expected, actual);
    }

    @Test
    @Order(2)
    public void testSingleCharacter() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        Map<Character, Integer> actual = CountCharacter.countCharacters("a");
        assertEquals(expected, actual);
    }

    @Test
    @Order(3)
    public void testMultipleCharacters() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 3);
        expected.put('b', 3);
        expected.put('c', 1);
        Map<Character, Integer> actual = CountCharacter.countCharacters("aabbbac");
        assertEquals(expected, actual);
    }

    @Test
    @Order(4)
    public void testAllCharactersUnique() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        expected.put('b', 1);
        expected.put('c', 1);
        Map<Character, Integer> actual = CountCharacter.countCharacters("abc");
        assertEquals(expected, actual);
    }

    @Test
    @Order(5)
    public void testAllCharactersSame() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 5);
        Map<Character, Integer> actual = CountCharacter.countCharacters("aaaaa");
        assertEquals(expected, actual);
    }

    @Test
    @Order(6)
    public void testDifferentCharacters() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 2);
        Map<Character, Integer> actual = CountCharacter.countCharacters("aabb");
        assertEquals(expected, actual);
    }
}
