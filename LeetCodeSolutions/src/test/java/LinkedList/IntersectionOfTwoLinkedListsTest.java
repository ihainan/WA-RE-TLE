package LinkedList;

import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectionOfTwoLinkedListsTest {

    @Test
    public void testGetIntersectionNode() throws Exception {
        IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();
        ListNode a1 = new ListNode(0), a2 = new ListNode(0), b1 = new ListNode(0), b2 = new ListNode(0), b3 = new ListNode(0);
        ListNode c1 = new ListNode(0), c2 = new ListNode(1), c3 = new ListNode(0);
        a1.next = a2;
        a2.next = c1;
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;
        c1.next = c2;
        c2.next = c3;
        assertEquals(c1, intersectionOfTwoLinkedLists.getIntersectionNode(a1, b1));
    }
}