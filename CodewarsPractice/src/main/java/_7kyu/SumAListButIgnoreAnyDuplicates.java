package _7kyu;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/5993fb6c4f5d9f770c0000f2
 */
public class SumAListButIgnoreAnyDuplicates {
    public static int sumNoDuplicates(int[] arr){
        Set<Integer> setOfDuplicates = new HashSet<>();
        Set<Integer> setOfUniques = new HashSet<>();

        for (int i : arr){
            if (!setOfUniques.add(i)){
                setOfDuplicates.add(i);
            }
        }

        return Arrays.stream(arr).filter(i -> !setOfDuplicates.contains(i)).sum();
    }

    public static int sumNoDuplicatesAlter(int[] arr){
        return IntStream.of(arr).boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet().stream().mapToInt(e -> e.getValue() > 1 ? 0 : e.getKey()).sum();
    }

    public static int sumNoDuplicatesAlterTwo(int[] arr){
        Map<Integer, Integer> mapOfArray = new HashMap<>();

        for (int i : arr){
            mapOfArray.put(i, mapOfArray.getOrDefault(i, 0) + 1);
        }

        return mapOfArray.entrySet().stream().filter(e -> e.getValue() == 1).mapToInt(Map.Entry::getKey).sum();
    }


}
