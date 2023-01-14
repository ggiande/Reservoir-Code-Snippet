package courses.calculustwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CollatzConjectureTest {

    @Test
    public void testCheckForConjectureLeadingToOne() {
        float initialSequenceTermOne = 1f;
        float initialSequenceTermTwo = 2f;
        float initialSequenceTermThree = 3f;
        float initialSequenceTermFour = 4f;

        assertTrue(CollatzConjecture.checkForConjectureLeadingToOne(initialSequenceTermOne));
        assertTrue(CollatzConjecture.checkForConjectureLeadingToOne(initialSequenceTermTwo));
        assertTrue(CollatzConjecture.checkForConjectureLeadingToOne(initialSequenceTermThree));
        assertTrue(CollatzConjecture.checkForConjectureLeadingToOne(initialSequenceTermFour));
    }
}
