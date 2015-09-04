package sort;

/**
 * https://leetcode.com/problems/maximum-gap/
 */
public class MaximumGap {
    /* O(n) - O(n) - Runtime: 308 ms - 99.48% */
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;
        int maxGap = 0, lastMax = -1;
        Bucket[] buckets = bucketSort(nums);
        if (buckets == null) return 0;
        for (int i = 0; i < buckets.length; ++i) {
            if (buckets[i] != null) {
                if (lastMax != -1) maxGap = Math.max(maxGap, buckets[i].min - lastMax);
                lastMax = buckets[i].max;
            }
        }
        return maxGap;
    }

    /**
     * Bucket
     */
    private class Bucket {
        public int max = Integer.MIN_VALUE;
        public int min = Integer.MAX_VALUE;

        public void add(int num) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
    }

    public Bucket[] bucketSort(int nums[]) {
        // find the max and min value in the array
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            min = nums[i] < min ? nums[i] : min;
            max = nums[i] > max ? nums[i] : max;
        }
        if (max == min) return null;
        int maxGap = (int) Math.ceil((max - min) * 1.0 / (nums.length - 1));
        int bucketsNum = (max - min) / maxGap + 1;
        Bucket buckets[] = new Bucket[bucketsNum];
        for (int i = 0; i < nums.length; ++i) {
            int index = (nums[i] - min) / maxGap;
            if (buckets[index] == null) buckets[index] = new Bucket();
            buckets[index].add(nums[i]);
        }
        return buckets;
    }
}