package _7kyuTests;

import _7kyu.Ch4113ng3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ch4113ng3Test {
    @Test
    public void testSomething() {
        assertEquals("Fund4m3nt41s", Ch4113ng3.nerdify("Fund4m3nt41s"));
        assertEquals("S3v3n", Ch4113ng3.nerdify("Seven"));
        assertEquals("Los 4ng313s", Ch4113ng3.nerdify("Los Angeles"));
        assertEquals("S3oijs314wuu3", Ch4113ng3.nerdify("Seoijselawuue"));
    }

    @Test
    public void testSomethingForAlter() {
        assertEquals("Fund4m3nt41s", Ch4113ng3.nerdifyAlter("Fund4m3nt41s"));
        assertEquals("S3v3n", Ch4113ng3.nerdifyAlter("Seven"));
        assertEquals("Los 4ng313s", Ch4113ng3.nerdifyAlter("Los Angeles"));
        assertEquals("S3oijs314wuu3", Ch4113ng3.nerdifyAlter("Seoijselawuue"));
    }
}
