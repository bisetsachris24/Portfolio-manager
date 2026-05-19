package com.pluralsight.finance;

public class FixedAssets {

    public abstract class FixedAsset implements Valuable {

        protected String name;
        protected double marketValue;

        public FixedAsset(String name, double value) {
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
}
