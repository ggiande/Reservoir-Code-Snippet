package snippet;

import java.util.ArrayList;
import java.util.Arrays;

/* 	Author: Giancarlo Garcia Deleon
 * 	Date: 11/13/2019
 * Tests whether character arrays can form given strings.
 */

public class StringPossibility {
    public static void main(String[] args) {
        String targetWord = "Hello World!";
        StringBuilder sb = new StringBuilder();

        ArrayList<Character> wordsList =
                new ArrayList<>(Arrays.asList('w', 'o', 'r', 'd', 's', 'f', 'c', 'l'));

        validateStringPossibility(targetWord, sb, wordsList);
    }

    private static void validateStringPossibility(String targetWord, StringBuilder sb, ArrayList<Character> list) {
        /* Checks if string is empty */
        if (targetWord.length() == 0) {
            System.out.println("Provided any empty target word");
            return;
        }

        for (int i = 0; i < targetWord.length(); i++) {
            if (list.contains(targetWord.charAt(i))) {
                sb.append(targetWord.charAt(i));
            }
        }

        /* Checks to see if original string matches the string that can be constructed given the characters. */
        if (sb.toString().equals(targetWord)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        System.out.println("S: " + targetWord + " : " + sb);
    }
}
