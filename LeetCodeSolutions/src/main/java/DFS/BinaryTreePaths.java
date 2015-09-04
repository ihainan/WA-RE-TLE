package DFS;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-paths/
 */
public class BinaryTreePaths {
    /* Runtime: 300 ms */
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return new ArrayList<String>();
        List<Integer> pathNums = new ArrayList<Integer>();
        List<String> paths = new ArrayList<String>();
        visit(root, pathNums, paths);
        return paths;
    }

    public void visit(TreeNode node, List<Integer> pathNums, List<String> paths) {
        pathNums.add(node.val);
        if (node.left == null && node.right == null) {
            String path = "";
            for (int num : pathNums) path += num + "->";
            path = path.substring(0, path.length() - 2);
            paths.add(path);
        } else {
            if (node.left != null) visit(node.left, pathNums, paths);
            if (node.right != null) visit(node.right, pathNums, paths);
        }
        pathNums.remove(pathNums.size() - 1);
    }
}
