/**
 * https://leetcode.com/problems/number-of-1-bits/ <br>
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 */
public class NumberOfOneBits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum = 0;
        long i = 1, newN = n & 0x00000000ffffffffL;
        while(i <= newN){
            sum += ((newN & i) > 0 ? 1 : 0);
            i <<= 1;
        }
        return sum;
    }
}
