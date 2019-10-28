package com.scoliztur.creative.logic;

public enum Measurement {

    GRAM("Gram"),
    LITERS("Liters");

    private String name;

    Measurement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
