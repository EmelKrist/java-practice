package _7kyu;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
https://www.codewars.com/kata/5572392fee5b0180480001ae
 */
public class KeypadHorror {
    public static String computerToPhone(String number) {
        StringBuilder result = new StringBuilder(number);
        char num;
        for (int i = 0; i < result.length(); i++) {
            num = result.charAt(i);
            if (num >= '7' && num <= '9') {
                num-=6;
                result.setCharAt(i, num);
            } else if (num >= '1' && num <= '3'){
                num+=6;
                result.setCharAt(i, num);
            }
        }
        return result.toString();
    }

    public static String computerToPhoneAlter(String number) {
        Map<Integer, String> map = new HashMap<>(
        Map.of(55,"1", 56, "2", 57, "3", 52, "4", 53, "5",
                54, "6", 49, "7", 50, "8", 51, "9", 48, "0"));
        // заменяем символы = ключу на значение Map
        return number.chars().mapToObj(map::get).collect(Collectors.joining());
    }

    public static String computerToPhoneAlterTwo(String number) {
        return String.join("", number.chars().mapToObj(ch ->{
            int num = Character.getNumericValue(ch);
            if (num != 0) {
                if (num >= 7) num -= 6;
                else if (num <= 3) num += 6;
            } return String.valueOf(num);
        }).toArray(String[]::new));
    }


    public static String computerToPhoneAlterThree(String number) {
        return number.chars().mapToObj(ch -> String.valueOf("0789456123".indexOf(ch))).collect(Collectors.joining());
    }
}
