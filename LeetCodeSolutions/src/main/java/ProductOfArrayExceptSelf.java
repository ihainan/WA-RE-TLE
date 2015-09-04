import java.util.HashMap;

/**
 * https://leetcode.com/problems/product-of-array-except-self/ <br>
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 */
public class ProductOfArrayExceptSelf {
    HashMap<Integer, Integer> leftProductValue = new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> rightProductValue = new HashMap<Integer, Integer>();

    public int[] productExceptSelf(int[] nums) {
        int outputs[] = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            int leftValue = 1, rightValue = 1;
            int pos = i - 1;
            while (true) {
                if (pos < 0) break;
                if (leftProductValue.containsKey(pos)) {
                    leftValue = leftProductValue.get(pos);
                    break;
                }
                leftValue *= nums[pos];
                pos--;
            }
            pos = i + 1;
            while (true) {
                if (pos >= nums.length) break;
                if (rightProductValue.containsKey(pos)) {
                    rightValue = rightProductValue.get(pos);
                    break;
                }
                rightValue *= nums[pos];
                pos++;
            }
            outputs[i] = leftValue * rightValue;
        }
        return outputs;
    }

    public int getLeftValue(int nums[], int pos) {
        if (pos < 0) return 1;
        if (leftProductValue.containsKey(pos)) return leftProductValue.get(pos);
        else {
            leftProductValue.put(pos, getLeftValue(nums, pos - 1) * nums[pos]);
            return leftProductValue.get(pos);
        }
    }

    public int getRightValue(int nums[], int pos) {
        if (pos >= nums.length) return 1;
        if (rightProductValue.containsKey(pos)) return rightProductValue.get(pos);
        else {
            rightProductValue.put(pos, getRightValue(nums, pos + 1) * nums[pos]);
            return rightProductValue.get(pos);
        }
    }
}
