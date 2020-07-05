
/**  1470. Shuffle the Array
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7] 
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 * Author: Giancarlo Garcia
 * Date: 6/14/2020
 * TC O(N) SC O(N)
*/

import java.util.Arrays;

public class shuffle_the_Array_copy {

    public static void main(String[] args) {
        int n = 3;
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        System.out.println("New nums: " + Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        // init a new int [] that we will return
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < n; i++) { // Goes half way
            nums2[2 * i] = nums[i]; // Even - nums2[2 * (0-3)] = nums[i]
            nums2[2 * i + 1] = nums[n + i]; // Odd - nums2[2 * (0-3) + 1] = nums[3 * i]
        }

        return nums2;
    }
}