package _7kyuTests;

import _7kyu.RemoveDuplicateWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicateWordsTest {
    @Test
    public void basicTests() {
        assertEquals("alpha beta gamma delta", RemoveDuplicateWords.removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        assertEquals("my cat is fat", RemoveDuplicateWords.removeDuplicateWords("my cat is my cat fat"));
    }

    @Test
    public void basicTestsForAlter() {
        assertEquals("alpha beta gamma delta", RemoveDuplicateWords.removeDuplicateWordsAlter("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        assertEquals("my cat is fat", RemoveDuplicateWords.removeDuplicateWordsAlter("my cat is my cat fat"));
    }

    @Test
    public void basicTestsForAlterTwo() {
        assertEquals("alpha beta gamma delta", RemoveDuplicateWords.removeDuplicateWordsAlterTwo("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        assertEquals("my cat is fat", RemoveDuplicateWords.removeDuplicateWordsAlterTwo("my cat is my cat fat"));
    }

    @Test
    public void basicTestsForAlterThree() {
        assertEquals("alpha beta gamma delta", RemoveDuplicateWords.removeDuplicateWordsAlterThree("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        assertEquals("my cat is fat", RemoveDuplicateWords.removeDuplicateWordsAlterThree("my cat is my cat fat"));
    }
}
