package assessment;

import java.util.Arrays;
import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 2, 1 };
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int num = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        System.out.println(set);
        return num;

    }
}