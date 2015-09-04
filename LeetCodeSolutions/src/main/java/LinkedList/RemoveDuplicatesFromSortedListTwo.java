package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 */
public class RemoveDuplicatesFromSortedListTwo {
    /* O(n) - Runtime: 320 ms - %84.14 */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = new ListNode(0), dummyHead = prev;
        dummyHead.next = prev.next = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                while (head != null && head.next != null && head.val == head.next.val) head = head.next;
                head = head.next;
                prev.next = head;
            } else {
                prev = prev.next;
                head = head.next;
            }
        }
        return dummyHead.next;
    }
}
