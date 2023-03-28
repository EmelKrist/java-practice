package _7kyuTests;

import _7kyu.AlphabetWar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlphabetWarTest {
    @Test
    public void BasicTest() {
        assertEquals("Right side wins!", AlphabetWar.alphabetWar("z"));
        assertEquals("Let's fight again!", AlphabetWar.alphabetWar("zdqmwpbs"));
        assertEquals("Right side wins!", AlphabetWar.alphabetWar("zzzzs"));
        assertEquals("Left side wins!", AlphabetWar.alphabetWar("wwwwwwz"));
        assertEquals("Right side wins!", AlphabetWar.alphabetWarAlter("z"));
        assertEquals("Let's fight again!", AlphabetWar.alphabetWarAlter("zdqmwpbs"));
        assertEquals("Right side wins!", AlphabetWar.alphabetWarAlter("zzzzs"));
        assertEquals("Left side wins!", AlphabetWar.alphabetWarAlter("wwwwwwz"));
    }
}
