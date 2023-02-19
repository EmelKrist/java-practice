package _5kyu;

/*
https://www.codewars.com/kata/526dbd6c8c0eb53254000110
 */
public class NotVerySecure {
    public static void main(String[] args) {
        System.out.println(alphanumeric("regreg"));
        System.out.println(alphanumericAlter("uwefhieufh"));
    }

    public static boolean alphanumeric(String s) {
        return  !s.equals("") && s.replaceAll("[A-Za-z0-9]", "").isEmpty() ? true : false;
    }

    public static boolean alphanumericAlter(String s){
        return s.matches("[A-Za-z0-9]+");
    }
}
