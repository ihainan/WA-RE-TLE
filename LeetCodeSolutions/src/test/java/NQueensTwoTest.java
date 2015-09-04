import org.junit.Test;

import static org.junit.Assert.*;

public class NQueensTwoTest {

    @Test
    public void testTotalNQueens() throws Exception {
        NQueensTwo nQueensTwo = new NQueensTwo();
        assertEquals(0, nQueensTwo.totalNQueens(0));
        assertEquals(1, nQueensTwo.totalNQueens(1));
        assertEquals(0, nQueensTwo.totalNQueens(2));
        assertEquals(0, nQueensTwo.totalNQueens(3));
        assertEquals(2, nQueensTwo.totalNQueens(4));
        assertEquals(10, nQueensTwo.totalNQueens(5));
        assertEquals(4, nQueensTwo.totalNQueens(6));
        assertEquals(40, nQueensTwo.totalNQueens(7));
        assertEquals(92, nQueensTwo.totalNQueens(8));
    }
}