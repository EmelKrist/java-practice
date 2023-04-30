package _7kyu;

import java.util.*;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/57ee99a16c8df7b02d00045f
 */
public class FlattenAndAortAnArray {
    public static int[] flattenAndSort(int[][] array) {
        List<Integer> flattenArray = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                flattenArray.add(array[i][j]);
            }
        }
        Collections.sort(flattenArray);
        return flattenArray.stream().mapToInt(i -> i).toArray();
    }

    public static int[] flattenAndSortAlter(int[][] array) {
        return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
    }
}
