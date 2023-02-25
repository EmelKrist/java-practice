package _6kyu;

import java.util.Arrays;

/*
https://www.codewars.com/kata/525f50e3b73515a6db000b83
 */
public class CreatePhoneNumber {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(createPhoneNumberAlter(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(createPhoneNumberAlterTwo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(createPhoneNumberAlterThree(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder phoneNumber = new StringBuilder();
        for (int i = 0; i < numbers.length; i++)
            phoneNumber.append(i == 0 ? "(" + numbers[i] : numbers[i] + (i == 2 ? ") ": (i == 5 ? "-" : "")));
        return phoneNumber.toString();
    }
    public static String createPhoneNumberAlter(int[] numbers) {
        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append("(").append(numbers[0]).append(numbers[1]).append(numbers[2]).append(") ");
        phoneNumber.append(numbers[3]).append(numbers[4]).append(numbers[5]).append("-");
        phoneNumber.append(numbers[6]).append(numbers[7]).append(numbers[8]).append(numbers[9]);
        return phoneNumber.toString();
    }

    public static String createPhoneNumberAlterTwo(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
               numbers[0], numbers[1],numbers[2],numbers[3],numbers[4],
                numbers[5],numbers[6],numbers[7],numbers[8], numbers[9]);
    }

    public static String createPhoneNumberAlterThree(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
    }

}
