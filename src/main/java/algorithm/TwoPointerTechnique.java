package algorithm;


/** The Two Pointer Technique ideally runs in a linear environment. */
public class TwoPointerTechnique {
    /** Two Sum is a famous LeetCode question. This approach
     * returns the two indexes that match a target given
     * a sorted array.
     *
     * @param arr a sorted array of integers
     * @param target the integer target we are trying to find
     * @return an array of integers of the indexes that add up to the target */
    public int[] twoSum(final int[] arr, final int target) {
        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        while (leftPointer < rightPointer) {
            int curr = arr[leftPointer] + arr[rightPointer];
            if (curr < target) {
                leftPointer += 1;
            } else if (curr > target) {
                rightPointer -= 1;
            } else {
                return new int[]{leftPointer, rightPointer};
            }
        }
        return new int[]{-1, -1};
    }

    /** Squaring Values is a famous LeetCode question. This method
     * takes in an array of sorted elements and returns
     * a sorted array of the squared values of the original elements.
     * Solution:
     * RightPointer = 1st non-neg value
     * LeftPointer = Left of RightPointer
     * Constraints -231 <= x <= 231 - 1
     *
     * @param sortedArray a sorted array of integers
     * @return an array of sorted integers whose values are squared */
    public int[] squareEachValue(final int[] sortedArray) {

        int rightPointer = 0;

        while (rightPointer < sortedArray.length && sortedArray[rightPointer] < 0) {
            rightPointer += 1;
        }
        int leftPointer = rightPointer - 1;

        int[] sortedSquaredArray = new int[sortedArray.length];
        int currentIndexInArray = 0;

        while (leftPointer >= 0 && rightPointer < sortedArray.length) {
            int leftPointerValue = sortedArray[leftPointer] * sortedArray[leftPointer];
            int rightPointerValue = sortedArray[rightPointer] * sortedArray[rightPointer];

            if (leftPointerValue < rightPointerValue) {
                sortedSquaredArray[currentIndexInArray] = leftPointerValue;
                leftPointer--;
            } else {
                sortedSquaredArray[currentIndexInArray] = rightPointerValue;
                rightPointer++;
            }
            currentIndexInArray++;
        }
        while (leftPointer >= 0) {
            int leftPointerValue = sortedArray[leftPointer] * sortedArray[leftPointer];
            sortedSquaredArray[currentIndexInArray] = leftPointerValue;
            leftPointer--;
            currentIndexInArray++;
        }
        while (rightPointer < sortedArray.length) {
            int rightPointerValue = sortedArray[rightPointer] * sortedArray[rightPointer];
            sortedSquaredArray[currentIndexInArray] = rightPointerValue;
            rightPointer++;
            currentIndexInArray++;
        }
        return sortedSquaredArray;
    }
}