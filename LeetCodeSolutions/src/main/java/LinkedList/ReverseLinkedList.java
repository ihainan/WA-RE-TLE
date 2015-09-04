package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/ <br>
 */

public class ReverseLinkedList {
    /* O(n) / O(1) - Runtime: 316 ms - 41% */
    public ListNode reverseListIteratively(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    /* O(n) - Runtime: 292 ms - 74% */
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        return reverse(head, null);
    }

    public ListNode reverse(ListNode head, ListNode prev) {
        ListNode next = head.next;
        head.next = prev;
        if (next == null) return head;
        return reverse(next, head);
    }
}
