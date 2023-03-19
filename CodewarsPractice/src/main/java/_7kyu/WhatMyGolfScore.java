package _7kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
https://www.codewars.com/kata/59f7a0a77eb74bf96b00006a
*/
public class WhatMyGolfScore {
    public static int golfScoreCalculator(String parList, String scoreList) {
        return getStringSum(scoreList) - getStringSum(parList);
    }

    public static int getStringSum(String str){
        int stringSum = 0;
        for (Character c: str.toCharArray()){
            stringSum+=Character.getNumericValue(c);
        }
        return stringSum;
    }

    public static int golfScoreCalculatorAlter(String parList, String scoreList) {
        return scoreList.chars().sum() - parList.chars().sum();
    }

    public static int golfScoreCalculatorAlterTwo(String parList, String scoreList) {
        return IntStream.range(0, 18).map(i -> scoreList.charAt(i) - parList.charAt(i)).sum();
    }
}
