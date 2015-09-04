package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthNodeFromEndOfList {
    /* O(n) - Runtime: 292 ms - %83.77 */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = new ListNode(0), dummyHead = prev;
        dummyHead.next = head;
        ListNode nodes[] = new ListNode[n], prevs[] = new ListNode[n];
        int count = 0;
        while (head != null) {
            nodes[count] = head;
            prevs[count] = prev;
            prev = head;
            head = head.next;
            count++;
            if (count == n) count = 0;
        }
        if (dummyHead.next != null)
            prevs[count].next = nodes[count].next;
        return dummyHead.next;
    }
}
