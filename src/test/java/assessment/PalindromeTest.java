package assessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    @Test
    public void isPalindromeTrue() {
        String word = "racecar";
        assertTrue(Palindrome.isPalindrome(word));
    }

    @Test
    public void isPalindromeFalse() {
        String word = "raceca";
        assertFalse(Palindrome.isPalindrome(word));
    }
}
