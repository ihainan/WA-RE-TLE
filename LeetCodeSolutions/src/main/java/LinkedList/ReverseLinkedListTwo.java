package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii/ <br>
 */
public class ReverseLinkedListTwo {
    /* In Place - One Pass - Runtime: 260 ms - 93% */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode p = head, lastTail = null, newTail = null, prev = null, newHead = head, next;
        int counter = 1;
        while (p != null) {
            next = p.next;
            if (counter >= m && counter <= n) {
                if (counter == m) {
                    lastTail = prev;
                    newTail = p;
                }
                p.next = prev;
                if (counter == n) {
                    newTail.next = next;
                    if (lastTail != null) lastTail.next = p;
                    else newHead = p;
                }
            }
            counter++;
            prev = p;
            p = next;
        }
        return newHead;
    }
}
