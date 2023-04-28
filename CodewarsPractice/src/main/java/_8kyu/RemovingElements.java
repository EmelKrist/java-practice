package _8kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://www.codewars.com/kata/5769b3802ae6f8e4890009d2
 */
public class RemovingElements {
    public static Object[] removeEveryOther(Object[] arr) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i+=2){
            if (i > arr.length - 1) break;
            list.add(arr[i]);
        }
        return list.toArray();
    }

    public static Object[] removeEveryOtherAlter(Object[] arr) {
        return Stream.iterate(0, i -> i < arr.length, i -> i + 2).map(i -> arr[i]).toArray();
    }
}
