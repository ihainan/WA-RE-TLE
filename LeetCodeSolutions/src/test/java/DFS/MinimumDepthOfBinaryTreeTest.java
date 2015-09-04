package DFS;

import common.BinaryTree;
import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumDepthOfBinaryTreeTest {

    @Test
    public void testMinDepth() throws Exception {
        MinimumDepthOfBinaryTree minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();
        BinaryTree bt = new BinaryTree(new Integer[]{1, 2, 3, 4, 5, 6});
        assertEquals(3, minimumDepthOfBinaryTree.minDepth(bt.getRoot()));
        assertEquals(0, minimumDepthOfBinaryTree.minDepth(null));

    }
}