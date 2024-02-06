package easy;

/**
 * https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
 */
public class MinimumNumberOfMoves {
    public int minMovesToSeat(int[] seats, int[] students) {
        int n = seats.length;
        quickSort(seats, 0, n - 1);
        quickSort(students, 0, n - 1);

        int moves = 0;
        for(int i = 0; i < n; i++) {
            moves += Math.abs(seats[i] - students[i]);
        }

        return moves;
    }

    private void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;
        for(int j = left; j < right; j++) {
            if (pivot < array[j]) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, right);
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
