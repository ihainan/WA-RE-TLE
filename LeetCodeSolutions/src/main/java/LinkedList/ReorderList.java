package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/reorder-list/
 */
public class ReorderList {
    public ListNode revert(ListNode head) {
        ListNode prev = null, next;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    /* O(n) - Runtime: 424 ms - 64% */
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return;
        ListNode dummyHead = new ListNode(0), slowOne = dummyHead, fastOne = dummyHead;
        dummyHead.next = head;
        while (fastOne != null && fastOne.next != null) {
            slowOne = slowOne.next;
            fastOne = fastOne.next.next;
        }
        ListNode headB = slowOne.next;
        slowOne.next = null;
        headB = revert(headB);
        ListNode q = head;
        while (headB != null) {
            ListNode nextA = q.next, nextB = headB.next;
            q.next = headB;
            headB.next = nextA;
            q = nextA;
            headB = nextB;
        }
    }
}
