import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void testSingleNumber() throws Exception {
        SingleNumber singleNumber = new SingleNumber();
        assertEquals(singleNumber.singleNumber(new int[]{1, 2, 3, 4, 3, 2, 1}), 4);
        assertEquals(singleNumber.singleNumber(new int[]{1, 4, 3, 4, 3, 2, 1}), 2);
        assertEquals(singleNumber.singleNumber(new int[]{1, 7, 4, 5, 5, 1, 7}), 4);
        assertEquals(singleNumber.singleNumber(new int[]{1}), 1);
    }
}