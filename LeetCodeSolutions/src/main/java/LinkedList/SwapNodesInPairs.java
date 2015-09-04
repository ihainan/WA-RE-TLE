package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class SwapNodesInPairs {
    /* O(n) / O(1) - Runtime: 300 ms - 36% */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummyHead = new ListNode(0), p = dummyHead;
        dummyHead.next = head;
        while (p.next != null && p.next.next != null) {
            ListNode nodeOne = p.next;
            ListNode nodeTwo = p.next.next;
            nodeOne.next = nodeTwo.next;
            p.next = nodeTwo;
            nodeTwo.next = nodeOne;
            p = nodeOne;
        }
        return dummyHead.next;
    }
}
