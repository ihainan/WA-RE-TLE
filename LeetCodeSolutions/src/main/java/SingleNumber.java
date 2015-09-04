/**
 * https://leetcode.com/problems/single-number/ <br>
 * Given an array of integers, every element appears twice except for one. Find that single one. <br>
 *
 */
public class SingleNumber {
    // Solution1 : 直接异或
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; ++i)
            result = result ^ nums[i];
        return result;
    }
}
