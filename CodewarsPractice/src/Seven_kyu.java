public class Seven_kyu {
    public static void main(String[] args) {
        //System.out.println(catsAndShelves(1,5));
        //System.out.println(isSquare(25));
    }

    /*
     https://www.codewars.com/kata/62c93765cef6f10030dfa92b
     */
    public static int catsAndShelves(int start, int finish) {
        if (start > finish || start < 0 || finish < 0) {
            return 0;
        }
        int countSteps = 0;
        while (start != finish) {
            if (finish - start >= 3) {
                start += 3;
            } else start++;
            countSteps++;
        }
        return countSteps;
        /*
        Best practice:
        int diff = (finish - start);
        return diff/3 + diff % 3;
         */
    }

    /*
    Given an integral number, determine if it's a square number:
    https://www.codewars.com/kata/54c27a33fb7da0db0100040e
     */
    public static boolean isSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        if (n < 0) System.out.print("negative numbers aren't square numbers");
        else if (sqrt * sqrt == n) {
            System.out.print(n + " is a square number (" + sqrt + " * " + sqrt + ")");
            return true;
        } else System.out.print(n + " isn't a square number");
        return false; // fix me!
    }

    public static boolean isSquareAlter(int n) {
        if (Math.sqrt(n) % 1 == 0.0) {
            return true;
        }
        return false;
    }
    
}
