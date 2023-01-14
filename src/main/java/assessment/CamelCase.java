package assessment;

/**
 * Camel Case Class of Exercises.
 */
public class CamelCase {

    /**
     * Determines the number of words under the CamelCase Syntax.
     *
     * @param word word to check for CamelCase terms
     * @return int returns the number of camel case terms in the word.
     */
    public int termsOfCamelCase(String word) throws IllegalArgumentException {

        if (word.length() <= 0) {
            throw new IllegalArgumentException();
        }

        int term = 1;

        for (int i = 0; i < word.length(); i++) {
            String letter = Character.toString(word.charAt(i));

            if (letter.equals(letter.toUpperCase())) {
                term++;
            }
        }
        return term;
    }
}
