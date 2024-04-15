package models;

public class ExchangeRateOneToOne {
    private String targetCurency;
    private double value;

    public ExchangeRateOneToOne(String targetCurency, double value) {
        this.targetCurency = targetCurency;
        this.value = value;
    }

    public String getTargetCurency() {
        return targetCurency;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ExchangeRateOneRecord{" +
                "targetCurency='" + targetCurency + '\'' +
                ", value=" + value +
                '}';
    }
}