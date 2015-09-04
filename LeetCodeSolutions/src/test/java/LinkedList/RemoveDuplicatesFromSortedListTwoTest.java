package LinkedList;

import common.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedListTwoTest {

    @Test
    public void testDeleteDuplicates() throws Exception {
        RemoveDuplicatesFromSortedListTwo removeDuplicatesFromSortedListTwo = new RemoveDuplicatesFromSortedListTwo();
        assertEquals("1 2 5", removeDuplicatesFromSortedListTwo.deleteDuplicates(LinkedList.createLinkedList(new int[]{1, 2, 3, 3, 4, 4, 5}).head).toString());
        assertEquals("2 3", removeDuplicatesFromSortedListTwo.deleteDuplicates(LinkedList.createLinkedList(new int[]{1, 1, 1, 2, 3}).head).toString());
        assertEquals(null, removeDuplicatesFromSortedListTwo.deleteDuplicates(LinkedList.createLinkedList(new int[]{1, 1}).head));
        assertEquals(null, removeDuplicatesFromSortedListTwo.deleteDuplicates(null));
    }
}