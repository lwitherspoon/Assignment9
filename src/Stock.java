/**
 * Definition of Stock class
 * @author Laura Witherspoon
 * Date: 10/1/2017
 * CSC201 Assignment 9.2
 */

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    Stock() {
        this.symbol = "";
        this.name = "";
    }

    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    /**
     * Calculates percent change from previous closing price to current price
     * @return percent change
     */
    public double getPercentChange() {

        if (previousClosingPrice != 0) {
            return 100 * ((currentPrice - previousClosingPrice) / previousClosingPrice);
        } else {
            return 0;
        }

    }

    public double getCurrentPrice() {
        return this.currentPrice;
    }

    public double getPreviousClosingPrice() {
        return this.previousClosingPrice;
    }

    void setPreviousClosingPrice (double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * Outputs formatted stock information on the screen
     */
    public void displayStockInfo() {
        System.out.println("----------------------------------------------");
        System.out.print(String.format("%-28s", "Stock Name:"));
        System.out.println(name);
        System.out.print(String.format("%-28s", "Stock Symbol:"));
        System.out.println(symbol);
        System.out.print(String.format("%-28s", "Previous Closing Price:"));
        System.out.println(previousClosingPrice);
        System.out.print(String.format("%-28s", "Current Price:"));
        System.out.println(currentPrice);
        System.out.print(String.format("%-28s", "Percent Change in Price:"));
        System.out.printf("%1.2f", getPercentChange());
        System.out.println("%");
        System.out.println("----------------------------------------------");
    }
}
