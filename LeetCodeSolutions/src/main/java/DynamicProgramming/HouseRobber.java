package DynamicProgramming;

/**
 * https://leetcode.com/problems/house-robber/
 */
public class HouseRobber {
    /* Runtime: 300 ms - 30% */
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int[] robValue = new int[nums.length], noRobValue = new int[nums.length];
        robValue[0] = nums[0];
        noRobValue[0] = 0;
        for (int i = 1; i < nums.length; ++i) {
            robValue[i] = noRobValue[i - 1] + nums[i];
            noRobValue[i] = Math.max(noRobValue[i - 1], robValue[i - 1]);
        }
        return Math.max(robValue[nums.length - 1], noRobValue[nums.length - 1]);
    }
}
