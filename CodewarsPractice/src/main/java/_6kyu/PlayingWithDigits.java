package _6kyu;

/*
https://www.codewars.com/kata/5552101f47fc5178b1000050
*/
public class PlayingWithDigits {
    public static void main(String[] args) {
        System.out.println(digitalPow(89,1));
        System.out.println(digitalPowAlter(89,1));
    }

    public static long digitalPow(int n, int p) {
        String[] nums = ("" + n).split("");
        long k = 0;
        for (int i = 0; i < nums.length; i++) {
            k += Math.pow(Double.parseDouble(nums[i]), p);
            p++;
        }
        return k % n == 0 ? k / n : -1;
    }

    public static long digitalPowAlter(int n, int p) {
        String nStr = String.valueOf(n);
        long k = 0;
        for (int i = 0; i < nStr.length(); i++) {
            k += Math.pow(Character.getNumericValue(nStr.charAt(i)), p++);
        }
        return k % n == 0 ? k / n : -1;
    }
}
