package LinkedList;

import common.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionListTest {

    @Test
    public void testPartition() throws Exception {
        PartitionList partitionList = new PartitionList();
        assertEquals(null, partitionList.partition(null, 10));
        assertEquals("1", partitionList.partition(LinkedList.createLinkedList(new int[]{1}).head, 10).toString());
        assertEquals("1 2 2 4 3 5", partitionList.partition(LinkedList.createLinkedList(new int[]{1, 4, 3, 2, 5, 2}).head, 3).toString());
    }
}