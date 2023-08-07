package easy;

public class MergeSort {
    public static void mergeSort(int[] a, int n) {
        if (n < 2) return;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }

        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    private static void merge(int[] array, int[] left, int[] right, int leftLen, int rightLen) {
        int iL = 0, iR = 0, iA = 0;
        while (iL < leftLen && iR < rightLen) {
            if (left[iL] <= right[iR]) {
                array[iA++] = left[iL++];
            } else {
                array[iA++] = right[iR++];
            }
        }

        while (iL < leftLen) {
            array[iA++] = left[iL++];
        }

        while (iR < rightLen) {
            array[iA++] = right[iR++];
        }
    }
}
