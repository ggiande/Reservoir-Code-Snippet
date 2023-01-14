package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/* 1. Two Sum
 *
 * @author ggiande
 *
 * */
public class EasyTwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // 2, 9
        // if 2 - 9 = key cached in hashmap, then save
        // else, add the current value as a key and the current index as a value to the hashmap
        for (int i = 0; i < nums.length; i++) {
            int currentVal = nums[i];
            if (map.containsKey(target - currentVal)) {
                // Grab the cached value where it matched the key mentioned above
                int keyValue = map.get(target - currentVal);
                return new int[]{i, keyValue};
            } else {
                map.put(currentVal, i);
            }
        }
        return new int[]{0, 1};
    }
}
