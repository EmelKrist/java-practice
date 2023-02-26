package _7kyu;

/*
https://www.codewars.com/kata/5b39e91ee7a2c103300018b3
 */
public class RemoveConsecutiveDuplicateWords {

    public static String removeConsecutiveDuplicates(String s) {
        String[] words = s.split(" ");
        if (words.length == 1 || s.isEmpty()) return s;
        StringBuilder stringBuilder = new StringBuilder(words[0]); // Заносим 1 слово
        for (int index = 0; index < words.length - 1; index++) {
            if (!words[index].equals(words[index + 1])) { // Сравниваем нынешнее слово со след.
                // Если не равны, то заносим в строку с пробелом впереди
                stringBuilder.append(" ").append(words[index + 1]);
            }
        }
        return stringBuilder.toString();
    }

    public  static String removeConsecutiveDuplicatesAlter(String s){
        /* Если есть 1 и больше слов, которые идентичные 1 группе (1 слово с левой границы),
        заменяем на последнее с конца строки */
        return s.replaceAll("(\\b\\S+)( \\1\\b)+", "$1");
    }
}
