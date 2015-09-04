package DFS;

import common.TreeNode;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
public class SumRootToLeafNumbers {
    /* O(n) - Runtime: 308 ms - 56.19% */
    public int sumNumbers(TreeNode root) {
        return calSum(root, 0);
    }

    public int calSum(TreeNode node, int sum) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 10 * sum + node.val;
        return calSum(node.left, 10 * sum + node.val) + calSum(node.right, 10 * sum + node.val);
    }

    /* Runtime: 368 ms - 6% */
    public int sumNumbersSolutionOne(TreeNode root) {
        int sum = 0;
        if (root == null) return sum;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        visit(root, nums, new ArrayList<Integer>());
        for (int num : nums) sum += num;
        return sum;
    }

    public void visit(TreeNode node, ArrayList<Integer> nums, ArrayList<Integer> path) {
        path.add(node.val);
        if (node.left == null && node.right == null) {
            String value = "";
            for (Integer num : path) value += String.valueOf(num);
            value = value.replace("^0+(?!$)", "");
            nums.add(Integer.valueOf(value));
        }
        if (node.left != null) visit(node.left, nums, path);
        if (node.right != null) visit(node.right, nums, path);
        path.remove(path.size() - 1);
    }
}
