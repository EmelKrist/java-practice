package _7kyuTests;

import _7kyu.DescendingOrder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DescendingOrderTest {

    @Test
    public void baseTests() {
        assertEquals(0, DescendingOrder.sortDesc(0));
        assertEquals(51, DescendingOrder.sortDesc(15));
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }

    @Test
    public void baseTestsForAlter() {
        assertEquals(0, DescendingOrder.sortDescAlter(0));
        assertEquals(51, DescendingOrder.sortDescAlter(15));
        assertEquals(987654321, DescendingOrder.sortDescAlter(123456789));
    }
}
