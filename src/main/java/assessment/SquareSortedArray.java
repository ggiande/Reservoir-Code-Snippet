package assessment;

import java.util.Arrays;

public class SquareSortedArray {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(sortedArray(A)));

    }

    private static int[] sortedArray(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = (A[i] * A[i]);
        }
        // Returen array has to be sorted in a non-increasing order
        return B;

    }
}