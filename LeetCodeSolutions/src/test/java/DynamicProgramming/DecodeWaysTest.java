package DynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeWaysTest {

    @Test
    public void testNumDecodings() throws Exception {
        DecodeWays decodeWays = new DecodeWays();
        assertEquals(1, decodeWays.numDecodings("110"));
        assertEquals(1, decodeWays.numDecodings("1010"));
        assertEquals(0, decodeWays.numDecodings("1001"));
        assertEquals(1, decodeWays.numDecodings("101"));
        assertEquals(0, decodeWays.numDecodings("01"));
        assertEquals(0, decodeWays.numDecodings("001"));
        assertEquals(0, decodeWays.numDecodings("100"));
        assertEquals(0, decodeWays.numDecodings("10001"));
        assertEquals(1, decodeWays.numDecodings("10"));
        assertEquals(2, decodeWays.numDecodings("129"));
        assertEquals(0, decodeWays.numDecodings(""));
        assertEquals(0, decodeWays.numDecodings("0"));
        assertEquals(1, decodeWays.numDecodings("2"));
        assertEquals(2, decodeWays.numDecodings("12"));
        assertEquals(3, decodeWays.numDecodings("124"));
    }
}