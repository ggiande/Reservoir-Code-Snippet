package assessment;


import java.util.Arrays;
import java.util.HashMap;

/**
 * twoSum
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3 };
        int target = 12;
        System.out.println("Input: " + target + " Array: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}