package _7kyu;

/*
https://www.codewars.com/kata/592fd8f752ee71ac7e00008a
 */
public class Covfefe {
    public static String covfefe(String tweet) {
        String result = tweet.replace("coverage", "covfefe");
        return result.length() != tweet.length() ? result : tweet + " covfefe";
    }

    public static String covfefeAlter(String tweet) {
       return tweet.contains("coverage") ? tweet.replace("coverage", "covfefe") : tweet + " covfefe";
    }

    public static String covfefeAlterTwo(String tweet) {
        return tweet.indexOf("coverage") != -1 ? tweet.replace("coverage", "covfefe") : tweet + " covfefe";
    }
}
