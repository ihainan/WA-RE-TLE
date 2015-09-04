import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class PathSumTest {

    @Test
    public void testHasPathSum() throws Exception {
        TreeNode root = new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(11);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(2);
        TreeNode node9 = new TreeNode(1);
        node4.left = node7;
        node4.right = node8;
        node6.right = node9;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;
        root.left = node2;
        root.right = node3;
        PathSum pathSum = new PathSum();
        assertEquals(true, pathSum.hasPathSum(root, 27));
        assertEquals(true, pathSum.hasPathSum(root, 22));
        assertEquals(true, pathSum.hasPathSum(root, 26));
        assertEquals(true, pathSum.hasPathSum(root, 18));
        assertEquals(false, pathSum.hasPathSum(root, 12));
        assertEquals(false, pathSum.hasPathSum(root, 10));
    }
}