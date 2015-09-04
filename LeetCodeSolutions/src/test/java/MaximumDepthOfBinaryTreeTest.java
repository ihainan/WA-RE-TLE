import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void testMaxDepth() throws Exception {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node4.right = node5;
        node2.left = node4;
        root.left = node2;
        root.right = node3;
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        assertEquals(maximumDepthOfBinaryTree.maxDepth(null), 0);
        assertEquals(maximumDepthOfBinaryTree.maxDepth(root), 4);
        assertEquals(maximumDepthOfBinaryTree.maxDepth(node5), 1);
        assertEquals(maximumDepthOfBinaryTree.maxDepth(node4), 2);
        assertEquals(maximumDepthOfBinaryTree.maxDepth(node2), 3);
    }
}