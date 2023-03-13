package _7kyuTests;

import _7kyu.Covfefe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CovfefeTest {
    @Test
    public void basicTest() {
        assertEquals("covfefe", Covfefe.covfefe("coverage"));
        assertEquals("covfefe covfefe", Covfefe.covfefe("coverage coverage"));
        assertEquals("nothing covfefe", Covfefe.covfefe("nothing"));
        assertEquals( "double space  covfefe" ,Covfefe.covfefe("double space "));
        assertEquals("covfefe covfefe", Covfefe.covfefe("covfefe"));
        assertEquals("erag covfefe", Covfefe.covfefe("erag"));
    }

    @Test
    public void basicTestForAlter() {
        assertEquals("covfefe", Covfefe.covfefeAlter("coverage"));
        assertEquals("covfefe covfefe", Covfefe.covfefeAlter("coverage coverage"));
        assertEquals("nothing covfefe", Covfefe.covfefeAlter("nothing"));
        assertEquals( "double space  covfefe" ,Covfefe.covfefeAlter("double space "));
        assertEquals("covfefe covfefe", Covfefe.covfefeAlter("covfefe"));
        assertEquals("erag covfefe", Covfefe.covfefeAlter("erag"));
    }

    @Test
    public void basicTestForAlterTwo() {
        assertEquals("covfefe", Covfefe.covfefeAlterTwo("coverage"));
        assertEquals("covfefe covfefe", Covfefe.covfefeAlterTwo("coverage coverage"));
        assertEquals("nothing covfefe", Covfefe.covfefeAlterTwo("nothing"));
        assertEquals( "double space  covfefe" ,Covfefe.covfefeAlterTwo("double space "));
        assertEquals("covfefe covfefe", Covfefe.covfefeAlterTwo("covfefe"));
        assertEquals("erag covfefe", Covfefe.covfefeAlterTwo("erag"));
    }
}
