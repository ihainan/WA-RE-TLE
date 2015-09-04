package math;

/**
 * Reverse Integer
 */
public class ReverseInteger {
    /* Runtime: 300 ms - 30% */
    public int reverse(int x) {
        boolean isNegative = x >= 0 ? false : true;
        x = x >= 0 ? x : -x;
        int result = 0;
        try {
            result = Integer.valueOf(new StringBuilder(String.valueOf(x)).reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        result = isNegative ? -result : result;
        return result;
    }
}
