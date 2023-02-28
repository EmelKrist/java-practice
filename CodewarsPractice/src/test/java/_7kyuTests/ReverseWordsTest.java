package _7kyuTests;

import _7kyu.ReverseWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsTest {
    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWords.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", ReverseWords.reverseWords("apple"));
        assertEquals("a b c d", ReverseWords.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", ReverseWords.reverseWords("double  spaced  words"));
    }

    @Test
    public void exampleCasesForAlter() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWords.reverseWordsAlter("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", ReverseWords.reverseWordsAlter("apple"));
        assertEquals("a b c d", ReverseWords.reverseWordsAlter("a b c d"));
        assertEquals("elbuod  decaps  sdrow", ReverseWords.reverseWordsAlter("double  spaced  words"));
    }

    @Test
    public void exampleCasesForAlterTwo() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWords.reverseWordsAlterTwo("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", ReverseWords.reverseWordsAlterTwo("apple"));
        assertEquals("a b c d", ReverseWords.reverseWordsAlterTwo("a b c d"));
        assertEquals("elbuod  decaps  sdrow", ReverseWords.reverseWordsAlterTwo("double  spaced  words"));
    }
}
