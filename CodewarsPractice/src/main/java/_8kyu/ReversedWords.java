package _8kyu;

import java.util.Scanner;

/*
Complete the solution so that it reverses all of the words within the string passed in.
Words are separated by exactly one space and there are no leading or trailing spaces.
https://www.codewars.com/kata/51c8991dee245d7ddf00000e

Заметка: 2 альтренатива - правильное решение задачи, так как
последние слова должны становиться первыми(изначально неправильно поняла задачу)
 */
public class ReversedWords {
    public static void main(String[] args) {
        reversedWords();
        reverseWordsAlter();
        reverseWordsAlterTwo();
    }

    public static void reversedWords() {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine(); // вводим строку слов

        String[] arrWords = inputString.split(" "); // сплитуем в массив по пробелам
        char[] charWord;
        for (int i = 0; i < arrWords.length; i++) {
            charWord = arrWords[i].toCharArray(); // преобразуем каждое слово в массив в массив символов
            for (int j = 0; j < charWord.length / 2; j++) {
                // меняем первый элемент в масиве символов с последним
                char temp = charWord[j];
                charWord[j] = charWord[charWord.length - j - 1];
                charWord[charWord.length - j - 1] = temp;
            }
            String resultWord = "";
            for (int k = 0; k < charWord.length; k++) {
                // соединяем массив символов в развернутое слово
                resultWord += charWord[k];
            }
            arrWords[i] = resultWord; // заносим развернутое слово в массив слов и выводим
            System.out.print(arrWords[i] + " ");
        }
    }

    public static void reverseWordsAlter() {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();

        String[] arrWords = inputString.split(" ");
        String lastWord, reverseWord;
        for (int i = 0; i < arrWords.length; i++) {
            lastWord = arrWords[i];
            reverseWord = "";
            for (int ch = lastWord.length() - 1; ch >= 0; ch--) {
                reverseWord += lastWord.charAt(ch);
            }
            System.out.print(reverseWord + " ");
        }
    }

    public static void reverseWordsAlterTwo() {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();

        String[] arrWords = inputString.split(" ");
        String reverseString = "";
        for (int i = arrWords.length - 1; i >= 0; i--) {
            reverseString += arrWords[i] + " ";
        }
        System.out.println(reverseString.substring(0, reverseString.length() - 1));
    }
}
