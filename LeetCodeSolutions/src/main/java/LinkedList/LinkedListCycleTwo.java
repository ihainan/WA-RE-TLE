package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii/
 */
public class LinkedListCycleTwo {
    /* O(n) - Runtime: 304 ms - 52% */
    public ListNode detectCycle(ListNode head) {
        if (head == null) return head;
        ListNode dummyHead = new ListNode(0), p = dummyHead, slowOne = dummyHead, fastOne = dummyHead;
        dummyHead.next = head;
        // Check the cicle
        while (fastOne != null && fastOne.next != null) {
            slowOne = slowOne.next;
            fastOne = fastOne.next.next;
            if (slowOne == fastOne) break;
        }
        if (fastOne == null || fastOne.next == null) return null;

        // Find the interaction point
        int lenAll = 0, lenPart = 0;
        while (p.next != slowOne) {
            lenAll++;
            p = p.next;
        }
        ListNode q = slowOne.next;
        while (q != slowOne) {
            lenPart++;
            q = q.next;
        }
        p = dummyHead.next;
        q = slowOne.next;
        if (lenAll > lenPart) for (int i = 0; i < lenAll - lenPart; ++i) p = p.next;
        else for (int i = 0; i < lenPart - lenAll; ++i) q = q.next;
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
