package _5kyu;

import java.util.Arrays;

/*
https://www.codewars.com/kata/54c9fcad28ec4c6e680011aa
 */
public class MergedStringChecker {
    public static void main(String[] args) {
        System.out.println(isMergeAlter("codewars", "cdwr", "oeas"));
    }

    /*
    Рекурсивный способ
     */
    public static boolean isMerge(String s, String part1, String part2) {
        if (s.equals("")) return part1.equals("") && part2.equals("");
        else {
            boolean mergedPart1 = false, mergedPart2 = false;
            if (part1.length() != 0 && part1.charAt(0) == s.charAt(0))
                mergedPart1 = isMerge(s.substring(1), part1.substring(1), part2);
            if (part2.length() != 0 && part2.charAt(0) == s.charAt(0))
                mergedPart2 = isMerge(s.substring(1), part1, part2.substring(1));
            return mergedPart1 || mergedPart2;
        }
    }

    /*
    Проходит не все тесты
     */
    public static boolean isMergeAlter(String s, String part1, String part2) {
        String parts = part1 + part2;
        // если длина не равна, точно false, иначе если строки идентичны, точно true
        if (parts.length() != s.length()) return false;
        else if (s.equals(parts) || s.equals(part2 + part1)) return true;
        /* иначе сортируем строки и сравниваем, возвращая результат (не подходит для задания),
        нужно не смотреть, совпадают ли символы, а именно делать merge, соблюдая порядок */
        return Arrays.equals(s.chars().sorted().toArray(), parts.chars().sorted().toArray());
    }
}
