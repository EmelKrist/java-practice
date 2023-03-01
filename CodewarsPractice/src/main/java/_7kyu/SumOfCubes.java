package _7kyu;

import java.util.stream.LongStream;

/*
https://www.codewars.com/kata/59a8570b570190d313000037
 */
public class SumOfCubes {
    public static long sumCubes(long n) {
        long sumOfCubes = 0;
        for (long i = 1; i <= n; i++) sumOfCubes += i * i * i;
        return sumOfCubes;
    }

    public static long sumCubesAlter(long n) {
        return (n + n * n) * (n + n * n) / 4;
    }

    public static long sumCubesAlterTwo(long n) {
        return LongStream.rangeClosed(1, n).map(i -> i * i * i).sum();
    }
}
