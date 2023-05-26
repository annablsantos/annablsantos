package Reverse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static Reverse.ReverseWords.spinWords;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsTest {

    @Test
    @DisplayName("Should reverse every sentence.")
    public void testSpinWords() {
        assertEquals("emocleW", spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", spinWords("Hey fellow warriors"));
        assertEquals("olleH", spinWords("Hello"));
    }
}
