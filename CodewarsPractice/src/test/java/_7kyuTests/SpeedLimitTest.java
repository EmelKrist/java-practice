package _7kyuTests;
import static org.junit.jupiter.api.Assertions.assertEquals;

import _7kyu.SpeedLimit;
import org.junit.jupiter.api.Test;

public class SpeedLimitTest {
    @Test
    void testSpeedLimit() {

        assertEquals(0, SpeedLimit.speedLimit(60, new int[] {80,70,60 }));
        assertEquals(100, SpeedLimit.speedLimit(90, new int[] {80}));
        assertEquals(250, SpeedLimit.speedLimit(100, new int[]{110,100,80}));
        assertEquals(500, SpeedLimit.speedLimit(130, new int[]{140,130,100}));
        assertEquals(100, SpeedLimit.speedLimit(110, new int[]{120,110,100}));
        assertEquals(1500, SpeedLimit.speedLimit(220, new int[]{120,110,100}));
        assertEquals(850, SpeedLimit.speedLimit(100, new int[]{70,80,90,100}));
    }
}
