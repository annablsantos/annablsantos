package SplitStrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSplitTest {
    @Test
    @DisplayName("Should handle even string")
    public void testEvenString() {
        String string1 = "abcdef";
        String string2 = "HelloWorld";
        assertEquals("[ab, cd, ef]", Arrays.toString(StringSplit.stringSplitter(string1)));
        assertEquals("[He, ll, oW, or, ld]", Arrays.toString(StringSplit.stringSplitter(string2)));
    }

    @Test
    @DisplayName("Should handle odd string")
    public void testOddString() {
        String string3 = "abcde";
        String string4 = "LovePizza";
        assertEquals("[ab, cd, e_]", Arrays.toString(StringSplit.stringSplitter(string3)));
        assertEquals("[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplit.stringSplitter(string4)));
    }
}
