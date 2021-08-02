package assessment;

import java.util.*;

public class LongestPalindrome {

    /*
     * Longest Palindrome ------------------ Given a string find the length of the
     * longest palindrome that can be built with those letters.
     * 
     * Example: Input: 'abccccdd' Output: 7 Explanation: One palindrome that can be
     * built is "dccaccd", which has a length of 7.
     * 
     */

    public static void main(String[] args) {
        String s = "abbbcdebbaa";
        longestPalindrome(s);
    }

    public static int longestPalindrome(String s) {

        // Edge Cases
        // If string has capitals
        String s2 = s.toLowerCase();
        System.out.println(s2.toLowerCase());

        // Create a HashMap object called capitalCities
        HashSet<Character> mapping = new HashSet<Character>();
        // Local Counter
        int Counter = 0;

        // Iterate through string parsing each character
        for (int i = 0; i < s2.length(); i++) {
            Character c = s2.charAt(i);
            if (mapping.contains(c)) {
                Counter++;
                mapping.remove(c);
            } else {
                mapping.add(c);
            }
        }

        // Sets
        Counter *= 2;

        if (mapping.size() >= 1) {
            Counter++;
        }

        System.out.println(Counter);
        return Counter;
    }

}