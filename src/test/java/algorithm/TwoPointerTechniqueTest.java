package algorithm;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoPointerTechniqueTest extends TestCase {

    TwoPointerTechnique twoPointerTechnique;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        twoPointerTechnique = new TwoPointerTechnique();
    }

    @Test
    public void twoSum() {
        int[] arrAddsUp = new int[]{2, 7, 11, 15};
        int addsUpTarget = 9;
        int[] expectedAddsUp = new int[]{0, 1};
        assertArrayEquals(expectedAddsUp, twoPointerTechnique.twoSum(arrAddsUp, addsUpTarget));
    }

    @Test
    public void twoSumImpossibleTarget() {
        int[] doesNotAddUpArr = new int[]{2, 7, 11, 15};
        int doesNotAddUpTarget = 40;
        int[] expectedDoesNotAddUpArr = new int[]{-1, -1};
        assertArrayEquals(expectedDoesNotAddUpArr, twoPointerTechnique.twoSum(doesNotAddUpArr, doesNotAddUpTarget));
    }

    @Test
    public void testSquareEachValue() {
        int[] sortedArray = new int[]{-4, -3, 1, 2, 3};
        int[] squaredSortedArray = new int[]{1, 4, 9, 9, 16};
        assertArrayEquals(squaredSortedArray, twoPointerTechnique.squareEachValue(sortedArray));
    }
}