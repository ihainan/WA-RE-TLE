package LinkedList;

import common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
public class MergeKSortedLists {
    public static class NodeComparator implements Comparator<ListNode> {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    }

    /* O(n) + mnO(logn) - Runtime: 368 ms - 79.30% */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode dummyHead = new ListNode(0), p = dummyHead;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<ListNode>(lists.length, new NodeComparator());
        for (int i = 0; i < lists.length; ++i) {
            if (lists[i] != null) priorityQueue.add(lists[i]);
        }

        while (priorityQueue.size() != 0) {
            ListNode minNode = priorityQueue.poll();
            p.next = minNode;
            p = p.next;
            if (minNode.next != null) {
                minNode = minNode.next;
                priorityQueue.add(minNode);
            }
        }
        return dummyHead.next;
    }

    /* O(mnlogn) - Time Limit Exceeded */
    public ListNode mergeKListsSolutionOne(ListNode[] lists) {
        ListNode listNode = null;
        for (int i = 0; i < lists.length; ++i) {
            listNode = merge(listNode, lists[i]);
        }
        return listNode;
    }

    public ListNode mergeSort(ListNode head) {
        if (head.next != null) {
            ListNode prev = null, slow = head, fast = head;
            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            prev.next = null;
            ListNode left = mergeSort(head);
            ListNode right = mergeSort(slow);
            return merge(left, right);
        }
        return head;
    }

    public ListNode merge(ListNode headA, ListNode headB) {
        ListNode result = new ListNode(0), p = result;
        while (headA != null && headB != null) {
            if (headA.val <= headB.val) {
                p.next = headA;
                headA = headA.next;
            } else {
                p.next = headB;
                headB = headB.next;
            }
            p = p.next;
        }
        if (headA == null) p.next = headB;
        if (headB == null) p.next = headA;
        return result.next;
    }
}
