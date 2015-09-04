package LinkedList;

import common.LinkedList;
import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeKSortedListsTest {

    @Test
    public void testMergeKLists() throws Exception {
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode headA = LinkedList.createLinkedList(new int[]{3, 5, 7, 8, 10}).head;
        ListNode headB = LinkedList.createLinkedList(new int[]{1, 2, 5, 7, 9}).head;
        ListNode headC = LinkedList.createLinkedList(new int[]{2, 3, 100}).head;
        assertEquals("1 2 2 3 3 5 5 7 7 8 9 10 100", mergeKSortedLists.mergeKLists(new ListNode[]{headA, headB, headC}).toString());
        assertEquals(null, mergeKSortedLists.mergeKLists(new ListNode[]{}));
    }

    @Test
    public void testMergeSort() throws Exception {
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        assertEquals("1 2 3 4 5 5", mergeKSortedLists.mergeSort(LinkedList.createLinkedList(new int[]{5, 4, 1, 2, 5, 3}).head).toString());
        assertEquals("1", mergeKSortedLists.mergeSort(LinkedList.createLinkedList(new int[]{1}).head).toString());
        assertEquals("0 1 1 2 3 9", mergeKSortedLists.mergeSort(LinkedList.createLinkedList(new int[]{3, 2, 1, 1, 0, 9}).head).toString());
    }
}