package LinkedList;

import common.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateListTest {

    @Test
    public void testRotateRight() throws Exception {
        RotateList rotateList = new RotateList();
        assertEquals(null, rotateList.rotateRight(null, 0));
        assertEquals("4 5 1 2 3", rotateList.rotateRight(LinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5}).head, 2).toString());
        assertEquals("1 2 3 4 5", rotateList.rotateRight(LinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5}).head, 0).toString());
        assertEquals("1 2 3 4 5", rotateList.rotateRight(LinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5}).head, 5).toString());
        assertEquals("4 5 1 2 3", rotateList.rotateRight(LinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5}).head, 7).toString());

    }
}