package _8kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/55a2d7ebe362935a210000b2
 */
public class SmallestInteger {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }

    public static int findSmallestIntAlter(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i: args){
            if (i < min) min = i;
        }
        return min;
    }

    public static int findSmallestIntAlterTwo(int[] args) {
        Arrays.sort(args);
        return args[0];
    }

}
