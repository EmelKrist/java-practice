package easy;

public class InsertionSort {
    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] >= temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
        return array;
    }

    public static int[] sortAlter(int[] array) {
        int n = array.length;
        for(int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }
}
