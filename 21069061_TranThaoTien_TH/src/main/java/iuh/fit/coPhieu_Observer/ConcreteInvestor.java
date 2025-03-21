package iuh.fit.coPhieu_Observer;

public class ConcreteInvestor implements coPhieu_Observer.Investor {
    private String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double newPrice) {
        System.out.println("Investor " + name + " notified. " + stockSymbol + " is now " + newPrice);
    }
}