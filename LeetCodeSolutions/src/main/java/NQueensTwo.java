/**
 * https://leetcode.com/problems/n-queens-ii/ <br>
 * Follow up for N-Queens problem. <br>
 * Now, instead outputting board configurations, return the total number of distinct solutions.
 */
public class NQueensTwo {
    // Runtime: 240 ms
    public int totalNQueens(int n) {
        if (n <= 0) return 0;
        int places[] = new int[n];
        return visit(0, places, n, 0);
    }


    public int visit(int depth, int places[], int n, int sum) {
        if (depth == n) return sum + 1;
        for (int i = 0; i < n; ++i) {
            boolean isPlace = true;
            for (int j = 0; j < depth; ++j) {
                if (i == places[j] || Math.abs(j - depth) == Math.abs(i - places[j])) {
                    isPlace = false;
                }
            }
            if(isPlace){
                places[depth] = i;
                sum = visit(depth + 1, places, n, sum);
            }
        }
        return sum;
    }
}
