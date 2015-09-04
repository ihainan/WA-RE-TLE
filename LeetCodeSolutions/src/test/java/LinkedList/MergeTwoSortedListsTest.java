package LinkedList;

import common.LinkedList;
import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoLists() throws Exception {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode headA = LinkedList.createLinkedList(new int[]{3, 5, 7, 8, 10}).head;
        ListNode headB = LinkedList.createLinkedList(new int[]{1, 2, 5, 7, 9}).head;
        assertEquals("1 2 3 5 5 7 7 8 9 10", mergeTwoSortedLists.mergeTwoLists(headA, headB).toString());
    }
}