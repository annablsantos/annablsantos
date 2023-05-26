package Excecao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindOutLierTest {
    @Test
    @DisplayName("Test with odd outlier")
    public void testFindException_oddOutlier() {
        int[] numbers = {2, 4, 7};
        int expected = 7;
        int result = FindOutLier.findException(numbers);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test with even outlier")
    public void testFindException_evenOutlier() {
        int[] numbers = {1, 3, 6};
        int expected = 6;
        int result = FindOutLier.findException(numbers);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test with no outlier")
    public void testFindException_noOutlier() {
        int[] numbers = {2, 4, 6};
        int expected = -1;
        int result = FindOutLier.findException(numbers);
        assertEquals(expected, result);
    }
}
