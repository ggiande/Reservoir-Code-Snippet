import java.util.Arrays;

// 66. Plus One
public class plusOneSixtySix {
    public static void main(String[] args) {
        int[] digits = new int[] { 2, 4, 9, 3, 9 };
        System.out.println("Input: " + Arrays.toString(digits));
        System.out.println("Output: " + Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] newNumber = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        newNumber[0] = 1;
        return newNumber;
    }
}