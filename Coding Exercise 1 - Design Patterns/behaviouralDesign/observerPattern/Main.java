package behaviouralDesign.observerPattern;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarketImpl();

        StockObserver investor1 = new Investor("Haris");
        StockObserver investor2 = new Investor("Siva");

        stockMarket.registerObserver(investor1);
        stockMarket.registerObserver(investor2);

        stockMarket.setStockPrice("INFY", 1850.0); // Both investors receive updates
        System.out.println();
        stockMarket.setStockPrice("TCS", 2400.0); // Both investors receive updates
        System.out.println();

        stockMarket.removeObserver(investor1);

        System.out.println("Only investor2 receives the update after removing Haris...");
        stockMarket.setStockPrice("WIPRO", 500.0); 
    }
}