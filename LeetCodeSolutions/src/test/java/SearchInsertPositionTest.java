import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SearchInsertPositionTest {

    @Test
    public void testSearchInsert() throws Exception {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        assertEquals(2, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0));
        assertEquals(2, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 4));
        assertEquals(0, searchInsertPosition.searchInsert(new int[]{1}, 1));
    }
}