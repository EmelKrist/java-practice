package _5kyu;

/*
https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c
 */
public class MaximumSubarraySum {
    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int sequence(int[] arr) {
        if (arr.length == 0) return 0;
        int substringMaxSum = Integer.MIN_VALUE;
        int currencyMaxSum = 0;
        for (int index = 0; index < arr.length; index++) {
            currencyMaxSum += arr[index]; // наращиваем сумму подмассива
            if (currencyMaxSum < 0) currencyMaxSum = 0; // если отрицательная, то обнуляем
            /* если актуальная сумма больше максимальной суммы подмассива, наращиваем подмассив и
               присваиваем актуальную сумму сумме подмассива */
            if (currencyMaxSum > substringMaxSum) substringMaxSum = currencyMaxSum;
        }
        return substringMaxSum;
    }

    /* Подмассивом будет считаться:
    Права граница: последний раз, когда актуальная сумма была больше максимальной суммы подмассива
    Левая граница: отсчитывая от правой границы, первый элемент, который шел сразу после обнуления
    актуальной суммы из-за ее отрицательности (то есть когда сумма снова начала накапливаться так,
    что привело к тому, что в элементе правой границы была получена максимально возможная сумма подмассива)
    */
}
