package _7kyu;

/*
Complete the findNextSquare method that finds the next
integral perfect square after the one passed as a parameter.
https://www.codewars.com/kata/56269eb78ad2e4ced1000013
*/
public class FindTheNextSquare {
    public static void main(String[] args) {
        System.out.println(findNextSquare(121));
        System.out.println(finsNextSquareAlter(121));
    }

    public static long findNextSquare(long sq) {
        long nextSq = sq;
        while (true) {
            if (Math.sqrt(++nextSq) % 1 == 0) break;
        }
        return Math.sqrt(sq) % 1 == 0 ? nextSq : -1;
        /*
        Best practice:
        return mainSqrt % 1 != 0 ? -1 : (mainSqrt + 1) * (mainSqrt + 1);
        */
    }

    public static long finsNextSquareAlter(long sq){
        long mainSqrt = (long) Math.sqrt(sq);
        return mainSqrt % 1 == 0 ? (long) Math.pow(mainSqrt + 1, 2) : -1;
    }
}
