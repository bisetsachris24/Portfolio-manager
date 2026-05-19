package com.pluralsight.finance;

public abstract class FixedAssets implements Valuable {

    protected String name;
    protected double marketValue;

    public FixedAssets(String name, double value) {
        this.name = name;
        this.marketValue = value;
    }

    public String getName() {
        return name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    @Override
    public double getValue() {
        return marketValue;
    }

    @Override
    public String toString() {
        return String.format("%s[name=%s, value=%.2f]",
                getClass().getSimpleName(), name, getValue());
    }
}