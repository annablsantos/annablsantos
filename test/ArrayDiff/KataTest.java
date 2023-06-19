package ArrayDiff;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class KataTest {
    @Test
    @DisplayName("Should return array with elements from 'a' not present in 'b'.")
    public void sampleTests() {
        assertArrayEquals(new int[] {2}, Kata.arrayDiff(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, Kata.arrayDiff(new int [] {}, new int[] {1,2}));
    }
}

