package _7kyuTests;

import _7kyu.CyclopsNumbers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CyclopsNumbersTest {
    @Test
    void basicTests() {
        assertFalse(CyclopsNumbers.cyclops(1), "1 is not a cyclops number");
        assertTrue (CyclopsNumbers.cyclops(5), "5 is a cyclops number");
        assertFalse(CyclopsNumbers.cyclops(3), "3 is not a cyclops number");
        assertFalse(CyclopsNumbers.cyclops(13), "13 is not a cyclops number");
        assertTrue (CyclopsNumbers.cyclops(27), "27 is a cyclops number");
        assertTrue (CyclopsNumbers.cyclops(2015), "2015 is a cyclops number");
        assertFalse(CyclopsNumbers.cyclops(666), "666 is not a cyclops number");
        assertFalse(CyclopsNumbers.cyclops(42), "42 is not a cyclops number");
    }

    @Test
    void basicTestsForAlter() {
        assertFalse(CyclopsNumbers.cyclopsAlter(1), "1 is not a cyclops number");
        assertTrue (CyclopsNumbers.cyclopsAlter(5), "5 is a cyclops number");
        assertFalse(CyclopsNumbers.cyclopsAlter(3), "3 is not a cyclops number");
        assertFalse(CyclopsNumbers.cyclopsAlter(13), "13 is not a cyclops number");
        assertTrue (CyclopsNumbers.cyclopsAlter(27), "27 is a cyclops number");
        assertTrue (CyclopsNumbers.cyclopsAlter(2015), "2015 is a cyclops number");
        assertFalse(CyclopsNumbers.cyclopsAlter(666), "666 is not a cyclops number");
        assertFalse(CyclopsNumbers.cyclopsAlter(42), "42 is not a cyclops number");
    }

    @Test
    void basicTestsForAlterTwo() {
        assertFalse(CyclopsNumbers.cyclopsAlterTwo(1), "1 is not a cyclops number");
        assertTrue (CyclopsNumbers.cyclopsAlterTwo(5), "5 is a cyclops number");
        assertFalse(CyclopsNumbers.cyclopsAlterTwo(3), "3 is not a cyclops number");
        assertFalse(CyclopsNumbers.cyclopsAlterTwo(13), "13 is not a cyclops number");
        assertTrue (CyclopsNumbers.cyclopsAlterTwo(27), "27 is a cyclops number");
        assertTrue (CyclopsNumbers.cyclopsAlterTwo(2015), "2015 is a cyclops number");
        assertFalse(CyclopsNumbers.cyclopsAlterTwo(666), "666 is not a cyclops number");
        assertFalse(CyclopsNumbers.cyclopsAlterTwo(42), "42 is not a cyclops number");
    }
}
