package easy;

import java.util.Arrays;

public class SelectSort {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) min = j;
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }
}
