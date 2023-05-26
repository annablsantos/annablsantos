package Sum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static Sum.Sum.sumIntegers;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {
    @Test
    @DisplayName("Should return the correct numbers for each operation knowing that if the two numbers are equal return a or b.")
    public void testSum() {
        assertEquals(-1, sumIntegers(0, -1));
        assertEquals(1, sumIntegers(1, 1));
        assertEquals(6, sumIntegers(1, 3));
        assertEquals(-6, sumIntegers(-3, -1));
        assertEquals(10, sumIntegers(0, 4));
    }
}
