package DFS;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/path-sum-ii/
 */
public class PathSumTwo {
    /* Runtime: 400 ms - 29% */
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) return result;
        pathSum(root, sum - root.val, result, new ArrayList<Integer>());
        return result;
    }

    public void pathSum(TreeNode root, int sum, List<List<Integer>> paths, List<Integer> path) {
        path.add(root.val);
        if (root.left == null && root.right == null && sum == 0) {
            paths.add(new ArrayList<Integer>(path));
        } else {
            if (root.left != null) pathSum(root.left, sum - root.left.val, paths, path);
            if (root.right != null) pathSum(root.right, sum - root.right.val, paths, path);
        }
        path.remove(path.size() - 1);
    }
}
