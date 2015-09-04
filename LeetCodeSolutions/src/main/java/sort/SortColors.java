package sort;

import java.util.Random;

/**
 * https://leetcode.com/problems/sort-colors/
 */
public class SortColors {
    public void swap(int nums[], int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    /* Quick Sort */
    public void qSort(int nums[], int left, int right) {
        if (left < right) {
            int index = left + new Random().nextInt(right - left + 1);
            int key = nums[index];
            swap(nums, index, right);
            for (int i = index = left; i < right; i++) {
                if (nums[i] < key) {
                    swap(nums, index++, i);
                }
            }
            swap(nums, index, right);
            qSort(nums, left, index - 1);
            qSort(nums, index + 1, right);
        }
    }

    /* O(nlogn) - Runtime: 312 ms - 24.69% */
    public void sortColors(int[] nums) {
        qSort(nums, 0, nums.length - 1);
    }

    /* O(n) - Runtime: 276 ms - 77.2% */
    public void sortColorsSolutionOne(int[] nums) {
        int colors[] = new int[3];
        for (int i = 0; i < nums.length; ++i) {
            colors[nums[i]]++;
        }

        for (int i = 0; i < nums.length; ++i) {
            if (colors[0] != 0) {
                nums[i] = 0;
                colors[0]--;
            } else if (colors[1] != 0) {
                nums[i] = 1;
                colors[1]--;
            } else {
                nums[i] = 2;
            }
        }
    }
}
