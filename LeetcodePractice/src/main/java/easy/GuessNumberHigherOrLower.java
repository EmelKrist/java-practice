package easy;

/**
 * https://leetcode.com/problems/guess-number-higher-or-lower
 */
public abstract class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            int guessResult = guess(middle);
            if (guessResult == 0) {
                return middle;
            } else if (guessResult == 1) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    abstract int guess(int num);

}
