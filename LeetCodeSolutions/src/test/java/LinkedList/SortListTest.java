package LinkedList;

import common.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortListTest {

    @Test
    public void testSortList() throws Exception {
        SortList sortList = new SortList();
        assertEquals("1 2 3 4 5 5", sortList.sortList(LinkedList.createLinkedList(new int[]{5, 4, 1, 2, 5, 3}).head).toString());
        assertEquals("1", sortList.sortList(LinkedList.createLinkedList(new int[]{1}).head).toString());
        assertEquals("0 1 1 2 3 9", sortList.sortList(LinkedList.createLinkedList(new int[]{3, 2, 1, 1, 0, 9}).head).toString());
    }
}