package _6kyu;

/*
https://www.codewars.com/kata/5526fc09a1bbd946250002dc/
 */
import java.util.Arrays;

public class FindTheParityOutlier {
    public static void main(String[] args) {
        int[] exampleTest1 = {2, 6, 8, -10, 3};
        System.out.println(find(exampleTest1));
        System.out.println(findAlter(exampleTest1));
        System.out.println(findAlterTwo(exampleTest1));
    }

    public static int find(int[] integers) {
        int check;
        if (integers[0] % 2 == integers[1] % 2) check = integers[1] % 2;
        else return integers[0] % 2 == integers[2] % 2 ? integers[1] : integers[0];
        for (int i: integers) {
            if (Math.abs(i) % 2 != check) return i;
        }
        return 0;
    }

    public static int findAlter(int[] integers) {
        int[] changedArr = Arrays.stream(integers).filter(i -> i % 2 != 0).toArray();
        return changedArr.length == 1 ? changedArr[0] : Arrays.stream(integers).filter(i -> i % 2 == 0).toArray()[0];
    }

    public static int findAlterTwo(int[] integers) {
        long count = Arrays.stream(integers).limit(3).filter(i -> Math.abs(i) % 2 !=0).count();
        int check = (count == 3 || count == 2) ? 1 : 0;
        return Arrays.stream(integers).parallel().filter(i -> Math.abs(i) % 2 == check).toArray()[0];
    }

}
