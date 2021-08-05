package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/*
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]*/
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
        for (int i = 0; i < nums.length; i++ ){
            int currentVal = nums[i];
            if (map.containsKey(target - currentVal)){
                // Grab the cached value where it matched the key mentioned above
                int keyValue = map.get(target-currentVal);
                return new int[]{i, keyValue};
            } else {
                map.put(currentVal, i);
            }
        }
        return new int[]{0, 1};
    }
}
