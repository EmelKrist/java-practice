package _7kyu;

import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/635a7827bafe03708e3e1db6
 */
public class SpeedLimit {
    public static int speedLimit(final int speed, final int[] signals) {
        int fine = 0, diff;
        for (int i = 0; i < signals.length; i++) {
            diff = speed - signals[i];
            if (10 <= diff && diff <= 19) {
                fine += 100;
                continue; // далее пропускаем
            } else if (20 <= diff && diff <= 29) {
                fine += 250;
                continue;
            } else if (30 <= diff) {
                fine += 500;
            }
        }
        return fine;
    }

    public static int speedLimitAlter(final int speed, final int[] signals) {
        // отображаем массив в разницы между нормой и скоростью, после отображаем в штрафы и суммируем
        return IntStream.of(signals)
                .map(vol -> speed - vol)
                .map(over -> (over < 10) ? 0 : (over < 20) ? 100 : (over < 30) ? 250 : 500).sum();
    }

    public static int speedLimitAlterTwo(final int speed, final int[] signals) {
        // сжимаем массив в сумму штрафов (счетчик начинается с 0)
        return IntStream.of(signals).reduce(0, (fine, signal) -> fine + (
                speed > signal + 29 ? 500 :
                speed > signal + 19 ? 250 :
                speed > 9 ? 100 : 0
        ));
    }
}
