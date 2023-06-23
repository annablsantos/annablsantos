package MaximumSubarraySum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxTest {

    @Test
    @DisplayName("Empty arrays should have a max of 0")
    public void testEmptyArray() {
        assertEquals(0, Max.sequence(new int[]{}));
    }

    @Test
    @DisplayName("Example array should have a max of 6")
    public void testExampleArray() {
        assertEquals(6, Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
