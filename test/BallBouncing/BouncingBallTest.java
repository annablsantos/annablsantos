package BallBouncing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BouncingBallTest {
    @Test
    @DisplayName("Should return 3 for h=3.0, bounce=0.66, and window=1.5")
    public void test1() {
        assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
    }

    @Test
    @DisplayName("Should return 15 for h=30.0, bounce=0.66, and window=1.5")
    public void test2() {
        assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
    }
}
