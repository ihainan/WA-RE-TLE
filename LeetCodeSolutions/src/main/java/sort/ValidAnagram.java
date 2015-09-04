package sort;

import java.util.Arrays;

/**
 * https://leetcode.com/tag/sort/
 */
public class ValidAnagram {
    /* O(nlogn) - Runtime: 344 ms */
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        if (Arrays.equals(sChars, tChars)) return true;
        return false;
    }
}
