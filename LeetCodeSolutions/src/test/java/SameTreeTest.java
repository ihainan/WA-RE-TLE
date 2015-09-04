import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameTreeTest {

    @Test
    public void testIsSameTree() throws Exception {
        SameTree sameTree = new SameTree();
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(1);
        assertEquals(true, sameTree.isSameTree(root1, root2));
        assertEquals(false, sameTree.isSameTree(root1, null));
        assertEquals(false, sameTree.isSameTree(null, root2));
        assertEquals(true, sameTree.isSameTree(root1, root1));
        TreeNode node12 = new TreeNode(2);
        TreeNode node22 = new TreeNode(2);
        root1.left = node12;
        root2.left = node22;
        assertEquals(true, sameTree.isSameTree(root1, root2));
        node12.val = 3;
        assertEquals(false, sameTree.isSameTree(root1, root2));
    }
}