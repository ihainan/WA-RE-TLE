import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueBinarySearchTreesTest {

    @Test
    public void testNumTrees() throws Exception {
        UniqueBinarySearchTrees uniqueBinarySearchTrees = new UniqueBinarySearchTrees();
        System.out.println(uniqueBinarySearchTrees.numTrees(19));
        assertEquals(1, uniqueBinarySearchTrees.numTrees(1));
        assertEquals(2, uniqueBinarySearchTrees.numTrees(2));
        assertEquals(5, uniqueBinarySearchTrees.numTrees(3));
    }
}