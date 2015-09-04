package DFS;

import common.TreeNode;

/**
 * https://leetcode.com/problems/symmetric-tree/
 */
public class SymmetricTree {
    /* Runtime: 300 ms - 96% */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode nodeOne, TreeNode nodeTwo) {
        if (nodeOne == null && nodeTwo == null) return true;
        if (nodeOne == null ^ nodeTwo == null) return false;
        if (nodeOne.val != nodeTwo.val) return false;
        return isSymmetric(nodeOne.left, nodeTwo.right) && isSymmetric(nodeOne.right, nodeTwo.left);
    }

}
