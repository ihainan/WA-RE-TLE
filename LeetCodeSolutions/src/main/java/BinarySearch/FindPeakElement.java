package BinarySearch;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/find-peak-element/
 */
public class FindPeakElement {
    /* Runtime: 260 ms - 48% */
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[mid + 1]) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    /* Runtime: 236 ms - 83% */
    public int findPeakElementSolutionOne(int[] nums) {
        ArrayList<Long> numList = new ArrayList<Long>();
        numList.add(Long.MIN_VALUE);
        for (int num : nums) numList.add((long) num);
        numList.add(Long.MIN_VALUE);
        for (int i = 1; i < numList.size() - 1; ++i) {
            if (numList.get(i) > numList.get(i - 1) && numList.get(i) > numList.get(i + 1))
                return i - 1;
        }
        return -1;
    }
}
