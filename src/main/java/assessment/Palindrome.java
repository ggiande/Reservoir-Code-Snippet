package assessment;

/**
 * Palindrome class that checks for palindromes.
 */
public class Palindrome {

    /**
     * Returns if provided word is a Palindrome.
     *
     * @param word Given String to check if it's a palindrome
     * @return Returns a boolean if the word is a palindrome
     */
    public static boolean isPalindrome(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char currChar = word.charAt(i);
            reversedWord += currChar;
        }
        return reversedWord.equals(word);
    }
}
