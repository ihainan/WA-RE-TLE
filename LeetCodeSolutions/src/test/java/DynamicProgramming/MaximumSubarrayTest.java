package DynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {

    @Test
    public void testCalcSum() throws Exception {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        assertEquals(6, maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, maximumSubarray.maxSubArray(new int[]{1}));
        assertEquals(2, maximumSubarray.maxSubArray(new int[]{2, -1}));
    }
}