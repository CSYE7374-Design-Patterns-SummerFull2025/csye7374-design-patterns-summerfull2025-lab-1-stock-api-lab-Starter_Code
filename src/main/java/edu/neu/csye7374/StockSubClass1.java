package edu.neu.csye7374;

public class StockSubClass1 extends Stock implements Tradeable.Tradeable0 {
    private double[] bids = new double[6];
    private int currentIndex = 0;

    public StockSubClass1(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(double bid) {
        if (currentIndex < 6) {
            bids[currentIndex++] = bid;
            updatePrice();
        }
    }

    @Override
    public int getMetric() {
        double sum = 0;
        for (double bid : bids) {
            sum += bid;
        }
        return (int) (sum / 10);
    }

    private void updatePrice() {
        double sum = 0;
        for (double bid : bids) {
            sum += bid;
        }
        double averageBid = sum / currentIndex;
        Stock updatedStock = new Stock(getName(), averageBid, getDescription());
        setName(updatedStock.getName());
        setPrice(updatedStock.getPrice());
        setDescription(updatedStock.getDescription());
    }
}
