package LinkedList;

import common.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTwoTest {

    @Test
    public void testReverseBetween() throws Exception {
        ReverseLinkedListTwo reverseLinkedListTwo = new ReverseLinkedListTwo();
        assertEquals("1 4 3 2 5", reverseLinkedListTwo.reverseBetween(LinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5}).head, 2, 4).toString());
        assertEquals("5 4 3 2 1", reverseLinkedListTwo.reverseBetween(LinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5}).head, 1, 5).toString());
        assertEquals(null, reverseLinkedListTwo.reverseBetween(LinkedList.createLinkedList(new int[]{}).head, 0, 0));
        assertEquals("1", reverseLinkedListTwo.reverseBetween(LinkedList.createLinkedList(new int[]{1}).head, 1, 1).toString());
        assertEquals("1", reverseLinkedListTwo.reverseBetween(LinkedList.createLinkedList(new int[]{1}).head, 1, 1).toString());
        assertEquals("4 3 2 1 5", reverseLinkedListTwo.reverseBetween(LinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5}).head, 1, 4).toString());
        assertEquals("1 5 4 3 2", reverseLinkedListTwo.reverseBetween(LinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5}).head, 2, 5).toString());
    }
}