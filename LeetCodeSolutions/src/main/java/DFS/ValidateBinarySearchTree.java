package DFS;

import common.TreeNode;

/**
 * https://leetcode.com/problems/validate-binary-search-tree/
 */
public class ValidateBinarySearchTree {
    private static class MaxAndMinValue {
        public int min, max;

        public MaxAndMinValue(int min, int max) {
            this.max = max;
            this.min = min;
        }
    }

    /* Runtime: 352 ms - 87% */
    public boolean isValidBST(TreeNode root) {
        return visit(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean visit(TreeNode node, long min, long max) {
        if (node == null) return true;
        return node.val < max && node.val > min && visit(node.left, min, node.val) && visit(node.right, node.val, max);
    }

    /* Runtime: 372 ms - 65% */
    public boolean isValidBSTSolutionOne(TreeNode root) {
        if (root == null) return true;
        return visit(root) != null;
    }

    public MaxAndMinValue visit(TreeNode node) {
        if (node.left == null && node.right == null)
            return new MaxAndMinValue(node.val, node.val);
        MaxAndMinValue leftValue, rightValue;
        int maxValue = node.val, minValue = node.val;
        if (node.left != null) {
            leftValue = visit(node.left);
            if (leftValue == null || leftValue.max >= node.val)
                return null;
            minValue = Math.min(leftValue.min, node.val);
        }
        if (node.right != null) {
            rightValue = visit(node.right);
            if (rightValue == null || rightValue.min <= node.val)
                return null;
            maxValue = Math.max(rightValue.max, node.val);
        }
        return new MaxAndMinValue(minValue, maxValue);
    }
}
