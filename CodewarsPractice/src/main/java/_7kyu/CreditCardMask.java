package _7kyu;

/**
 * https://www.codewars.com/kata/5412509bd436bd33920011bc
 */
public class CreditCardMask {
    public static String maskify(String str) {
        return str.length() <= 4 ? str :"#".repeat(str.length() - 4) + str.substring(str.length() - 4);
    }

    public static String maskifyAlter(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
}
