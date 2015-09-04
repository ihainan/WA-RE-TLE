package LinkedList;

import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCycleTwoTest {

    @Test
    public void testDetectCycle() throws Exception {
        LinkedListCycleTwo linkedListCycleTwo = new LinkedListCycleTwo();
        ListNode head = new ListNode(1), node2 = new ListNode(2), node3 = new ListNode(3), node4 = new ListNode(4),
                node5 = new ListNode(5), node6 = new ListNode(6), node7 = new ListNode(7);
        assertEquals(null, linkedListCycleTwo.detectCycle(null));
        assertEquals(null, linkedListCycleTwo.detectCycle(head));
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node3;
        assertEquals(node3, linkedListCycleTwo.detectCycle(head));
        node7.next = head;
        assertEquals(head, linkedListCycleTwo.detectCycle(head));
    }
}