package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestNumberTest {

    @Test
    public void testLargestNumber() throws Exception {
        LargestNumber largestNumber = new LargestNumber();
        assertEquals("9534330", largestNumber.largestNumber(new int[]{3, 30, 34, 5, 9}));
        assertEquals("32011110", largestNumber.largestNumber(new int[]{1, 10, 20, 11, 3}));
        assertEquals("311", largestNumber.largestNumber(new int[]{3, 11}));
        assertEquals("12121", largestNumber.largestNumber(new int[]{121, 12}));
        assertEquals("0", largestNumber.largestNumber(new int[]{0, 0}));
        assertEquals("9609938824824769735703560743981399", largestNumber.largestNumber(new int[]{824,938,1399,5607,6973,5703,9609,4398,8247}));

    }
}