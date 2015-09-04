import common.ListNode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/ <br>
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                p.next = p.next.next;
                continue;
            }
            p = p.next;
        }
        return head;
    }
}
