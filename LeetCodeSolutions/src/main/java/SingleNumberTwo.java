import java.util.HashMap;

/**
 * https://leetcode.com/problems/single-number-ii/ <br>
 * Given an array of integers, every element appears three times except for one. Find that single one.
 */
public class SingleNumberTwo {
    public int singleNumber(int[] nums) {
        
        return -1;
    }

    public int singleNumberOne(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            Integer value = hashMap.get(nums[i]);
            hashMap.put(nums[i], value == null ? 1 : value + 1);
        }
        for (Integer key : hashMap.keySet()) {
            if (hashMap.get(key) == 1 || hashMap.get(key) == 2) return key;
        }
        return -1;
    }
}
