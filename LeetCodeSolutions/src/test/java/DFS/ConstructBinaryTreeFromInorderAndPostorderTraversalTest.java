package DFS;

import common.BinaryTree;
import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    @Test
    public void testBuildTree() throws Exception {
        ConstructBinaryTreeFromInorderAndPostorderTraversal constructBinaryTreeFromInorderAndPostorderTraversal = new ConstructBinaryTreeFromInorderAndPostorderTraversal();

        BinaryTree bt = new BinaryTree(new Integer[]{1, 2, 3, 4, null, null, 5});
        bt.getRoot().treverse();
        TreeNode node = constructBinaryTreeFromInorderAndPostorderTraversal.buildTree(new int[]{4, 2, 1, 3, 5}, new int[]{4, 2, 5, 3, 1});
        node.treverse();

        node = constructBinaryTreeFromInorderAndPostorderTraversal.buildTree(new int[]{}, new int[]{});
        assertEquals(null, node);
    }
}