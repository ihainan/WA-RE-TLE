package sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/largest-number/
 */
public class LargestNumber {
    private static class SpecificComparator implements Comparator<String> {

        @Override
        public int compare(String str1, String str2) {
            return -(str1 + str2).compareTo(str2 + str2);
        }
    }

    /* O(n ^ 2) - Runtime: 344 ms - 52% */
    public String largestNumber(int[] nums) {
        new SpecificComparator().compare("8247", "824");
        String finalResult = "";
        if (nums.length == 0) return finalResult;
        String numsStr[] = new String[nums.length];
        int maxLen = -1;
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
            if (numsStr[i].length() > maxLen) maxLen = numsStr[i].length();
        }
        Arrays.sort(numsStr, new SpecificComparator());
        for (String str : numsStr) finalResult += str;
        return finalResult.replaceAll("^0+(?!$)", "");
    }
}
