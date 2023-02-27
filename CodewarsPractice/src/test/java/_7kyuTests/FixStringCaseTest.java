package _7kyuTests;

import _7kyu.FixStringCase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FixStringCaseTest {
    @Test
    public void BasicTests() {
        assertEquals("code", FixStringCase.solve("code"));
        assertEquals("CODE", FixStringCase.solve("CODe"));
        assertEquals("code", FixStringCase.solve("COde"));
        assertEquals("code", FixStringCase.solve("Code"));
        assertEquals("", FixStringCase.solve(""));
    }

    @Test
    public void BasicTestsForAlter() {
        assertEquals("code", FixStringCase.solveAlter("code"));
        assertEquals("CODE", FixStringCase.solveAlter("CODe"));
        assertEquals("code", FixStringCase.solveAlter("COde"));
        assertEquals("code", FixStringCase.solveAlter("Code"));
        assertEquals("", FixStringCase.solveAlter(""));
    }
}
