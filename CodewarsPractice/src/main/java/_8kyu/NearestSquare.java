package _8kyu;

/**
 * https://www.codewars.com/kata/5a805d8cafa10f8b930005ba
 */
public class NearestSquare {
    public static int nearestSq(final int n){
        return (int) Math.pow(Math.round(Math.sqrt(n)),2);
    }
}
