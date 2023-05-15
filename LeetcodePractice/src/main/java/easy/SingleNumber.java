package easy;

import java.util.*;

/**
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        /**
         * Проблема решается, используя свойства XOR
         * Берется переменная с 0 в качестве начального значения.
         * И затем для каждого элемента i в массиве мы выполним операцию XOR элемента с 0,
         * ans станет 0, если будет найдено то же число (поскольку XOR a = 0),
         * и поэтому после завершения цикла только элемент без повторяющегося номера
         * останется и будет возвращен как ответ.
         */
        int ans  = 0;
        for (int i = 0; i < nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
    public int singleNumberAlter(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if (list.contains(nums[i])) {
                list.remove((Integer) nums[i]);
            } else list.add(nums[i]);
        }
        return list.get(0);
    }
}
