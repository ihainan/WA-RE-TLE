package LinkedList;

import common.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortListTest {

    @Test
    public void testInsertionSortList() throws Exception {
        InsertionSortList insertionSortList = new InsertionSortList();
        assertEquals(null, insertionSortList.insertionSortList(null));
        assertEquals("1", insertionSortList.insertionSortList(LinkedList.createLinkedList(new int[]{1}).head).toString());
        assertEquals("2 3 4 4 5 8 9 10", insertionSortList.insertionSortList(LinkedList.createLinkedList(new int[]{5, 4, 3, 2, 10, 9, 8, 4}).head).toString());
    }
}