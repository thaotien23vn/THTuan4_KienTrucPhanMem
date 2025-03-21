package coPhieu_Observer;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("AAPL", 150.00);
        Investor investor1 = new ConcreteInvestor("John");
        Investor investor2 = new ConcreteInvestor("Jane");

        stock.addObserver(investor1);
        stock.addObserver(investor2);

        stock.setPrice(155.00);
        stock.setPrice(160.00);
    }
}
