package DFS;

import common.BinaryTree;
import common.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreePathsTest {

    @Test
    public void testBinaryTreePaths() throws Exception {
        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
        BinaryTree bt = new BinaryTree(new Integer[]{1, 2, 3, 4, 5, 6});
        System.out.println(Arrays.toString(binaryTreePaths.binaryTreePaths(bt.getRoot()).toArray()));
    }
}