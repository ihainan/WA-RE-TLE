package DFS;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    /* Runtime: 460 ms - 9% */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        ArrayList<Integer> preOrderList = new ArrayList<Integer>();
        for (int v : preorder) preOrderList.add(v);
        return buildTree(preOrderList, inorder, 0, preorder.length - 1);
    }

    public TreeNode buildTree(List<Integer> preorder, int[] inorder, int left, int right) {
        if (left > right) return null;

        int value = preorder.remove(0);
        TreeNode node = new TreeNode(value);
        if (left == right) return node;

        int mid;
        for (mid = left; mid <= right; ++mid) {
            if (inorder[mid] == value) break;
        }
        node.left = buildTree(preorder, inorder, left, mid - 1);
        node.right = buildTree(preorder, inorder, mid + 1, right);
        return node;
    }
}
