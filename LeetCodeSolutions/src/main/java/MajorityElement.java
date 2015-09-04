import java.util.HashMap;

/**
 * https://leetcode.com/problems/majority-element/ <br>
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times. <br>
 * You may assume that the array is non-empty and the majority element always exist in the array. <br>
 * <ul>
 * <li>Solution 1: QSort + Traverse - O(nlogn) + O(n) / O(n ^ 2) - Time Limit Exceeded</li>
 * <li>Solution 2: HashMap - O(n)  - 496 ms - 14.33</li>
 * <li>Solution 3: QSearch - O(n) / O(n ^ 2)- Time Limit Exceeded</li>
 * <li>Solution 4: Binary Majority Element - O(nlogn) - 408 ms</li>
 * <li>Solution 5: Moore Voting - O(n) - 480 ms</li>
 * </ul>
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int counter = 0, candidate = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (counter == 0) {
                counter = 1;
                candidate = nums[i];
            } else {
                if (nums[i] == candidate) counter++;
                else counter--;
            }
        }
        return candidate;
    }

    public int majorityElementSolution4(int[] nums) {
        int num = findMajority(nums, 0, nums.length - 1);
        return num;
    }

    public int findMajority(int[] nums, int left, int right) {
        if (right - left <= 1) return nums[left];
        int mid = left + (right - left) / 2;
        int leftMajority = findMajority(nums, left, mid);
        int rightMajority = findMajority(nums, mid + 1, right);
        if (leftMajority != rightMajority) {
            int sumLeft = 0, sumRight = 0;
            for (int i = left; i <= right; ++i) {
                if (nums[i] == leftMajority) sumLeft++;
                if (nums[i] == rightMajority) sumRight++;
            }
            return sumLeft > sumRight ? leftMajority : rightMajority;
        }
        return leftMajority;
    }

    public int majorityElementSolution3(int[] nums) {
        int num = qSearch(nums, 0, nums.length - 1, nums.length / 2);
        return num;
    }

    public int majorityElementSolution2(int[] nums) {
        int num = nums[0];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            Integer value = hashMap.get(nums[i]);
            hashMap.put(nums[i], value == null ? 1 : value + 1);
            if (hashMap.get(nums[i]) > nums.length / 2) return nums[i];
        }
        return num;
    }

    public int majorityElementSolution1(int[] nums) {
        int num = nums[0];
        qSort(nums, 0, nums.length - 1);
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i == 0 || nums[i] != nums[i - 1]) sum = 1;
            else sum++;
            if (sum > nums.length / 2) {
                num = nums[i];
                break;
            }
        }
        return num;
    }

    public void swap(int nums[], int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    // Quick Sort
    public void qSort(int nums[], int left, int right) {
        if (left < right) {
            int index = left + new java.util.Random().nextInt(right - left + 1);
            int key = nums[index];
            swap(nums, index, right);
            for (int i = index = left; i < right; ++i) {
                if (nums[i] <= key) {
                    swap(nums, index++, i);
                }
            }
            swap(nums, index, right);
            qSort(nums, left, index - 1);
            qSort(nums, index + 1, right);
        }
    }

    // Quick Search
    public int qSearch(int nums[], int left, int right, int sIndex) {
        if (left < right) {
            int index = left + new java.util.Random().nextInt(right - left + 1);
            int key = nums[index];
            swap(nums, index, right);
            for (int i = index = left; i < right; ++i) {
                if (nums[i] <= key) {
                    swap(nums, index++, i);
                }
            }
            swap(nums, index, right);
            if (index == sIndex) return nums[index];
            else if (index > sIndex) return qSearch(nums, left, index - 1, sIndex);
            else return qSearch(nums, index + 1, right, sIndex);
        }
        return -1;
    }
}
