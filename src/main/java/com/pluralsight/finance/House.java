package com.pluralsight.finance;

public class House extends FixedAssets {

private static final double PRICE_PER_SQFT = 200.0;

    private final int yearBuilt;
    private final int squareFeet;
    private final int bedrooms;

    public House(int yearBuilt, int squareFeet, int bedrooms) {
        super("House", squareFeet * PRICE_PER_SQFT);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

}
