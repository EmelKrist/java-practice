package medium;

import java.util.Arrays;

public class SortTheStudentsByTheirKthScore {
    public static int[][] sortTheStudents(int[][] score, int k) {
        for(int i = 1; i < score.length; i++) {
            int[] student = score[i];
            int j = i - 1;

            while (j >= 0 && score[j][k] < student[k]) {
                score[j + 1] = score[j];
                j--;
            }
            score[j + 1] = student;
        }
        return score;
    }

}
