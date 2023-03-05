package _7kyu;

/*
https://www.codewars.com/kata/59e9f404fc3c49ab24000112
 */
public class Ch4113ng3 {
    public static String nerdify(String txt) {
        return txt.replaceAll("(?i)a", "4")
                .replaceAll("(?i)e", "3")
                .replaceAll("l", "1");
    }

    public static String nerdifyAlter(String txt) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String letter : txt.split("")) {
            switch (letter) {
                case "A":
                case "a":
                    stringBuilder.append("4");
                    break;
                case "E":
                case "e":
                    stringBuilder.append("3");
                    break;
                case "l":
                    stringBuilder.append("1");
                    break;
                default:
                    stringBuilder.append(letter);
                    break;
            }
        }
        return stringBuilder.toString();
    }
}
