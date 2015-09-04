import common.TreeNode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/ <br>
 * Given a binary tree, find its maximum depth.
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left), right = maxDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }
}
