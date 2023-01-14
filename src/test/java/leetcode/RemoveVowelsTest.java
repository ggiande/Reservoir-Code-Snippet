package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveVowelsTest {

    @Test
    void removeVowelsFromString() {
        String string = "leetcodeisacommunityforcoders";
        String expectedString = "ltcdscmmntyfrcdrs";
        assertEquals(RemoveVowels.removeVowelsFromString(string), expectedString);
    }
}