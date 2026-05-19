package com.pluralsight.finance;

import java.util.List;

public class Portfolio {
    private final String name;
    private final String owner;
    private final List<Valuable> assets;


    public Portfolio(String name, String owner, List<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }
}
