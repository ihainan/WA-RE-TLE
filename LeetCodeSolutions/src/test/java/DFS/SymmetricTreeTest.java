package DFS;

import common.BinaryTree;
import common.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SymmetricTreeTest {

    @Test
    public void testIsSymmetric() throws Exception {
        SymmetricTree symmetricTree = new SymmetricTree();

        BinaryTree bt = new BinaryTree(new Integer[]{1, 2, 3, 3, null, 2, null});
        assertEquals(false, symmetricTree.isSymmetric(bt.getRoot()));

        bt = new BinaryTree(new Integer[]{1, 2, 2, 3, 4, 4, 3});
        assertEquals(true, symmetricTree.isSymmetric(bt.getRoot()));

        bt = new BinaryTree(new Integer[]{1, 2, 2, 3, 4, 4, 2});
        assertEquals(false, symmetricTree.isSymmetric(bt.getRoot()));
    }
}