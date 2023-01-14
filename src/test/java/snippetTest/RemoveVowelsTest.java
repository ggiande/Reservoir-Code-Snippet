package snippetTest;
import org.junit.jupiter.api.Test;
import leetcode.RemoveVowels;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RemoveVowelsTest {
    @Test
    public void ensureRemoveVowels() {
        assertEquals(RemoveVowels.removeVowelsFromString("leetcodeisacommunityforcoders"), "ltcdscmmntfrcdrs");
    }
}
