package behaviouralDesign.observerPattern;

public interface StockObserver {
    void update(String stockSymbol, double stockPrice);
}