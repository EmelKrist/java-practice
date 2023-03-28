package _7kyu;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/59377c53e66267c8f6000027
 */
public class AlphabetWar {
    public static String alphabetWar(String fight){
        int leftScore = 0, rightScore = 0;
        Map<Character, Integer> leftPower = new HashMap<>();
        leftPower.put('w', 4); leftPower.put('p', 3); leftPower.put('b', 2); leftPower.put('s', 1);
        Map<Character, Integer> rightPower = new HashMap<>();
        rightPower.put('m', 4); rightPower.put('q', 3); rightPower.put('d', 2); rightPower.put('z', 1);

        for (char letter: fight.toCharArray()){
            if (leftPower.containsKey(letter)) leftScore+=leftPower.get(letter);
            else if (rightPower.containsKey(letter)) rightScore+=rightPower.get(letter);
        }

        return leftScore == rightScore ? "Let's fight again!"
                : leftScore > rightScore ? "Left side wins!" : "Right side wins!";
    }

    public static String alphabetWarAlter(String fight){
        int leftScore = 0, rightScore = 0;
        for (char letter: fight.toCharArray()){
            switch (letter){
                case 'w' : leftScore+=4; break;
                case 'p' : leftScore+=3; break;
                case 'b' : leftScore+=2; break;
                case 's' : leftScore++; break;

                case 'm' : rightScore+=4; break;
                case 'q' : rightScore+=3; break;
                case 'd' : rightScore+=2; break;
                case 'z' : rightScore++; break;
            }
        }

        if (leftScore == rightScore) return "Let's fight again!";
        return leftScore > rightScore ? "Left side wins!" : "Right side wins!";
    }
}
