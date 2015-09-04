package String;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {

    @Test
    public void testLengthOfLastWord() throws Exception {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        assertEquals(0, lengthOfLastWord.lengthOfLastWord(""));
        assertEquals(0, lengthOfLastWord.lengthOfLastWord(" "));
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello"));
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
    }
}