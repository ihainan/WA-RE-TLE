package DFS;

import common.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateBinarySearchTreeTest {

    @Test
    public void testIsValidBST() throws Exception {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        BinaryTree bt = new BinaryTree(new Integer[]{7, 4, 9, 2, 5, 8, 10});
        assertEquals(true, validateBinarySearchTree.isValidBST(bt.getRoot()));

        bt = new BinaryTree(new Integer[]{2147483647});
        assertEquals(true, validateBinarySearchTree.isValidBST(bt.getRoot()));

        bt = new BinaryTree(new Integer[]{-2147483648,-2147483648});
        assertEquals(false, validateBinarySearchTree.isValidBST(bt.getRoot()));

        bt = new BinaryTree(new Integer[]{7, 4, 9, 6, 5, 8, 10});
        assertEquals(false, validateBinarySearchTree.isValidBST(bt.getRoot()));

        bt = new BinaryTree(new Integer[]{1, 1});
        assertEquals(false, validateBinarySearchTree.isValidBST(bt.getRoot()));

        bt = new BinaryTree(new Integer[]{3, 1, 5, 0, 2, 4, 6, null, null, null, 3});
        assertEquals(false, validateBinarySearchTree.isValidBST(bt.getRoot()));
    }
}