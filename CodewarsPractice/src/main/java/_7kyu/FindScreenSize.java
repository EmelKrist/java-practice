package _7kyu;

/**
 * https://www.codewars.com/kata/5bbd279c8f8bbd5ee500000f
 */
public class FindScreenSize {
    public static String findScreenHeight(int width, String ratio) {
        String[] ratioSize = ratio.split(":");
        return width + "x"  + (int) (width / ((double) Integer.parseInt(ratioSize[0]) / Integer.parseInt(ratioSize[1])));
    }
}
