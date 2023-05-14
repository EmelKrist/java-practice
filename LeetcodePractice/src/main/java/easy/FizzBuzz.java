package easy;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://leetcode.com/problems/fizz-buzz/
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            String item = String.valueOf(i);
            if (i % 3 == 0 && i % 5 == 0) {
                item = "FizzBuzz";
            } else if (i % 3 == 0){
                item = "Fizz";
            } else if (i % 5 == 0) {
                item = "Buzz";
            }
            list.add(item);
        }
        return list;
    }
}

