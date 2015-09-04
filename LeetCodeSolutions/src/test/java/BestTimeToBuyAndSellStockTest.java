import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void testMaxProfit() throws Exception {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        assertEquals(bestTimeToBuyAndSellStock.maxProfit(new int[]{2, 4, 6, 5, 1, 3}), 6);
        assertEquals(bestTimeToBuyAndSellStock.maxProfit(new int[]{6, 5, 4, 3, 2, 1}), 0);
        assertEquals(bestTimeToBuyAndSellStock.maxProfit(new int[]{1, 2, 3, 4, 5, 0}), 4);
    }
}