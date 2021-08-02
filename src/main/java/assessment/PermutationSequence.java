package assessment;

import java.util.ArrayList;

// Incomplete
public class PermutationSequence {
    public static void main(String[] args) {
        int n = 3;
        int k = 3;
        System.out.println("Input: " + "n = " + n + ", k = " + k);
        System.out.println("Output: " + getPermutation(n, k));
    }

    public static String getPermutation(int n, int k) {
        // n is the number of elements
        // k is the index of the sequence of permutations
        // n = 3, k = 3
        // [[_, _, _], [_, _, _]]
        // 0 - n, index != 0
        ArrayList<ArrayList> array = new ArrayList<>();

        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i <= k; i++) {
            int temp = i;
            // a b c a++ < k b++ < k c++ <k, there can be no duplicates at any time.
            // A Hash set ?
            // a < k
            // a < k
            // // save current abc
            // array.add(temp);

        }
        // Print out the kth elemment
        for (int i = 0; i < k; i++) {

        }

        // I need to returnt the kth permutation
        return null;

    }
}