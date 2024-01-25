package easy;

/**
 * https://leetcode.com/problems/sorting-the-sentence/description/
 */
public class SortingTheSentence {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        StringBuilder sortedSentence = new StringBuilder();
        quickSort(words, 0, words.length - 1);
        for (String word : words) {
            sortedSentence.append(word.substring(0, word.length() - 1)).append(" ");
        }
        return sortedSentence.toString().trim();
    }

    public String sortSentenceAlter(String s) {
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];
        for (String word : words) {
            int len = word.length();
            int rightIndex = word.charAt(len - 1) - '0' - 1;
            sortedWords[rightIndex] = word.substring(0, len - 1);
        }

        StringBuilder sortedSentence = new StringBuilder();
        for (String word : sortedWords) {
            sortedSentence.append(word).append(" ");
        }

        return sortedSentence.toString().trim();
    }


    private void quickSort(String[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    private int partition(String[] arr, int left, int right) {
        int pivotStringIndex = getIndex(arr[right]);
        int i = left - 1;
        for (int j = left; j < right; j++) {
            int wordIndex = getIndex(arr[j]);
            if (wordIndex < pivotStringIndex) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    private int getIndex(String word) {
        return word.charAt(word.length() - 1) - '0';
    }

    private void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
