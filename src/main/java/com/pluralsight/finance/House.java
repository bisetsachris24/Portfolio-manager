package com.pluralsight.finance;

public class House {

private static final double PRICE_PER_SQFT = 200.0;

    private final int yearBuilt;
    private final int squareFeet;
    private final int bedrooms;

    public House(int yearBuilt, int squareFeet, int bedrooms) {
        super();
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
