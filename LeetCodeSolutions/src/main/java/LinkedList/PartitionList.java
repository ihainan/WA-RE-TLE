package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/partition-list/
 */
public class PartitionList {
    /* O(n) - Runtime: 332 ms - 36% */
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode lessThan = new ListNode(0), p = lessThan, largeOrEqualsThan = new ListNode(0), q = largeOrEqualsThan;
        while (head != null) {
            ListNode next = head.next;
            head.next = null;
            if (head.val < x) {
                p.next = head;
                p = p.next;
            } else {
                q.next = head;
                q = q.next;
            }
            head = next;
        }
        p = lessThan;
        while (p.next != null) p = p.next;
        p.next = largeOrEqualsThan.next;
        return lessThan.next;
    }
}
