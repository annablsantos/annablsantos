package DetectPangram;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static DetectPangram.PangramChecker.check;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PangramCheckerTest {
    @Test
    @DisplayName("Should return true because the sentence uses the letters A-Z at least once.")
    public void test1(){
        String pangram1 = "The quick brown fox jumps over the lazy dog";
        assertTrue(check(pangram1));
    }
    @Test
    @DisplayName("Shoud return false.")
    public void test2(){
        String pangram2 = "You shall not pass!";
        assertFalse(check(pangram2));
    }
}

