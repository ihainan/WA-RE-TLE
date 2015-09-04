package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/remove-linked-list-elements/
 */
public class RemoveLinkedListElements {
    /* O(n) - Runtime: 372 ms - 85% */
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode(0), dummyHead = prev;
        prev.next = head;
        while (head != null) {
            if (head.val == val) prev.next = head.next;
            else prev = head;
            head = head.next;
        }
        return dummyHead.next;
    }
}
