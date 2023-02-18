package _5kyu;

import java.util.LinkedList;

/*
https://www.codewars.com/kata/555624b601231dc7a400017a/
 */
public class JosephusSurvivor {
    public static void main(String[] args) {
        System.out.println(josephusSurvivor(7, 3));
        System.out.println(josephusSurvivorAlter(7, 3));
        System.out.println(josephusSurvivorAlterTwo(7, 3));
    }

    public static int josephusSurvivor(final int n, final int k) {
        if (n == 1) return 1;
        return (josephusSurvivor(n - 1, k) + k - 1) % n + 1;
    }

    public static int josephusSurvivorAlter(final int n, final int k) {
        int survivor = 0;
        for (int i = 1; i <= n; i++) {
            survivor += k;
            survivor %= i;
        }
        return ++survivor;
    }

    public static int josephusSurvivorAlterTwo(final int n, final int k) {
        LinkedList<Integer> circle = new LinkedList<>();
        for (int i = n; i >= 1; i--) circle.add(0,i);
        for (int i = k - 1; circle.size() > 1; i += k - 1) circle.remove(i %= circle.size());
        return circle.get(0);
    }

}
