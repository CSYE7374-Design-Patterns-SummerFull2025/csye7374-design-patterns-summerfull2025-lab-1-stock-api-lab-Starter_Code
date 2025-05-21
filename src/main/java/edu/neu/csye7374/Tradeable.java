package edu.neu.csye7374;

public interface Tradeable {
    void setBid(double bid);

    int getMetric();

    interface Tradeable0 {
        default void setBid(double bid) {
            // Default implementation for setBid in Tradeable0
        }

        default int getMetric() {
            // Default implementation for getMetric in Tradeable0
            return 0;
        }
    }

    interface Tradeable1 {

        default int getMetric() {
            // Default implementation for getMetric in Tradeable1
            return 0;
        }
    }
}
