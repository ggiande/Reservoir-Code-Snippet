package assessment;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1. Two Sum - Easy.
 *
 * @author giancarlogarciadeleon
 * <p> Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.</p>
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        int target = 12;
        System.out.println("Input: " + target + " Array: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(twoSum(nums, target)));
    }

    /**
     * Two Sum solution given an unordered array.
     *
     * @param numbers array of unordered integers
     * @param target  sum of two integers
     * @return an array of integers containing the indexes of the solution
     */
    public static int[] twoSum(final int[] numbers, final int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // map <currValue == difference, index>
        for (int i = 0; i < numbers.length; i++) {
            int currValue = numbers[i];
            int difference = target - currValue;

            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(currValue, i);
        }
        return null;
    }
}
