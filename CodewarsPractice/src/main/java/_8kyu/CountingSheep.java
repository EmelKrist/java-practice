package _8kyu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/*
https://www.codewars.com/kata/54edbc7200b811e956000556
 */
public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(i -> i != null && i).count();
    }

    public int countSheepsALterTwo(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean sheep : arrayOfSheeps) {
            if (Boolean.TRUE.equals(sheep)) count++; // если boolean sheep true и не Null
        }
        return count;
    }

    public int countSheepsALterThree(Boolean[] arrayOfSheeps) {
        return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
    }

    public int countSheepsALterFour(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(Objects::nonNull).filter(Boolean::booleanValue).count();
    }

}
