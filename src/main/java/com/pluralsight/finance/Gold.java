package com.pluralsight.finance;

    public class Gold extends FixedAssets {

        /** Spot price per troy ounce, in dollars. */
        private static final double PRICE_PER_OUNCE = 2000.0;

        private final double weight;

        public Gold(double weight) {
            super("Gold", weight * PRICE_PER_OUNCE);
            this.weight = weight;
        }

        public double getWeight() {
            return weight;
        }

        @Override
        public double getValue() {
            return weight * PRICE_PER_OUNCE;
        }
    }

