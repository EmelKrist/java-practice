package easy;

/**
 * https://leetcode.com/problems/flipping-an-image/
 */
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] flippedAndInvertedImage = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                int invertedNum = image[i][j] == 0 ? 1 : 0;
                flippedAndInvertedImage[i][flippedAndInvertedImage[i].length - j - 1] = invertedNum;
            }
        }
        return flippedAndInvertedImage;
    }

    public int[][] flipAndInvertImageAlter(int[][] image) {
        for (int[] row : image) {
            for (int col = 0; col < (row.length + 1) / 2; col++) {
                int temp = row[col] ^ 1;
                row[col] = row[row.length - col - 1] ^ 1;
                row[row.length - col - 1] = temp;
            }
        }
        return image;
    }
}
