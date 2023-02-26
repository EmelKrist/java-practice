package _6kyu;

/*
https://www.codewars.com/kata/5544c7a5cb454edb3c000047
 */
public class BouncingBalls {
    public static void main(String[] args) {
        System.out.println(bouncingBall(3.0, 0.66, 1.5));
        System.out.println(bouncingBallAlter(3.0,0.66, 1.5));
    }
    private static int bouncingBall(double h, double bounce, double window) {
        if ((h > 0) && (bounce > 0) && (bounce < 1) && (window < h)) {
            int count = 1;
            h*=bounce;
            while (h > window) {
                h *= bounce;
                count+=2;
            }
            return count;
        } else return -1;
    }

    private static int bouncingBallAlter(double h, double bounce, double window){
        return ((h > 0) && (bounce > 0) && (bounce < 1) && (window < h)) ? 2 + bouncingBallAlter(h * bounce, bounce, window): -1;
    }
}
