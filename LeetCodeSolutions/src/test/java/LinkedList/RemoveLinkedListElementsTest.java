package LinkedList;

import common.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveLinkedListElementsTest {

    @Test
    public void testRemoveElements() throws Exception {
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        assertEquals(null, removeLinkedListElements.removeElements(null, 2));
        assertEquals(null, removeLinkedListElements.removeElements(LinkedList.createLinkedList(new int[]{2, 2, 2, 2}).head, 2));
        assertEquals("1 2 3 4 5", removeLinkedListElements.removeElements(LinkedList.createLinkedList(new int[]{1, 2, 6, 3, 4, 5, 6}).head, 6).toString());
    }
}