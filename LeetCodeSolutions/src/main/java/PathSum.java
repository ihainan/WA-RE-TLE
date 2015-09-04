import common.TreeNode;

/**
 * https://leetcode.com/problems/path-sum/ <br>
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && sum - root.val == 0) return true;
        boolean leftPath = root.left == null ? false : hasPathSum(root.left, sum - root.val);
        boolean rightPath = root.right == null ? false : hasPathSum(root.right, sum - root.val);
        return leftPath || rightPath;
    }
}
