package com.pluralsight;

public class Jewelry extends FixedAsset {


    private static final double BASE_VALUE_AT_24K = 500.0;

    private final double karat;

    public Jewelry(String name, double karat) {
        super(name, BASE_VALUE_AT_24K * (karat / 24.0));
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    @Override
    public double getValue() {
        return BASE_VALUE_AT_24K * (karat / 24.0);
    }
}


