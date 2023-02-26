package _7kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://www.codewars.com/kata/55f8a9c06c018a0d6e000132
 */
public class RegexValidatePinCode {
    public static void main(String[] args) {
        System.out.println(validatePin("3526"));
        System.out.println(validatePinAlter("3245"));
    }

    public static boolean validatePin(String pin) {
        return pin.matches("(\\d{4}|\\d{6})");
    }

    public static boolean validatePinAlter(String pin) {
        List<Character> validSymbols = new ArrayList<>(
        Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));
        boolean isValid = true;
        for(int c = 0; c < pin.length(); c++){
            if (!validSymbols.contains(pin.charAt(c))) {
                isValid = false;
                break;
            }
        }
        return isValid && (pin.length() == 4 || pin.length() == 6);
    }
}
