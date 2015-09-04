package common;

/**
 * 链表节点
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        int sum = 100;
        String value = "";
        ListNode p = this;
        while (true) {
            value = value + " " + p.val;
            if ((p = p.next) == null) break;
            sum--;
            if(sum == 0) break;
        }
        return value.trim();
    }
}
