package DynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void testMaxProfit() throws Exception {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        assertEquals(5, bestTimeToBuyAndSellStock.maxProfit(new int[]{5, 6, 10, 2}));
        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(new int[]{10, 9, 8, 7}));
        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(new int[]{5}));
    }
}