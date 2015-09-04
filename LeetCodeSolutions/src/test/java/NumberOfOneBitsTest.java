import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfOneBitsTest {

    @Test
    public void testHammingWeight() throws Exception {
        NumberOfOneBits numberOfOneBits = new NumberOfOneBits();
        assertEquals(numberOfOneBits.hammingWeight(Integer.parseInt("00000000000000000000000000001011", 2)), 3);
        assertEquals(numberOfOneBits.hammingWeight(Integer.parseInt("00000000000000000000000000000000", 2)), 0);
        assertEquals(numberOfOneBits.hammingWeight(Integer.parseInt("00000000000000000000000000000001", 2)), 1);
        assertEquals(numberOfOneBits.hammingWeight(Integer.parseInt("01000000000000000000000000000000", 2)), 1);
    }
}