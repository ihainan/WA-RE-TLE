import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MajorityElementTest {

    @Test
    public void testMajorityElement() throws Exception {
        MajorityElement majorityElement = new MajorityElement();
        int nums[] = {3, 1, 2, 3, 4, 3, 3, 3};
        assertEquals(3, majorityElement.majorityElement(nums));
        int nums2[] = {1, 5, 3, 6, 6, 6, 6, 1, 1, 1, 1, 1, 1};
        assertEquals(1, majorityElement.majorityElement(nums2));
    }
}