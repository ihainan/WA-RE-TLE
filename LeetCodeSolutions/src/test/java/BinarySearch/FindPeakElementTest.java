package BinarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindPeakElementTest {

    @Test
    public void testFindPeakElement() throws Exception {
        FindPeakElement findPeakElement = new FindPeakElement();
        assertEquals(0, findPeakElement.findPeakElement(new int[]{1}));
        assertEquals(0, findPeakElement.findPeakElement(new int[]{-2147483648}));

        assertEquals(2, findPeakElement.findPeakElement(new int[]{1, 2, 3, 1}));
        assertEquals(1, findPeakElement.findPeakElement(new int[]{1, 4, 3, 1}));
    }
}