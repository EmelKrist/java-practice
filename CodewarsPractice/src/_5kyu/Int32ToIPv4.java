package _5kyu;

/*
https://www.codewars.com/kata/52e88b39ffb6ac53a400022e
 */
public class Int32ToIPv4 {
    public static void main(String[] args) {
        System.out.println(longToIP(2154959208L));
        System.out.println(longToIPAlter(2154959208L));
        System.out.println(longToIPAlterTwo(2154959208L));
    }

    public static String longToIP(long ip) {
        StringBuilder stringBuilder = new StringBuilder();
        return (stringBuilder.append((ip >> 24) & 0xff).append(".").append((ip >> 16) & 0xff).append(".").
                append((ip >> 8) & 0xff).append(".").append(ip & 0xff)).toString();
    }

    public static String longToIPAlter(long ip) {
        StringBuilder octets = new StringBuilder();
        int index = 4;
        while (index-- > 0) {
            octets.insert(0, "." + ip % 256);
            ip /= 256;
        }
        return octets.substring(1).toString();
    }

    public static String longToIPAlterTwo(long ip) {
        String[] octets = new String[4];
        int index = 4;
        while (index-- > 0) {
            octets[index] = "" + ip % 256;
            ip /= 256;
        }
        return String.join(".", octets);
    }
}
