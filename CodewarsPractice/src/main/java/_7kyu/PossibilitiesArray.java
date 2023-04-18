package _7kyu;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/59b710ed70a3b7dd8f000027
 */
public class PossibilitiesArray {
    public static boolean isAllPossibilities(int[] arg) {
        if (arg.length == 0) return false;
        for (int i = 0; i < arg.length; i++){
            int needle = i;
            if (Arrays.stream(arg).noneMatch(a -> a == needle)) return false;
        }
        return true;
    }

    public static boolean isAllPossibilitiesAlter(int[] arg) {
        Set<Integer> set = Arrays.stream(arg).boxed().collect(Collectors.toSet());
        return arg.length > 0 &&
               set.size() == arg.length &&
               IntStream.range(0, arg.length).filter(i -> !set.contains(i)).count() == 0L;
    }

    public static boolean isAllPossibilitiesAlterTwo(int[] arg) {
        if (arg.length == 0) return false;
        Arrays.sort(arg);
        return IntStream.range(0, arg.length).allMatch(i -> arg[i] == i);
    }
}
