package DFS;

import common.BinaryTree;
import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBinaryTreeTest {

    @Test
    public void testIsBalanced() throws Exception {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        BinaryTree bt = new BinaryTree(new Integer[]{1, 2, 3, 4, 5, 6});
        assertEquals(true, balancedBinaryTree.isBalanced(bt.getRoot()));
    }
}