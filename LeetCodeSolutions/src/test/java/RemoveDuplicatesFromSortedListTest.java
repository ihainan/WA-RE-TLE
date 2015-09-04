import common.LinkedList;
import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedListTest {

    @Test
    public void testDeleteDuplicates() throws Exception {
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
        LinkedList linkedList = new LinkedList();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(2);
        linkedList.addListNode(listNode1);
        linkedList.addListNode(listNode2);
        linkedList.addListNode(listNode3);
        linkedList.addListNode(listNode4);
        removeDuplicatesFromSortedList.deleteDuplicates(linkedList.head);
        System.out.println(linkedList);
    }
}