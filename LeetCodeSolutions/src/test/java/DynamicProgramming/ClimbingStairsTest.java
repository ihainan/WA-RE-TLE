package DynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {

    @Test
    public void testClimbStairs() throws Exception {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(1, climbingStairs.climbStairs(1));
        assertEquals(2, climbingStairs.climbStairs(2));
        assertEquals(1, climbingStairs.climbStairs(0));
        assertEquals(5, climbingStairs.climbStairs(4));
    }
}