package LinkedList;

import common.LinkedList;
import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReorderListTest {

    @Test
    public void testReorderList() throws Exception {
        ReorderList reorderList = new ReorderList();

        ListNode head = null;
        reorderList.reorderList(head);
        assertEquals(null, head);

        head = LinkedList.createLinkedList(new int[]{1}).head;
        reorderList.reorderList(head);
        assertEquals("1", head.toString());

        head = LinkedList.createLinkedList(new int[]{1, 2}).head;
        reorderList.reorderList(head);
        assertEquals("1 2", head.toString());


        head = LinkedList.createLinkedList(new int[]{1, 2, 3, 4}).head;
        ListNode newList = head;
        reorderList.reorderList(newList);
        assertEquals("1 4 2 3", head.toString());

        head = LinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5}).head;
        reorderList.reorderList(head);
        assertEquals("1 5 2 4 3", head.toString());
    }
}