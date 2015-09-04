package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/palindrome-linked-list/
 */
public class PalindromeLinkedList {
    /* O(n) / O(1) - Runtime: 412 ms - 90% */
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        return checkTheSame(head, revert(slow));
    }

    public boolean checkTheSame(ListNode headA, ListNode headB) {
        while (headA != null && headB != null) {
            if (headA.val != headB.val) return false;
            headA = headA.next;
            headB = headB.next;
        }
        if (headA == null && headB != null && headB.next != null) return false;
        if (headB == null && headA != null && headA.next != null) return false;
        return true;
    }

    public ListNode revert(ListNode head) {
        if (head == null) return null;
        ListNode prev = null, next;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
