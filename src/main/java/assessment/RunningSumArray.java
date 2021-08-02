package assessment;
// Incomplete
/* 5453. Running Sum of 1d Array
 * Input: nums = [1,2,3,4] Output: [1,3,6,10] Explanation: Running sum is
 * obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * Author: Giancarlo Garcia
 * Date: 6/14/2020
 * TC O(N) SC O(N)
 */
import java.util.Arrays;

public class RunningSumArray {
    private static int[] runningSum(int[] nums) {
        int[] newnums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            newnums[i] = (sum += nums[i]);
        }
        return newnums;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4 };
        int[] newnums;
        newnums = runningSum(nums);
        System.out.println("After Method: " + Arrays.toString(newnums));
    }
}