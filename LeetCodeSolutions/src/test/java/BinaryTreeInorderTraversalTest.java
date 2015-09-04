import common.TreeNode;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeInorderTraversalTest {

    @Test
    public void testInorderTraversal() throws Exception {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node4.right = node5;
        node2.left = node4;
        root.left = node2;
        root.right = node3;
        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        assertEquals(Arrays.asList(2, 4, 5, 1, 3), binaryTreeInorderTraversal.inorderTraversal(root));
        node4.right = node5;
        node4.left = null;
        assertEquals(Arrays.asList(2, 5, 4, 1, 3), binaryTreeInorderTraversal.inorderTraversal(root));
        assertEquals(new ArrayList<Integer>(), binaryTreeInorderTraversal.inorderTraversal(null));
    }
}