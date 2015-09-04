package DFS;

import common.BinaryTree;
import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    @Test
    public void testBuildTree() throws Exception {
        ConstructBinaryTreeFromPreorderAndInorderTraversal constructBinaryTreeFromPreorderAndInorderTraversal = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

        BinaryTree bt = new BinaryTree(new Integer[]{1, 2, 3, 4, null, null, 5});
        bt.getRoot().treverse();
        TreeNode node = constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(new int[]{1, 2, 4, 3, 5}, new int[]{4, 2, 1, 3, 5});
        node.treverse();

        node = constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(new int[]{}, new int[]{});
        assertEquals(null, node);
    }
}