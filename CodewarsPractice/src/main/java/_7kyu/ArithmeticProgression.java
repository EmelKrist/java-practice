package _7kyu;


import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
https://www.codewars.com/kata/55caf1fd8063ddfa8e000018
 */
public class ArithmeticProgression {
    public static String arithmeticSequenceElements(int a, int d, long n) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a));
        while (--n > 0){
            a+=d;
            stringBuilder.append(", ").append(a);
        }
        return stringBuilder.toString();
    }

    public static String arithmeticSequenceElementsAlter(int a, int d, long n) {
       return IntStream.iterate(a, t -> t + d)
               .limit(n)
               .mapToObj(Integer::toString)
               .collect(Collectors.joining(", "));
    }
}
