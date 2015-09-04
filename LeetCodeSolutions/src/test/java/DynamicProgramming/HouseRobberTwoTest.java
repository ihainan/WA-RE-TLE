package DynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberTwoTest {

    @Test
    public void testRob() throws Exception {
        HouseRobberTwo houseRobberTwo = new HouseRobberTwo();
        assertEquals(14, houseRobberTwo.rob(new int[]{2, 7, 7, 7, 4}));
        assertEquals(10, houseRobberTwo.rob(new int[]{1, 7, 9, 2}));
        assertEquals(5, houseRobberTwo.rob(new int[]{5}));
        assertEquals(1, houseRobberTwo.rob(new int[]{1, 1, 1}));
        assertEquals(0, houseRobberTwo.rob(new int[]{}));
        assertEquals(8, houseRobberTwo.rob(new int[]{8, 5}));
        assertEquals(11, houseRobberTwo.rob(new int[]{5, 4, 3, 7}));
    }
}