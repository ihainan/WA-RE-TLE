package DynamicProgramming;

/**
 * https://leetcode.com/problems/house-robber-ii/ <br>
 * Should Be Better
 */
public class HouseRobberTwo {
    /* Runtime: 292 ms - 45% */
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        if (nums.length == 3) return Math.max(nums[0], Math.max(nums[1], nums[2]));
        int robMaxValueOne = nums[0] + nums[2], noRobMaxValueOne = nums[0];
        for (int i = 3; i < nums.length - 1; ++i) {
            int tmpNoRobMaxValue = Math.max(robMaxValueOne, noRobMaxValueOne);
            robMaxValueOne = noRobMaxValueOne + nums[i];
            noRobMaxValueOne = tmpNoRobMaxValue;
        }

        int robMaxValueTwo = nums[1], noRobMaxValueTwo = 0;
        for (int i = 2; i < nums.length - 1; ++i) {
            int tmpNoRobMaxValue = Math.max(robMaxValueTwo, noRobMaxValueTwo);
            robMaxValueTwo = noRobMaxValueTwo + nums[i];
            noRobMaxValueTwo = tmpNoRobMaxValue;
        }

        return findMax(new int[]{
                robMaxValueOne,
                noRobMaxValueOne,
                noRobMaxValueTwo + nums[nums.length - 1],
                noRobMaxValueTwo,
                robMaxValueTwo
        });
    }

    public int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; ++i) max = Math.max(max, nums[i]);
        return max;
    }
}
