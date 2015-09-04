package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/insertion-sort-list/
 */
public class InsertionSortList {
    /* O(n ^ 2) - Runtime: 436 ms - 36% */
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummyHead = new ListNode(0), p, next, resultHead = new ListNode(0);
        dummyHead.next = head;
        p = dummyHead.next;
        while (p != null) {
            next = p.next;
            ListNode q = resultHead;
            while (q.next != null && q.next.val <= p.val) q = q.next;
            p.next = q.next;
            q.next = p;
            p = next;
        }
        return resultHead.next;
    }
}
