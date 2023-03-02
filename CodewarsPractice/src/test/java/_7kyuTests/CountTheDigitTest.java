package _7kyuTests;

import _7kyu.CountTheDigit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTheDigitTest {
    @Test
    public void test() {
        System.out.println("Fixed Tests nbDig");
        assertEquals(CountTheDigit.nbDig(5750, 0), 4700);
        assertEquals(CountTheDigit.nbDig(11011, 2), 9481);
        assertEquals(CountTheDigit.nbDig(12224, 8), 7733);
        assertEquals(CountTheDigit.nbDig(11549, 1), 11905);
    }

    @Test
    public void testForAlter() {
        System.out.println("Fixed Tests nbDig");
        assertEquals(CountTheDigit.nbDigAlter(5750, 0), 4700);
        assertEquals(CountTheDigit.nbDigAlter(11011, 2), 9481);
        assertEquals(CountTheDigit.nbDigAlter(12224, 8), 7733);
        assertEquals(CountTheDigit.nbDigAlter(11549, 1), 11905);
    }

    @Test
    public void testForAlterTwo() {
        System.out.println("Fixed Tests nbDig");
        assertEquals(CountTheDigit.nbDigAlterTwo(5750, 0), 4700);
        assertEquals(CountTheDigit.nbDigAlterTwo(11011, 2), 9481);
        assertEquals(CountTheDigit.nbDigAlterTwo(12224, 8), 7733);
        assertEquals(CountTheDigit.nbDigAlterTwo(11549, 1), 11905);
    }

    @Test
    public void testForAlterThree() {
        System.out.println("Fixed Tests nbDig");
        assertEquals(CountTheDigit.nbDigAlterThree(5750, 0), 4700);
        assertEquals(CountTheDigit.nbDigAlterThree(11011, 2), 9481);
        assertEquals(CountTheDigit.nbDigAlterThree(12224, 8), 7733);
        assertEquals(CountTheDigit.nbDigAlterThree(11549, 1), 11905);
    }
}
