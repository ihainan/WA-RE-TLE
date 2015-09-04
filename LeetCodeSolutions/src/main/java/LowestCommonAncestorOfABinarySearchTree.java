import common.TreeNode;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/ <br>
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 */
public class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 判断自身
        if(root == null) return null;
        if(root == p) return p;
        if(root == q) return q;

        // 判断左节点
        // 判断右节点
        return null;
    }
}
