package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumGapTest {

    @Test
    public void testMaximumGap() throws Exception {
        MaximumGap maximumGap = new MaximumGap();
        assertEquals(0, maximumGap.maximumGap(new int[]{9}));
        assertEquals(0, maximumGap.maximumGap(new int[]{0}));
        assertEquals(0, maximumGap.maximumGap(new int[]{10, 10}));
        assertEquals(1, maximumGap.maximumGap(new int[]{11, 10}));
        assertEquals(4, maximumGap.maximumGap(new int[]{9, 7, 3, 10}));
        assertEquals(91, maximumGap.maximumGap(new int[]{9, 7, 3, 100}));
        assertEquals(99999997, maximumGap.maximumGap(new int[]{2, 99999999}));
    }

    @Test
    public void testBucketSort() throws Exception {
        MaximumGap maximumGap = new MaximumGap();
    }
}