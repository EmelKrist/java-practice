package _8kyu;

import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/55ecd718f46fba02e5000029
 */
public class WhatIsBetween {
    public static int[] between(int a, int b) {
        return IntStream.range(a, b + 1).toArray();
    }

    public static int[] betweenAlter(int a, int b) {
        int[] array = new int[b - a + 1];
        int num = a;
        for (int i = 0; i < array.length; i++) {
            array[i] = num++;
        }
        return array;
    }
}
