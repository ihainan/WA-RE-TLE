import common.ListNode;

/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list/ <br>
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 */
public class DeleteNodeInALinkedList {

    /**
     * 删除一个节点
     * @param node 希望删除的节点
     */
    public void deleteNode(ListNode node) {
        if (node == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }

    private ListNode head = null;

    /**
     * 在链表尾部添加一个节点
     *
     * @param node 新节点
     */
    public void addListNode(ListNode node) {
        if (head == null) {
            head = node;
        } else {
            ListNode p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = node;
        }
    }

    @Override
    public String toString() {
        String value = "";
        ListNode p = head;
        while (p != null) {
            value += p.val + " ";
            p = p.next;
        }
        return value.trim();
    }
}
