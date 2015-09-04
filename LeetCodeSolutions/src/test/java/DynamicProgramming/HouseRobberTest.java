package DynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberTest {

    @Test
    public void testRob() throws Exception {
        HouseRobber houseRobber = new HouseRobber();
        assertEquals(5, houseRobber.rob(new int[]{5}));
        assertEquals(0, houseRobber.rob(new int[]{}));
        assertEquals(12, houseRobber.rob(new int[]{5, 4, 3, 7}));
    }
}