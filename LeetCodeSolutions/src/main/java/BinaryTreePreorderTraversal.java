import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/ <br>
 * Given a binary tree, return the preorder traversal of its nodes' values.
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        List<Integer> leftList = new ArrayList<Integer>(), rightList = new ArrayList<Integer>();
        if (root.left != null) leftList = preorderTraversal(root.left);
        if (root.right != null) rightList = preorderTraversal(root.right);
        result.add(root.val);
        result.addAll(leftList);
        result.addAll(rightList);
        return result;
    }
}
