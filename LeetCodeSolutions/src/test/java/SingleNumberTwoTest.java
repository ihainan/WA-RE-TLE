import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTwoTest {

    @Test
    public void testSingleNumber() throws Exception {
        SingleNumberTwo singleNumberTwo = new SingleNumberTwo();
        assertEquals(3, singleNumberTwo.singleNumber(new int[]{1, 2, 3, 2, 1, 1, 2}));
    }
}