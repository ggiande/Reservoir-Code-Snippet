package assessment;

import junit.framework.TestCase;

public class PalindromeNumberTest extends TestCase {

    PalindromeNumber palindromeNumber = new PalindromeNumber();

    public void testIsPalindromeTrueOne() {
        int x = 121;
        assertTrue(palindromeNumber.isPalindrome(x));
    }

    public void testIsPalindromeTrueTwo() {
        int x = 101;
        assertTrue(palindromeNumber.isPalindrome(x));
    }

    public void testIsPalindromeFalse() {
        int x = 123;
        assertFalse(palindromeNumber.isPalindrome(x));
    }

    public void testIsPalindromeFalseNegative() {
        int x = -121;
        assertFalse(palindromeNumber.isPalindrome(x));
    }
}