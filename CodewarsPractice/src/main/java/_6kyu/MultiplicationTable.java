package _6kyu;

import java.util.stream.IntStream;

/*
https://www.codewars.com/kata/534d2f5b5371ecf8d2000a08
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int[] x : multiplicationTable(3)) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplicationTable(int n) {
        if (n == 1) return new int[][]{{1}};

        int[][] multiplicationTable = new int[n][n];
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                multiplicationTable[row - 1][column - 1] = row * column;
            }
        }
        return multiplicationTable;
    }

    public static int[][] multiplicationTableAlter(int n){
        return IntStream.rangeClosed(1, n).mapToObj(i ->
               IntStream.rangeClosed(1, n).map(j -> i * j).toArray()).toArray(int[][]::new);
    }
}
