package _7kyu;

/*
Given an integral number, determine if it's a square number:
https://www.codewars.com/kata/54c27a33fb7da0db0100040e
*/
public class YouAreSquare {
    public static void main(String[] args) {
        System.out.println(isSquare(25));
        System.out.println(isSquareAlter(25));
    }

    public static boolean isSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        if (n < 0) System.out.print("negative numbers aren't square numbers");
        else if (sqrt * sqrt == n) {
            System.out.print(n + " is a square number (" + sqrt + " * " + sqrt + ")");
            return true;
        } else System.out.print(n + " isn't a square number");
        return false; // fix me!
    }

    public static boolean isSquareAlter(int n) {
        if (Math.sqrt(n) % 1 == 0.0) {
            return true;
        }
        return false;
    }
}
