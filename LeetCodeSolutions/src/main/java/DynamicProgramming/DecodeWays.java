package DynamicProgramming;

/**
 * https://leetcode.com/problems/decode-ways/
 */
public class DecodeWays {
    public int numDecodings(String s) {
        if (s.length() == 0) return 0;
        if (s.charAt(0) == '0') return 0;
        if (s.length() == 1) return 1;
        int num = 1;
        for (int i = 1; i < s.length(); ++i) {
            if (Integer.valueOf(s.substring(i, i + 1)) == 0) num--;
            if (s.charAt(i - 1) != '0' && Integer.valueOf(s.substring(i - 1, i + 1)) > 0
                    && Integer.valueOf(s.substring(i - 1, i + 1)) <= 26)
                num++;
            if (num == 0) break;
        }
        return num;
    }
}
