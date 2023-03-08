package _7kyu;

/*
https://www.codewars.com/kata/5a29a0898f27f2d9c9000058
 */
public class SimpleStringCharacters {
    public static int[] Solve(String word) {
        int[] result = {0, 0, 0, 0};
        for (Character letter : word.toCharArray()) {
            if (letter >= 65 && letter <= 90) result[0]++; // можно заменить на letter >= 'A' && letter <= 'Z'
            else if (letter >= 97 && letter <= 122) result[1]++; // можно заменить на letter >= 'a' && letter <= 'z'
            else if (letter >= 48 && letter <= 57) result[2]++; // можно заменить на letter >= '0' && letter <= '9'
            else result[3]++;
        }
        return result;
    }

    public static int[] SolveAlter(String word) {
        int[] result = {0, 0, 0, 0};
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) result[0]++;
            else if (Character.isLowerCase(word.charAt(i))) result[1]++;
            else if (Character.isDigit(word.charAt(i))) result[2]++;
            else result[3]++;
        }
        return result;
    }

    public static int[] SolveAlterTwo(String word) {
        return new int[]{word.replaceAll("[^A-Z]", "").length(),
                word.replaceAll("[^a-z]", "").length(),
                word.replaceAll("[^0-9]", "").length(),
                word.replaceAll("[A-Za-z0-9]", "").length()};
    }

    public static int[] SolveAlterThree(String word) {
        int upCaseLen = (int) word.chars().filter(Character::isUpperCase).count();
        int lowCAseLen = (int) word.chars().filter(Character::isLowerCase).count();
        int digLen = (int) word.chars().filter(Character::isDigit).count();
        int otherLen = word.length() - (upCaseLen + lowCAseLen + digLen);
        return new int[]{upCaseLen, lowCAseLen, digLen, otherLen};
    }
}
