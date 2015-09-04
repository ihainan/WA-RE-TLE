import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/ <br>
 * Given a binary tree, return the inorder traversal of its nodes' values.
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<Integer>();
        List<Integer> leftList = new ArrayList<Integer>(), rightList = new ArrayList<Integer>();
        if(root.left != null) leftList = inorderTraversal(root.left);
        if(root.right != null) rightList = inorderTraversal(root.right);
        leftList.add(root.val);
        leftList.addAll(rightList);
        return leftList;
    }
}
