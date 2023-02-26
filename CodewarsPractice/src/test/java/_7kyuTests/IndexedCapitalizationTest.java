package _7kyuTests;

import _7kyu.IndexedCapitalization;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndexedCapitalizationTest {
    @Test
    public void basicTest(){
        assertEquals("aBCdeF", IndexedCapitalization.capitalize("abcdef", new int[]{1,2,5}));
        assertEquals("aBCdeF", IndexedCapitalization.capitalize("abcdef", new int[]{1,2,5,100}));
        assertEquals("cOdEwArs", IndexedCapitalization.capitalize("codewars", new int[]{1,3,5,50}));
        assertEquals("abRacaDabRA", IndexedCapitalization.capitalize("abracadabra", new int[]{2,6,9,10}));
        assertEquals("codewArriors", IndexedCapitalization.capitalize("codewarriors", new int[]{5}));
    }

    @Test
    public void basicTestForAlter(){
        assertEquals("aBCdeF", IndexedCapitalization.capitalizeAlter("abcdef", new int[]{1,2,5}));
        assertEquals("aBCdeF", IndexedCapitalization.capitalizeAlter("abcdef", new int[]{1,2,5,100}));
        assertEquals("cOdEwArs", IndexedCapitalization.capitalizeAlter("codewars", new int[]{1,3,5,50}));
        assertEquals("abRacaDabRA", IndexedCapitalization.capitalizeAlter("abracadabra", new int[]{2,6,9,10}));
        assertEquals("codewArriors", IndexedCapitalization.capitalizeAlter("codewarriors", new int[]{5}));
    }

    @Test
    public void basicTestForAlterTwo(){
        assertEquals("aBCdeF", IndexedCapitalization.capitalizeAlterTwo("abcdef", new int[]{1,2,5}));
        assertEquals("aBCdeF", IndexedCapitalization.capitalizeAlterTwo("abcdef", new int[]{1,2,5,100}));
        assertEquals("cOdEwArs", IndexedCapitalization.capitalizeAlterTwo("codewars", new int[]{1,3,5,50}));
        assertEquals("abRacaDabRA", IndexedCapitalization.capitalizeAlterTwo("abracadabra", new int[]{2,6,9,10}));
        assertEquals("codewArriors", IndexedCapitalization.capitalizeAlterTwo("codewarriors", new int[]{5}));
    }
}
