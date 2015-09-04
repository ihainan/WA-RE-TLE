package common;

/**
 * Tree Node
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    /**
     * 遍历当前节点
     */
    public void treverse() {
        if (this == null) System.out.println("root == null");
        preOrderTraversal(this);
        System.out.println();
        inOrderTraversal(this);
        System.out.println();
        postOrderTraversal(this);
        System.out.println();
    }

    /**
     * 先序遍历
     *
     * @param node 遍历节点
     */
    public static void preOrderTraversal(TreeNode node) {
        if (node == null) return;
        System.out.print(node.val + ", ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    /**
     * 中顺遍历
     *
     * @param node 遍历节点
     */
    public static void inOrderTraversal(TreeNode node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.print(node.val + ", ");
        inOrderTraversal(node.right);
    }

    /**
     * 后顺遍历
     *
     * @param node 遍历节点
     */
    public static void postOrderTraversal(TreeNode node) {
        if (node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.val + ", ");
    }
}
