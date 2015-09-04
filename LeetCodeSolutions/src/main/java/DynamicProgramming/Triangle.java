package DynamicProgramming;

import java.util.List;

/**
 * https://leetcode.com/problems/triangle/
 */
public class Triangle {
    /* Runtime: 236 ms - 98% */
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 0) return 0;
        int minValues[] = new int[triangle.size()];
        for (List<Integer> nums : triangle) {
            for (int j = nums.size() - 1; j >= 0; --j) {
                int num = nums.get(j);
                if (j == 0) minValues[j] = minValues[j] + num;
                else if (j == nums.size() - 1) minValues[j] = minValues[j - 1] + num;
                else minValues[j] = num + Math.min(minValues[j], minValues[j - 1]);
            }
        }
        int minValue = minValues[0];
        for (int value : minValues) minValue = Math.min(minValue, value);
        return minValue;
    }
}
