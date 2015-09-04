package LinkedList;

import common.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwapNodesInPairsTest {

    @Test
    public void testSwapPairs() throws Exception {
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        assertEquals(null, swapNodesInPairs.swapPairs(null));
        assertEquals("1", swapNodesInPairs.swapPairs(LinkedList.createLinkedList(new int[]{1}).head).toString());
        assertEquals("2 1 4 3", swapNodesInPairs.swapPairs(LinkedList.createLinkedList(new int[]{1, 2, 3, 4}).head).toString());
        assertEquals("2 1 4 3 5", swapNodesInPairs.swapPairs(LinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5}).head).toString());
    }
}