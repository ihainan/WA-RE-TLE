package BinarySearch;

import common.TreeNode;

/**
 * https://leetcode.com/problems/count-complete-tree-nodes/
 */
public class CountCompleteTreeNodes {
    /* Runtime: 696 ms - 35% */
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int left_height = countLeft(root.left);
        int right_height = countLeft(root.right);
        if (left_height == right_height) return (1 << left_height) + countNodes(root.right);
        return (1 << right_height) + countNodes(root.left);
    }

    /* TLE */
    public int countNodesSolutionThree(TreeNode root) {
        if (root == null) return 0;
        int left = countLeft(root.left);
        int right = countRight(root.right);
        if (left == right) return (int) Math.pow(2, left) - 1;
        else return 1 + countNodesSolutionThree(root.left) + countNodesSolutionThree(root.right);
    }

    public int countLeft(TreeNode node) {
        if (node == null) return 0;
        else return countLeft(node.left) + 1;
    }

    public int countRight(TreeNode node) {
        if (node == null) return 0;
        else return countLeft(node.right) + 1;
    }

    Boolean shouldReturn = false;

    /* TLE */
    public int countNodesSolutionTwo(TreeNode root) {
        if (root == null) return 0;
        shouldReturn = false;
        int height = 0;
        TreeNode p = root;
        while (p != null) {
            height++;
            p = p.left;
        }
        int nodesOfLastLevel = nodesOfLastLevel(root, height, 0);
        return (int) Math.pow(2, height - 1) - 1 + nodesOfLastLevel;
    }

    public int nodesOfLastLevel(TreeNode node, int height, int sum) {
        if (node == null || shouldReturn) return sum;
        if (height == 1) return sum + 1;
        sum = nodesOfLastLevel(node.left, height - 1, sum);
        if (shouldReturn) return sum;
        sum = nodesOfLastLevel(node.right, height - 1, sum);
        if (shouldReturn) return sum;
        if (height == 2) {
            if (node.right == null || node.left == null) shouldReturn = true;
        }
        return sum;
    }


    /* TLE */
    public int countNodesSolutionOne(TreeNode root) {
        if (root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
