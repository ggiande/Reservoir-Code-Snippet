package assessment;

/**
 * 9. Palindrome Number.
 *
 * @author giancarlogarciadeleon
 * The Palindrome Number determines if a provided number
 * is a palindrome. Definition of Palindrome: a word,
 * phrase, or sequence that reads the same backward as forward.
 */
public class PalindromeNumber {

    /**
     * Method determines if a given integer is a palindrome
     * and if so, returns a boolean indicating. Edge cases:
     * negatives cannot be palindromes, and numbers that include
     * zeros need to be addressed.
     *
     * @param x the integer to be checked
     * @return a boolean stating whether the integer is a palindrome
     * @Constraints -231 <= x <= 231 - 1
     */
    public boolean isPalindrome(final int x) {
        if (x < 0) return false;
        int reversedInteger = 0;
        int originalInteger = x;
        // reverse an integer
        while (originalInteger != 0) {
            int temp = originalInteger % 10;
            originalInteger /= 10;
            reversedInteger = reversedInteger * 10 + temp;
        }
        if (reversedInteger == x) return true;
        return false;
    }
}
