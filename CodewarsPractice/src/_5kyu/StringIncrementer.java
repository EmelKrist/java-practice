package _5kyu;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
https://www.codewars.com/kata/54a91a4883a7de5d7800009c
 */
public class StringIncrementer {
    public static void main(String[] args) {
        System.out.println(incrementString("fewhfehf_928wjkdnej0035066321179490702898279"));
    }

    public static String incrementString(String str) {
        // выделяем группы: голова, нули, число, которое нужно инкриминировать
        Matcher matcher = Pattern.compile("(.*[^0-9]$*)?(0*)?(\\d*)?").matcher(str);
        matcher.find(); // ищем группы и присваиваем их переменным
        String firstSymbols = matcher.group(1), zeroes = matcher.group(2), numbers = matcher.group(3), incrNumber;
        // если есть что инкриминировать, через BigInteger прибавляем 1, в противном случае просто ставим 1
        incrNumber = (numbers.length() != 0 ? new BigInteger(numbers).add(BigInteger.ONE) : 1) + "";
        // узнаем разницу длин между ранним числом и инкриминируемой версией
        int numDiffSize = incrNumber.length() - numbers.length();
        // если число стало занимать больше символов (при инкременте встретилась(ись) 9) и при этом есть значащие нули
        if (numDiffSize != 0 && zeroes.length() != 0)
            zeroes = zeroes.substring(0, zeroes.length() - numDiffSize); // обрезаем значащие нули, которые заменились числом
        // объединяем все части строки и избавляемся от null
        return new StringBuilder().append(firstSymbols).append(zeroes).append(incrNumber).toString().replace("null", "");
    }

}
