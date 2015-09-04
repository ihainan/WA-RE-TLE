package DFS;

import common.TreeNode;

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree {
    /* Runtime: 360 ms - 81% */
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return visit(root) != -1;
    }

    private int visit(TreeNode node) {
        int leftDepth = node.left == null ? 0 : visit(node.left);
        int rightDepth = node.right == null ? 0 : visit(node.right);
        if (leftDepth == -1 || rightDepth == -1) return -1;
        else if (Math.abs(leftDepth - rightDepth) <= 1) return Math.max(leftDepth, rightDepth) + 1;
        else return -1;
    }
}
