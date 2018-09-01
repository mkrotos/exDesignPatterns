package com.krotos.exercises;

public enum Currency {
    PLN (0.2696f),
    EUR(1.1621f),
    USD(1f);

    private float USDValue;

    Currency(float USDValue) {
        this.USDValue = USDValue;
    }

    public float getUSDValue() {
        return USDValue;
    }
}
