package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {
    /* O(n) - Runtime: 440 ms - 79% */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null, p = result;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            if (sum >= 10) carry = 1;
            else carry = 0;
            ListNode newNode = new ListNode(sum % 10);
            if (result == null) {
                result = newNode;
                p = result;
            } else {
                p.next = newNode;
                p = p.next;
            }
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry != 0) {
            p.next = new ListNode(1);
        }
        return result;
    }
}
