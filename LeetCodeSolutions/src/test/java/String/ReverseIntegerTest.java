package String;

import math.ReverseInteger;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

    @Test
    public void testReverse() throws Exception {
        ReverseInteger reverseInteger = new ReverseInteger();
        assertEquals(0, reverseInteger.reverse(0));
        assertEquals(0, reverseInteger.reverse(1534236469));
        assertEquals(0, reverseInteger.reverse(-0));
        assertEquals(-1, reverseInteger.reverse(-10));
        assertEquals(1, reverseInteger.reverse(10));
        assertEquals(101, reverseInteger.reverse(101));
        assertEquals(-11, reverseInteger.reverse(-11));
    }
}