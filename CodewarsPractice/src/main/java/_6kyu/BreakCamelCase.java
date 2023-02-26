package _6kyu;

/*
Complete the solution so that the function will
break up camel casing, using a space between words
*/
public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
        System.out.println(camelCaseAlter("camelCasing"));
    }

    private static String camelCase(String input) {
        StringBuilder output = new StringBuilder();
        char symbol;
        for (int i = 0; i < input.length(); i++) {
            symbol = input.charAt(i);
            output.append(Character.isUpperCase(symbol) ? " " + symbol : symbol);
        }
        return output.toString();
    }

    private static String camelCaseAlter(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
