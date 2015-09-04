package DFS;

import common.BinaryTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeRightSideViewTest {

    @Test
    public void testRightSideView() throws Exception {
        BinaryTreeRightSideView binaryTreeRightSideView = new BinaryTreeRightSideView();
        BinaryTree bt = new BinaryTree(new Integer[]{1, 2, 3, null, 5, null, 4});
        System.out.println(binaryTreeRightSideView.rightSideView(bt.getRoot()));

        bt = new BinaryTree(new Integer[]{1, 2, 3, null, 5, null, 4, null, null, 7});
        System.out.println(binaryTreeRightSideView.rightSideView(bt.getRoot()));

    }
}