package DynamicProgramming;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sums[] = new int[nums.length], max = nums[0];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; ++i) sums[i] = nums[i] + sums[i - 1];
        return 0;
    }

    /* TLE */
    public int maxSubArraySolutionOne(int[] nums) {
        int sums[] = new int[nums.length], max = nums[0];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; ++i) sums[i] = nums[i] + sums[i - 1];
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i; j < nums.length - 1; ++j) {
                int sum = sums[j] - sums[i] + nums[i];
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}
