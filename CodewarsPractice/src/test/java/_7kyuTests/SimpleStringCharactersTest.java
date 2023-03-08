package _7kyuTests;

import _7kyu.SimpleStringCharacters;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SimpleStringCharactersTest {
    @Test
    public void testSomething() {
        assertArrayEquals(new int[]{1,18,3,2}, SimpleStringCharacters.Solve("Codewars@codewars123.com"));
        assertArrayEquals(new int[]{8,6,3,2}, SimpleStringCharacters.Solve("CbgA5<1d-tOwUZTS8yQ"));
        assertArrayEquals(new int[]{9,9,6,9}, SimpleStringCharacters.Solve("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H"));
        assertArrayEquals(new int[]{15,8,6,9}, SimpleStringCharacters.Solve("RYT'>s&gO-.CM9AKeH?,5317tWGpS<*x2ukXZD"));
        assertArrayEquals(new int[]{10,7,3,6}, SimpleStringCharacters.Solve("$Cnl)Sr<7bBW-&qLHI!mY41ODe"));
        assertArrayEquals(new int[]{7,13,4,10}, SimpleStringCharacters.Solve("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft"));
    }

    @Test
    public void testSomethingForAlter() {
        assertArrayEquals(new int[]{1,18,3,2}, SimpleStringCharacters.SolveAlter("Codewars@codewars123.com"));
        assertArrayEquals(new int[]{8,6,3,2}, SimpleStringCharacters.SolveAlter("CbgA5<1d-tOwUZTS8yQ"));
        assertArrayEquals(new int[]{9,9,6,9}, SimpleStringCharacters.SolveAlter("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H"));
        assertArrayEquals(new int[]{15,8,6,9}, SimpleStringCharacters.SolveAlter("RYT'>s&gO-.CM9AKeH?,5317tWGpS<*x2ukXZD"));
        assertArrayEquals(new int[]{10,7,3,6}, SimpleStringCharacters.SolveAlter("$Cnl)Sr<7bBW-&qLHI!mY41ODe"));
        assertArrayEquals(new int[]{7,13,4,10}, SimpleStringCharacters.SolveAlter("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft"));
    }

    @Test
    public void testSomethingForAlterTwo() {
        assertArrayEquals(new int[]{1,18,3,2}, SimpleStringCharacters.SolveAlterTwo("Codewars@codewars123.com"));
        assertArrayEquals(new int[]{8,6,3,2}, SimpleStringCharacters.SolveAlterTwo("CbgA5<1d-tOwUZTS8yQ"));
        assertArrayEquals(new int[]{9,9,6,9}, SimpleStringCharacters.SolveAlterTwo("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H"));
        assertArrayEquals(new int[]{15,8,6,9}, SimpleStringCharacters.SolveAlterTwo("RYT'>s&gO-.CM9AKeH?,5317tWGpS<*x2ukXZD"));
        assertArrayEquals(new int[]{10,7,3,6}, SimpleStringCharacters.SolveAlterTwo("$Cnl)Sr<7bBW-&qLHI!mY41ODe"));
        assertArrayEquals(new int[]{7,13,4,10}, SimpleStringCharacters.SolveAlterTwo("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft"));
    }
    @Test
    public void testSomethingForAlterThree() {
        assertArrayEquals(new int[]{1,18,3,2}, SimpleStringCharacters.SolveAlterThree("Codewars@codewars123.com"));
        assertArrayEquals(new int[]{8,6,3,2}, SimpleStringCharacters.SolveAlterThree("CbgA5<1d-tOwUZTS8yQ"));
        assertArrayEquals(new int[]{9,9,6,9}, SimpleStringCharacters.SolveAlterThree("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H"));
        assertArrayEquals(new int[]{15,8,6,9}, SimpleStringCharacters.SolveAlterThree("RYT'>s&gO-.CM9AKeH?,5317tWGpS<*x2ukXZD"));
        assertArrayEquals(new int[]{10,7,3,6}, SimpleStringCharacters.SolveAlterThree("$Cnl)Sr<7bBW-&qLHI!mY41ODe"));
        assertArrayEquals(new int[]{7,13,4,10}, SimpleStringCharacters.SolveAlterThree("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft"));
    }
}
