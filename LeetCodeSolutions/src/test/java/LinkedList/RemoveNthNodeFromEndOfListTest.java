package LinkedList;

import common.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void testRemoveNthFromEnd() throws Exception {
        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        assertEquals("1 2 3 5", removeNthNodeFromEndOfList.removeNthFromEnd(LinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5}).head, 2).toString());
        assertEquals(null, removeNthNodeFromEndOfList.removeNthFromEnd(null, 0));
        assertEquals("2 3 4 5", removeNthNodeFromEndOfList.removeNthFromEnd(LinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5}).head, 5).toString());
        assertEquals("1 2 3 4", removeNthNodeFromEndOfList.removeNthFromEnd(LinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5}).head, 1).toString());
    }
}