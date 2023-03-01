package _6kyu;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
https://www.codewars.com/kata/554910d77a3582bbe300009c
 */
public class WhoWonTheElection {
    public static String getWinner(final List<String> listOfBallots) {
        Set<String> candidates = new HashSet<>(listOfBallots);
        long n = listOfBallots.size() / 2;
        for (String candidate : candidates) {
            if (listOfBallots.stream().filter(i -> i.equals(candidate)).count() > n) return candidate;
        }
        return null;
    }

    public static String getWinnerAlter(final List<String> listOfBallots) {
        HashSet<String> candidates = new HashSet<>(listOfBallots);
        for (String candidate : candidates) {
            if (Collections.frequency(listOfBallots, candidate) > listOfBallots.size() / 2) return candidate;
        }
        return null;
    }

    public static String getWinnerAlterTwo(final List<String> listOfBallots) {
        return listOfBallots.stream()
                .distinct()
                .filter(i -> Collections.frequency(listOfBallots, i) > listOfBallots.size() / 2)
                .findFirst()
                .orElse(null);
    }
}
