package LinkedList;

import common.ListNode;

/**
 * https://leetcode.com/problems/sort-list/
 */
public class SortList {
    /* O(nlogn) - Runtime: 436 ms - 42.99% */
    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        int len = getLen(head);
        return mergeSort(head, 0, len - 1);
    }

    public int getLen(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }

    public ListNode mergeSort(ListNode headA, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            ListNode tailA = headA;
            for (int i = left; i < mid; ++i) {
                tailA = tailA.next;
            }
            ListNode headB = tailA.next;
            ListNode mergedLeft = mergeSort(headA, left, mid);
            ListNode mergedRight = mergeSort(headB, mid + 1, right);
            return merge(mergedLeft, mid - left + 1, mergedRight, right - mid);
        }
        return headA;
    }

    public ListNode merge(ListNode headA, int lenA, ListNode headB, int lenB) {
        ListNode result = null, p = result;
        int countA = 0, countB = 0;
        while (countA != lenA || countB != lenB) {
            ListNode newNode;
            if (countA == lenA) {
                newNode = new ListNode(headB.val);
                headB = headB.next;
                countB++;
            } else if (countB == lenB) {
                newNode = new ListNode(headA.val);
                headA = headA.next;
                countA++;
            } else if (headA.val <= headB.val) {
                newNode = new ListNode(headA.val);
                headA = headA.next;
                countA++;
            } else {
                newNode = new ListNode(headB.val);
                headB = headB.next;
                countB++;
            }
            if (result == null) {
                result = p = newNode;
            } else {
                p.next = newNode;
                p = p.next;
            }
        }
        return result;
    }
}
