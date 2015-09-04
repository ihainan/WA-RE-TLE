package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 */
public class IntersectionOfTwoLinkedLists {
    /* O(n) / O(1) - Runtime: 452 ms - 69% */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLen(headA), lenB = getLen(headB);
        if (lenB != 0 && lenA >= lenB) return findIntersection(headB, headA, lenB, lenA);
        if (lenA != 0 && lenA < lenB) return findIntersection(headA, headB, lenA, lenB);
        return null;
    }

    public int getLen(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }

    public ListNode findIntersection(ListNode headShort, ListNode headLong, int lenShort, int lenLong) {
        for (int i = 0; i < lenLong - lenShort; ++i) headLong = headLong.next;
        for (int i = 0; i < lenShort; ++i) {
            if (headLong == headShort) return headShort;
            headLong = headLong.next;
            headShort = headShort.next;
        }
        return null;
    }
}
