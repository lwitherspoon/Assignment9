/**
 * Program to test drive the Stock class
 * @author Laura Witherspoon
 * Date: 10/1/2017
 * CSC201 Assignment 9.2
 */

public class StockDriver {

    public static void main(String[] args) {
        Stock oracle = new Stock("ORCL", "Oracle Corporation");

        oracle.setPreviousClosingPrice(34.5);
        oracle.setCurrentPrice(34.35);

        oracle.displayStockInfo();
    }
}
