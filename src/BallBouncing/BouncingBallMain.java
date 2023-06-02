package BallBouncing;

import static BallBouncing.BouncingBall.bouncingBall;

public class BouncingBallMain {
    public static void main(String[] args) {
        double h1 = 3;
        double bounce1 = 0.66;
        double window1 = 1.5;
        int result1 = bouncingBall(h1, bounce1, window1);
        System.out.println(result1); // output: 3

        double h2 = 3;
        double bounce2 = 1;
        double window2 = 1.5;
        int result2 = bouncingBall(h2, bounce2, window2);
        System.out.println(result2); // output: -1
    }
}
