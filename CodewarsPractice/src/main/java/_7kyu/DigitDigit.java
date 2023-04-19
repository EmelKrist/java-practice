package _7kyu;

import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/546e2562b03326a88e000020
 */
public class DigitDigit {
    public int squareDigits(int n) {
        String strNum = String.valueOf(n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strNum.length();i++){
            int number = Integer.parseInt(String.valueOf(strNum.charAt(i)));
            result.append(number * number);
        }
        return Integer.parseInt(result.toString());
    }

    public int squareDigitsAlter(int n) {
        return String.valueOf(n).chars()
                .map(i -> Character.getNumericValue((char)i))
                .map(i -> i * i).mapToObj(String::valueOf)
                .collect(Collectors.collectingAndThen(Collectors.joining(""), Integer::parseInt));
    }

    private final int BASE = 10;
    public int squareDigitsAlterTwo(int n) {
        if (n < BASE) return n * n;
        int digit = n % BASE;
        int squareDigit = digit * digit;
        return squareDigit + (squareDigit < n ? BASE : BASE * BASE) * squareDigitsAlterTwo(n / BASE);
    }

}
