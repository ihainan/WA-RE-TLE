package DynamicProgramming;

/**
 * https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {
    /* Runtime: 196 ms - 90% */
    public int climbStairs(int n) {
        int ways[] = new int[n + 1];
        for (int i = 0; i <= n; ++i) {
            if (i <= 1) ways[i] = 1;
            else ways[i] = ways[i - 1] + ways[i - 2];
        }
        return ways[n];
    }
}
