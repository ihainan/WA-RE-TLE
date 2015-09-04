import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteNodeInALinkedListTest {

    @Test
    public void testDeleteNode() throws Exception {
        DeleteNodeInALinkedList deleteNodeInALinkedList = new DeleteNodeInALinkedList();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        deleteNodeInALinkedList.addListNode(node1);
        deleteNodeInALinkedList.addListNode(node2);
        deleteNodeInALinkedList.addListNode(node3);
        deleteNodeInALinkedList.addListNode(node4);
        deleteNodeInALinkedList.addListNode(node5);
        assertEquals(deleteNodeInALinkedList.toString(), "1 2 3 4 5");
        deleteNodeInALinkedList.deleteNode(node3);
        assertEquals(deleteNodeInALinkedList.toString(), "1 2 4 5");
        deleteNodeInALinkedList.deleteNode(node1);
        assertEquals(deleteNodeInALinkedList.toString(), "2 4 5");
    }
}