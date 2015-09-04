package common;

/**
 * 单链表
 */
public class LinkedList {
    public ListNode head = null;

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
        int sum = 100;
        String value = "";
        ListNode p = head;
        while (p != null) {
            value += p.val + " ";
            p = p.next;
            sum--;
            if(sum == 0) break;
        }
        return value.trim();
    }

    /**
     * 根据给定数组创建链表
     *
     * @param values 指定数组
     * @return 创建得到的链表
     */
    public static LinkedList createLinkedList(int[] values) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < values.length; ++i) {
            ListNode node = new ListNode(values[i]);
            linkedList.addListNode(node);
        }
        return linkedList;
    }
}
