package _7kyu;

/*
https://www.codewars.com/kata/5668e3800636a6cd6a000018
 */
public class Ghostbusters {
    public static void main(String[] args) {
        System.out.println(ghostBusters("bo re d"));
        System.out.println(ghostBusters("office"));
    }

    public static String ghostBusters(String building) {
       return building.contains(" ") ?
               building.replace(" ", "") :
               "You just wanted my autograph didn't you?";
    }
}
