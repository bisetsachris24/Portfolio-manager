package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A named collection of Valuable assets belonging to an owner.
 * Provides the total net value plus the most and least valuable assets.
 */
public class Portfolio {

    private final String name;
    private final String owner;
    private final List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();   // MUST be a mutable list
    }

    /** Add an asset to the portfolio. */
    public void add(Valuable asset) {
        if (asset == null) {
            return;
        }
        assets.add(asset);
    }

    /** Net value of all assets (debts contribute negative values). */
    public double getValue() {
        double total = 0.0;
        for (Valuable asset : assets) {
            total += asset.getValue();
        }
        return total;
    }

    /** Asset with the highest value. Returns null if the portfolio is empty. */
    public Valuable getMostValuable() {
        if (assets.isEmpty()) {
            return null;
        }
        Valuable best = assets.get(0);
        for (Valuable v : assets) {
            if (v.getValue() > best.getValue()) {
                best = v;
            }
        }
        return best;
    }

    /**
     * Asset with the lowest value. Often a credit card (negative value due
     * to debt). Returns null if the portfolio is empty.
     */
    public Valuable getLeastValuable() {
        if (assets.isEmpty()) {
            return null;
        }
        Valuable worst = assets.get(0);
        for (Valuable v : assets) {
            if (v.getValue() < worst.getValue()) {
                worst = v;
            }
        }
        return worst;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    /**
     * Read-only view of the assets. Callers can iterate but cannot mutate
     * the list directly — use Portfolio.add() to add assets.
     */
    public List<Valuable> getAssets() {
        return Collections.unmodifiableList(assets);
    }

    @Override
    public String toString() {
        return String.format("Portfolio[name=%s, owner=%s, assets=%d, netValue=%.2f]",
                name, owner, assets.size(), getValue());
    }
}
