package String;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
    /* Runtime: 272 ms - 62.81% */
    public int lengthOfLastWord(String s) {
        String[] splits = s.split(" ");
        return splits == null || splits.length == 0 ? 0 : splits[splits.length - 1].length();
    }
}
