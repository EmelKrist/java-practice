package _7kyu;

/*
https://www.codewars.com/kata/55fd2d567d94ac3bc9000064
 */
public class SumOfOddNumbers {
    public static int rowSumOddNumbers(int n) {
        if (n == 1) return 1;
        /* Так как конец каждой строки = конец прошлой строки + 2 * длину разыскиваемой строки,
        ищем конец строки n. Самая первая строка выпадает, поэтому начинаем сразу со второй strNumber
         */
        int strEnd = 1, strNumber = 2;
        while (strNumber <= n) {
            strEnd += 2 * strNumber++;
        }
        /* когда нашли конец строки n, суммируем все n значений этой строки,
        де инкриминируя значение при каждом шаге на 2
         */
        int sum = 0;
        while (n-- > 0) {
            sum += strEnd;
            strEnd -= 2;
        }
        return sum;
    }


    public static int rowSumOddNumbersAlter(int n) {
     /* Сумма последующих чисел M составляет (M+1) M/2, поэтому
      * Мы можем знать, сколько цифр было ниже
      * Наша строка: numbersBelow = ((n-1)* (n))/2.
      * Теперь мы можем рассчитать первое число в строке:
      * FirstNumberInRow = 2* NumbersBelow+1.
      * Итак, FirstNumberInRow = n*n-n+1 и
      * Последний номер в строке-n*n-n+1+2(n-1).
      * Позвольте предположить, что последнее число до строки
      * x1 и последний номер в ряду - x2. Так как известно
      * что 1+3+5+...+(2K-1) = k*k.
      * Сумма в строке должна быть x2*x2 - x1*x1.
      * Наш x1 = (n*n-n)/2 и x2 = (n*n+n)/2.
      * После некоторого упрощения: sum = n * n * n. */
        return n * n * n;
    }
}
