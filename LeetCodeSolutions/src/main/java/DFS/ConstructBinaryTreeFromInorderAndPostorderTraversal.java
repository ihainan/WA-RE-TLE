package DFS;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    /* Runtime: 400 ms - 40% */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        ArrayList<Integer> postOrderList = new ArrayList<Integer>();
        for (int v : postorder) postOrderList.add(v);
        Collections.reverse(postOrderList);
        return buildTree(postOrderList, inorder, 0, postorder.length - 1);
    }

    public TreeNode buildTree(List<Integer> postorder, int[] inorder, int left, int right) {
        if (left > right) return null;

        int value = postorder.remove(0);
        TreeNode node = new TreeNode(value);
        if (left == right) return node;

        int mid;
        for (mid = left; mid <= right; ++mid) {
            if (inorder[mid] == value) break;
        }
        node.right = buildTree(postorder, inorder, mid + 1, right);
        node.left = buildTree(postorder, inorder, left, mid - 1);
        return node;
    }
}
