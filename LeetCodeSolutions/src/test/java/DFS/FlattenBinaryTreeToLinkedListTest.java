package DFS;

import common.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlattenBinaryTreeToLinkedListTest {

    @Test
    public void testFlatten() throws Exception {
        FlattenBinaryTreeToLinkedList flattenBinaryTreeToLinkedList = new FlattenBinaryTreeToLinkedList();

        BinaryTree bt = new BinaryTree(new Integer[]{1, 2, 5, 3, 4, null, 6});
        flattenBinaryTreeToLinkedList.flatten(bt.getRoot());
        bt.getRoot().treverse();
    }
}