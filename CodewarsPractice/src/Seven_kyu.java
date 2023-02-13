public class Seven_kyu {
    public static void main(String[] args) {
        //System.out.println(catsAndShelves(1,5));
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

}
