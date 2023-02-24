package _8kyu;

/*
https://www.codewars.com/kata/56a3f08aa9a6cc9b75000023
 */
public class UsernameValidation {
    public static void main(String[] args) {
        System.out.println(validateUsr("asd43_34"));
        System.out.println(validateUsrAlter("asd43_34"));
    }

    public static boolean validateUsr(String s) {
        return s.matches("[0-9a-z_]*") && s.length() >= 4 && s.length() <= 16;
    }

    public static boolean validateUsrAlter(String s) {
        return s.matches("[0-9a-z_]{4,16}");
    }

}
