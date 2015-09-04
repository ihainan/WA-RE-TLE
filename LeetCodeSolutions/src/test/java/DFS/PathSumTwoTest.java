package DFS;

import common.BinaryTree;
import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class PathSumTwoTest {

    @Test
    public void testPathSum() throws Exception {
        PathSumTwo pathSumTwo = new PathSumTwo();
        BinaryTree bt = new BinaryTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null,
                null, null, 5, 1});
        System.out.println(pathSumTwo.pathSum(bt.getRoot(), 22));
    }
}