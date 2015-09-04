package DFS;

import common.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumRootToLeafNumbersTest {

    @Test
    public void testSumNumbers() throws Exception {
        SumRootToLeafNumbers sumRootToLeafNumbers = new SumRootToLeafNumbers();
        BinaryTree bt = new BinaryTree(new Integer[]{1, 2, 3});
        assertEquals(25, sumRootToLeafNumbers.sumNumbers(bt.getRoot()));

        bt = new BinaryTree(new Integer[]{1, 2, 2});
        assertEquals(24, sumRootToLeafNumbers.sumNumbers(bt.getRoot()));

        bt = new BinaryTree(new Integer[]{1});
        assertEquals(1, sumRootToLeafNumbers.sumNumbers(bt.getRoot()));

        bt = new BinaryTree(new Integer[]{4, 9, 0, null, 1});
        assertEquals(531, sumRootToLeafNumbers.sumNumbers(bt.getRoot()));

        assertEquals(0, sumRootToLeafNumbers.sumNumbers(null));
    }
}