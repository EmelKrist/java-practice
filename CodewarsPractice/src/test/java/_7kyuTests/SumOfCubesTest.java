package _7kyuTests;

import _7kyu.SumOfCubes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfCubesTest {
    @Test
    public void exampleTests() {
        assertEquals(1, SumOfCubes.sumCubes(1));
        assertEquals(9,SumOfCubes.sumCubes(2));
        assertEquals(36,SumOfCubes.sumCubes(3));
        assertEquals(100,SumOfCubes.sumCubes(4));
        assertEquals(3025, SumOfCubes.sumCubes(10));
        assertEquals(58155876,SumOfCubes.sumCubes(123));
    }

    @Test
    public void exampleTestsForAlter() {
        assertEquals(1, SumOfCubes.sumCubesAlter(1));
        assertEquals(9,SumOfCubes.sumCubesAlter(2));
        assertEquals(36,SumOfCubes.sumCubesAlter(3));
        assertEquals(100,SumOfCubes.sumCubesAlter(4));
        assertEquals(3025, SumOfCubes.sumCubesAlter(10));
        assertEquals(58155876,SumOfCubes.sumCubesAlter(123));
    }

    @Test
    public void exampleTestsForAlterTwo() {
        assertEquals(1, SumOfCubes.sumCubesAlterTwo(1));
        assertEquals(9,SumOfCubes.sumCubesAlterTwo(2));
        assertEquals(36,SumOfCubes.sumCubesAlterTwo(3));
        assertEquals(100,SumOfCubes.sumCubesAlterTwo(4));
        assertEquals(3025, SumOfCubes.sumCubesAlterTwo(10));
        assertEquals(58155876,SumOfCubes.sumCubesAlterTwo(123));
    }
}
