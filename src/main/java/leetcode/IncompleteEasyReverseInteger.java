package leetcode;

public class IncompleteEasyReverseInteger {
    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        boolean negativeInt = false;
        if (x < 0) {
            // negative, use abs, but check a boolean
            negativeInt = true;
            x = Math.abs(x);
        }

        int reversedNum = 0;
        // Reverse the number -- % 10 grabs the last digit, / 10 removes the last digit
        while (x != 0) {
            int temp = x % 10;
            x /= 10;
            reversedNum = reversedNum * 10 + temp;
        }
        if (negativeInt) return reversedNum * -1;
        return reversedNum;
    }
}
