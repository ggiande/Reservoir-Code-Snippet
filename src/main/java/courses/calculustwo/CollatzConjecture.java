package courses.calculustwo;

/**
 * CollatzConjecture can determine whether the unproven
 * guess can be ar educated guess or more.
 *
 * @author Giancarlo Garcia Deleon
 */
public class CollatzConjecture {

    public static final float FIRST_RATIO = 7 / 4f;
    public static final float SECOND_RATIO = 1 / 2f;
    public static final float THIRD_RATIO = 5 / 4f;

    /**
     * Checks that a given term leads to a conjecture, can be considered
     * to be a helper method by another algorithm.
     *
     * @param initialTerm a positive number to feed the conjecture
     * @return a boolean on whether we can find a conjecture
     */
    public static boolean checkForConjectureLeadingToOne(final float initialTerm) {

        float prevSequence = initialTerm;
        float newSequence;

        while (true) {
            newSequence = (float) ((FIRST_RATIO) * prevSequence + (SECOND_RATIO) - ((THIRD_RATIO)
                    * prevSequence + (SECOND_RATIO)) * (Math.pow(-1f, prevSequence)));
            if (newSequence == 1f) {
                return true;
            } else {
                prevSequence = newSequence;
            }
        }
    }
}