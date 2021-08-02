package snippet;
import java.util.Arrays;
import java.util.HashSet;
/* 1119. Remove Vowels from a String */

public class RemoveVowels {
    public static String removeVowelsFromString(String targetString) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
        for (int i = 0; i < targetString.length(); i++) {
            if (!set.contains(targetString.charAt(i))) sb.append(targetString.charAt(i));
        }
        return sb.toString();
    }
}