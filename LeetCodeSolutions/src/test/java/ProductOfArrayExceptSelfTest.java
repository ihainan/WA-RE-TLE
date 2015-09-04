import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ProductOfArrayExceptSelfTest {

    @Test
    public void testProductExceptSelf() throws Exception {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        // assertTrue(Arrays.equals(new int[]{24, 12, 8, 6}, productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4})));
        assertTrue(Arrays.equals(new int[]{120, 60, 40, 30, 24}, productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4, 5})));
    }
}