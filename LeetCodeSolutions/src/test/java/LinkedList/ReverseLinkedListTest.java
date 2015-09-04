package LinkedList;

import common.LinkedList;
import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {

    @Test
    public void testReverseList() throws Exception {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        LinkedList linkedList = new LinkedList();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        linkedList.addListNode(head);
        linkedList.addListNode(node1);
        linkedList.addListNode(node2);
        linkedList.addListNode(node3);
        linkedList.addListNode(node4);
        assertEquals("5 4 3 2 1", reverseLinkedList.reverseList(linkedList.head).toString());
    }
}