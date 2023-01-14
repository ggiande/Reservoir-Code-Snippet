package leetcode;

public class EasyPalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        int input = x;
        if (x < 0) {
            return false;
        }
        int reversedNum = 0;
        // Reverse the number -- % 10 grabs the last digit, / 10 removes the last digit
        while (x != 0) {
            int temp = x % 10;
            x /= 10;
            reversedNum = reversedNum * 10 + temp;
        }
        // Compare the reversed number with the original number
        if (reversedNum == input) {
            return true;
        }
        return false;
    }
}
