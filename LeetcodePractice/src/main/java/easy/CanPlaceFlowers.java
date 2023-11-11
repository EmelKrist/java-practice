package easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/can-place-flowers/
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if ((i == 0 || flowerbed[i - 1] != 1)
                        && (i == flowerbed.length - 1 || flowerbed[i + 1] != 1)) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return n < 1;
    }
}
