package _7kyu;

import java.util.Stack;

/**
 * https://www.codewars.com/kata/6411b91a5e71b915d237332d
 */
public class ValidParentheses {
    public static boolean validParentheses(String parenStr) {
        if (parenStr.isBlank()) return true;
        if (parenStr.length() % 2 != 0) return false;

        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < parenStr.length(); i++) {
            char c = parenStr.charAt(i);
            if (c == '(') {
                // помещаем в кучу все открывающие скобки, пока не встретится открывающая
                parentheses.push(c);
            } else {
                // если нынешний эл. не способен закрыть никакую скобку в стеке - invalid
                // если есть закрывающая скобка, но нет открывающей(стек пуст) - invalid
                if (c != ')' || parentheses.isEmpty()) return false;
                // удаляем последний эл. в стеке (есть валидная пара "()")
                parentheses.pop();
            }
        }
        return parentheses.isEmpty();
    }

    public static boolean validParenthesesAlter(String parenStr) {
        for (int i = 0; i < 10; i++) parenStr = parenStr.replaceAll("\\(\\)", "");
        return parenStr.isEmpty();
    }


    public static boolean validParenthesesAlterTwo(String parenStr) {
        try {
            parenStr.matches(parenStr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validParenthesesAlterThree(String parenStr) {
        // "(()())()(())" -> "()()" -> "" -> valid
        // "(()()))" -> "())" -> ")" -> invalid
        while (parenStr.contains("()")) parenStr=parenStr.replace("()", "");
        return parenStr.isEmpty();
    }

    public static boolean validParenthesesAlterFour(String parenStr) {
        int openBrackets = 0;
        for (int i = 0; i < parenStr.length(); i++){
            openBrackets += parenStr.charAt(i) == '(' ? 1 : -1;
            // отрицательное число - показатель, что в какой-то момент закрывающая
            // скобка не будет иметь перед собой открывающую(закрывающих больше, чем нужно) -> invalid
            if (openBrackets < 0) return false;
        }
        // если больше 0, то открывающих скобок больше, чем нужно - invalid
        return openBrackets == 0;
    }

    public static boolean validParenthesesAlterFive(String parenStr) {
        return parenStr.chars().reduce(0, (openBrackets, character) -> openBrackets < 0 ? openBrackets
                : character == '(' ? openBrackets++ : openBrackets--) == 0;
    }
}
