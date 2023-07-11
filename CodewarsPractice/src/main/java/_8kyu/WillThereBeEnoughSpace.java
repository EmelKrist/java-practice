package _8kyu;

/**
 * https://www.codewars.com/kata/5875b200d520904a04000003
 */
public class WillThereBeEnoughSpace {
    public static int enough(int cap, int on, int wait){
        return Math.max(wait - (cap - on), 0);
    }
}
