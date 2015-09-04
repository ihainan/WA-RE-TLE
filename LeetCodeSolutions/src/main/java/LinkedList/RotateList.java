package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/rotate-list/
 */
public class RotateList {
    /* O(n) - Runtime: 328 ms - 73% */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        int len = 0;
        ListNode p = head, pre = null;
        while (p != null) {
            pre = p;
            p = p.next;
            len++;
        }
        if (pre != null) pre.next = head;
        k = (k % len) + 1;
        p = head;
        for (int i = 0; i < len - k; ++i) p = p.next;
        if (p != null) {
            head = p.next;
            p.next = null;
        }
        return head;
    }
}
