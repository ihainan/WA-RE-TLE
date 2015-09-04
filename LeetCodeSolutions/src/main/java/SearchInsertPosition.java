/**
 * https://leetcode.com/problems/search-insert-position/ <br>
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(target < nums[0]) return 0;
        if(target > nums[nums.length - 1]) return nums.length;
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    private int binarySearch(int nums[], int left, int right, int key) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == key) return mid;
            else if (nums[mid] > key) return binarySearch(nums, left, mid - 1, key);
            else return binarySearch(nums, mid + 1, right, key);
        }
        return right + 1;
    }
}
