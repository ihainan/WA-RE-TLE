package LinkedList;

import common.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbers() throws Exception {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        assertEquals("7 0 8", addTwoNumbers.addTwoNumbers(
                LinkedList.createLinkedList(new int[]{2, 4, 3}).head,
                LinkedList.createLinkedList(new int[]{5, 6, 4}).head
        ).toString());
        assertEquals("2 4 3", addTwoNumbers.addTwoNumbers(
                LinkedList.createLinkedList(new int[]{2, 4, 3}).head,
                null
        ).toString());
        assertEquals("5 1", addTwoNumbers.addTwoNumbers(
                LinkedList.createLinkedList(new int[]{7}).head,
                LinkedList.createLinkedList(new int[]{8}).head
        ).toString());
    }
}