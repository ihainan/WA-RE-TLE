package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {
    /* O(n + m) - 348 ms - %31.08 */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0), p = result;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                p.next = l1;
                l1 = l1.next;
                p = p.next;
            } else {
                p.next = l2;
                l2 = l2.next;
                p = p.next;
            }
        }
        if (l1 == null) p.next = l2;
        if (l2 == null) p.next = l1;
        return result.next;
    }
}
