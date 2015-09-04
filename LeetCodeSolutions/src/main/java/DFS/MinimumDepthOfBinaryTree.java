package DFS;

import common.TreeNode;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class MinimumDepthOfBinaryTree {
    /* Runtime: 336 ms - 93% */
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return visit(root, 1, Integer.MAX_VALUE);
    }

    public int visit(TreeNode node, int depth, int currentMinValue) {
        if (node == null || depth > currentMinValue) return currentMinValue;
        if (node.left == null && node.right == null) return depth;
        currentMinValue = visit(node.left, depth + 1, currentMinValue);
        currentMinValue = visit(node.right, depth + 1, currentMinValue);
        return currentMinValue;
    }
}
