import common.TreeNode;

/**
 * https://leetcode.com/problems/same-tree/ <br>
 * Given two binary trees, write a function to check if they are equal or not.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null ^ q == null) return false;
        if(p == q) return true;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
