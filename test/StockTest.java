import org.junit.Test;

import static org.junit.Assert.*;

public class StockTest {
    private static final double PRECISION = 0.01;

    Stock oracle = new Stock("ORCL", "Oracle Corporation");

    @Test
    public void getCurrentPrice() throws Exception {
        // Default current price should be zero
        assertEquals("default stock object should have current price of zero", 0, oracle.getCurrentPrice(), PRECISION);

        // Set specific current price
        oracle.setCurrentPrice(15.35);
        assertEquals("stock object's current price is not correct", 15.35, oracle.getCurrentPrice(), PRECISION);
    }

    @Test
    public void getPreviousClosingPrice() throws Exception {
        // Default current price should be zero
        assertEquals("default stock object should have previous price of zero", 0, oracle.getPreviousClosingPrice(), PRECISION);

        // Set specific previous price
        oracle.setPreviousClosingPrice(15.01);
        assertEquals("stock object's previous price is not correct", 15.01, oracle.getPreviousClosingPrice(), PRECISION);
    }

    @Test
    public void getPercentChange() throws Exception {
        oracle.setPreviousClosingPrice(15.01);
        oracle.setCurrentPrice(15.35);
        assertEquals("incorrect percent change", 2.26, oracle.getPercentChange(), PRECISION);

    }
}