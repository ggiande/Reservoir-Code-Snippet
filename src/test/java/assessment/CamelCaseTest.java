package assessment;

import junit.framework.TestCase;

public class CamelCaseTest extends TestCase {
    CamelCase camelCase;

    public void setUp() throws Exception {
        camelCase = new CamelCase();
    }

    public void testTermsOfCamelCase() {
        String word = "eatTheApplesPlease";
        int expectedTerms = 4;
        assertEquals(expectedTerms, camelCase.termsOfCamelCase(word));
    }
}
