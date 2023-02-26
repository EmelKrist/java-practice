package _7kyuTests;

import _7kyu.RemoveConsecutiveDuplicateWords;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveConsecutiveDuplicateWordsTest {
    private String s1 = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
    private String ans1 = "alpha beta gamma delta alpha beta gamma delta";
    private String s2 = "cyqje cyqje cyqje a a a";
    private String ans2 = "cyqje a";

    @Test
    void basicTest() {
        assertEquals(ans2, RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicates(s2), "For input \"" + s2 + "\"");
        assertEquals(ans1, RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicates(s1), "For input \"" + s1 + "\"");
        assertEquals("", RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicates(""), "For input \"" + "" + "\"");
        assertEquals("word", RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicates("word"), "For input \"" + "word" + "\"");
        assertEquals("a ab", RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicates("a a ab"), "For input \"" + "a a ab" + "\"");
    }

    @Test
    void basicTestForAlter() {
        assertEquals(ans2, RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicatesAlter(s2), "For input \"" + s2 + "\"");
        assertEquals(ans1, RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicatesAlter(s1), "For input \"" + s1 + "\"");
        assertEquals("", RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicatesAlter(""), "For input \"" + "" + "\"");
        assertEquals("word", RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicatesAlter("word"), "For input \"" + "word" + "\"");
        assertEquals("a ab", RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicatesAlter("a a ab"), "For input \"" + "a a ab" + "\"");
    }

}
