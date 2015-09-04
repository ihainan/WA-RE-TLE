import java.util.HashMap;

/**
 * https://leetcode.com/problems/unique-binary-search-trees/ <br>
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 */
public class UniqueBinarySearchTrees {
    HashMap<Integer, Integer> hashMap = new HashMap();
    public int numTrees(int n) {
        if(hashMap.get(n) != null) return hashMap.get(n);
        if(n == 1 || n == 0) return 1;
        int sum = 0;
        for(int i = 1; i <= n; ++i){
            sum += numTrees(i - 1) * numTrees(n - i);
        }
        hashMap.put(n, sum);
        return sum;
    }
}
