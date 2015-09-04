import common.LinkedList;
import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCycleTest {

    @Test
    public void testHasCycle() throws Exception {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        LinkedList linkedList = new LinkedList();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        linkedList.addListNode(listNode1);
        linkedList.addListNode(listNode2);
        linkedList.addListNode(listNode3);
        linkedList.addListNode(listNode4);
        assertEquals(linkedListCycle.hasCycle(linkedList.head), false);
        listNode3.next = linkedList.head;
        assertEquals(linkedListCycle.hasCycle(linkedList.head), true);
    }
}