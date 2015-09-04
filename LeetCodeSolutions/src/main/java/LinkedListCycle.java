import common.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle/ <br>
 * Given a linked list, determine if it has a cycle in it.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode p = head, q = head;
        if(q == null || q.next == null) return false;
        while(q.next != null && q.next.next != null){
            p = p.next;
            q = q.next.next;
            if(p == q){
                return true;
            }
        }
        return false;
    }
}
