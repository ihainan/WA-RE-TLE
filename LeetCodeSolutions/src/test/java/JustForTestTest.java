import org.junit.Test;

import static org.junit.Assert.*;

public class JustForTestTest {

    @Test
    public void testSwap() throws Exception {
        JustForTest justForTest = new JustForTest();
        assertEquals(justForTest.swap(2, 3), "3 2");
    }
}