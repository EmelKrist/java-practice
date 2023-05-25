package _6kyuTests;

import _6kyu.SumConsecutives;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumConsecutivesTest {
    @Test
    public void test() {
        System.out.println("Basic Tests");
        List<Integer> i = Arrays.asList(1,4,4,4,0,4,3,3,1);
        List<Integer> o = Arrays.asList(1,12,0,4,6,1);
        System.out.println("Input: {1,4,4,4,0,4,3,3,1}");
        assertEquals(o, SumConsecutives.sumConsecutives(i));
        i = Arrays.asList(-5,-5,7,7,12,0);
        o = Arrays.asList(-10,14,12,0);
        System.out.println("Input: {-5,-5,7,7,12,0}");
        assertEquals(o, SumConsecutives.sumConsecutives(i));
    }
}
