package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {

    @Test
    public void testIsAnagram() throws Exception {
        ValidAnagram validAnagram = new ValidAnagram();
        assertEquals(true, validAnagram.isAnagram("anagram", "nagaram"));
        assertEquals(false, validAnagram.isAnagram("rat", "car"));
        assertEquals(false, validAnagram.isAnagram("rat", null));
        assertEquals(true, validAnagram.isAnagram("aabbcc", "abcabc"));
    }
}