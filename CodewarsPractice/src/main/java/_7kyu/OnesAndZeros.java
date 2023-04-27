package _7kyu;

import java.util.List;


/**
 * https://www.codewars.com/kata/578553c3a1b8d5c40300037c
 */
public class OnesAndZeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder binaryString = new StringBuilder();
        for (Integer integer : binary) {
            binaryString.append(integer);
        }
        return Integer.parseInt(binaryString.toString(), 2);
    }

    public static int ConvertBinaryArrayToIntAlter(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }

    public static int ConvertBinaryArrayToIntAlterTwo(List<Integer> binary) {
        int number = 0;
        for (int bit : binary)
            number = number << 1 | bit;
        return number;
    }
}
