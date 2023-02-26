package _5kyu;

/*
https://www.codewars.com/kata/526989a41034285187000de4
 */
public class CountIPAddresses {
    public static void main(String[] args) {
        System.out.println(ipsBetween("10.0.0.0", "10.0.1.0"));
    }

    public static long ipsBetween(String start, String end) {
        return convertToLongIP(end) - convertToLongIP(start);
    }

    public static long convertToLongIP(String ip) {
        long longIp = 0;
        for (String i : ip.split("\\.")) {
            longIp *= 256;
            longIp += Long.parseLong(i);
        }
        return longIp;
    }

}
