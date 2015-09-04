package LinkedList;

import common.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeLinkedListTest {

    @Test
    public void testIsPalindrome() throws Exception {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        assertEquals(true, palindromeLinkedList.isPalindrome(LinkedList.createLinkedList(new int[]{1, 2, 3, 3, 2, 1}).head));
        assertEquals(true, palindromeLinkedList.isPalindrome(null));
        assertEquals(true, palindromeLinkedList.isPalindrome(LinkedList.createLinkedList(new int[]{1, 2, 3, 4, 3, 2, 1}).head));
        assertEquals(true, palindromeLinkedList.isPalindrome(LinkedList.createLinkedList(new int[]{1}).head));
        assertEquals(false, palindromeLinkedList.isPalindrome(LinkedList.createLinkedList(new int[]{1, 2, 2, 4, 3, 2, 1}).head));
    }
}