package assessment;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest extends TestCase {

    TwoSum twoSum = new TwoSum();

    public void testTwoSumSuccessOne() {
        int[] numbers = new int[]{2, 7, 11, 15};
        int[] expected = new int[]{0, 1};
        int target = 9;
        assertArrayEquals(expected, twoSum.twoSum(numbers, target));
    }

    public void testTwoSumSuccessTwo() {
        int[] numbers = new int[]{3, 2, 4};
        int[] expected = new int[]{1, 2};
        int target = 6;
        assertArrayEquals(expected, twoSum.twoSum(numbers, target));
    }

    public void testTwoSumSuccessThree() {
        int[] numbers = new int[]{3, 3};
        int[] expected = new int[]{0, 1};
        int target = 6;
        assertArrayEquals(expected, twoSum.twoSum(numbers, target));
    }
}