package DFS;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/binary-tree-right-side-view/
 */
public class BinaryTreeRightSideView {
    public static class NodeWithDepth {
        TreeNode node;
        int depth;

        public NodeWithDepth(TreeNode node, int depth) {
            this.depth = depth;
            this.node = node;
        }
    }

    /* Runtime: 324 ms - 70% */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        Queue<NodeWithDepth> queue = new LinkedList<NodeWithDepth>();
        queue.add(new NodeWithDepth(root, 0));
        while (queue.size() != 0) {
            NodeWithDepth nodeWithDepth = queue.remove();
            if (result.size() <= nodeWithDepth.depth) result.add(nodeWithDepth.node.val);
            else result.set(nodeWithDepth.depth, nodeWithDepth.node.val);
            if (nodeWithDepth.node.left != null)
                queue.add(new NodeWithDepth(nodeWithDepth.node.left, nodeWithDepth.depth + 1));
            if (nodeWithDepth.node.right != null)
                queue.add(new NodeWithDepth(nodeWithDepth.node.right, nodeWithDepth.depth + 1));
        }
        return result;
    }
}
