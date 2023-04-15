package _7kyu;

/**
 * https://www.codewars.com/kata/6071ef9cbe6ec400228d9531
 */
public class DotCalculator {
    public static String calc(String txt) {
        String[] parseStr = txt.split(" ");
        int leftSide = parseStr[0].length();
        int rightSide = parseStr[2].length();
        int result = 0;
        switch (parseStr[1]) {
            case "+":
                result = leftSide + rightSide;
                break;
            case "-":
                result = leftSide - rightSide;
                break;
            case "//":
                result = leftSide / rightSide;
                break;
            case "*":
                result = leftSide * rightSide;
                break;
        }

        return ".".repeat(result);
    }

    public static String calcAlter(String txt) {
        int leftSide = txt.indexOf(" ");
        int rightSide = txt.length() - leftSide - 3;
        switch (txt.replace(".", "").trim()) {
            case "+": return ".".repeat(leftSide + rightSide);
            case "-": return ".".repeat(leftSide - rightSide);
            case "//": return ".".repeat(leftSide / rightSide);
            case "*": return ".".repeat(leftSide * rightSide);
        }

        return "";
    }

}
