package _7kyuTests;


import _7kyu.ValidParentheses;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidParenthesesTest {
    @Test
    @DisplayName("Should return true for valid parentheses")
    void validCases() {
        runTest(true, "()");
        runTest(true, "((()))");
        runTest(true, "()()()");
        runTest(true, "(()())()");
        runTest(true, "()(())((()))(())()");
    }

    @Test @DisplayName("Should return false for invalid parentheses")
    void invalidCases() {
        runTest(false, ")(");
        runTest(false, "()()(");
        runTest(false, "((())");
        runTest(false, "())(()");
        runTest(false, ")()");
        runTest(false, ")");
    }

    @Test @DisplayName("Should return true for empty strings")
    void emptyString() {
        runTest(true, "");
    }
    private void runTest(boolean expected, String input) {
        assertEquals(expected, ValidParentheses.validParenthesesAlterThree(input), "Test failed for input \""+input+"\"");
    }
}
