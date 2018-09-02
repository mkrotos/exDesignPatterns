package com.krotos.Strategy;

public class USATax implements TaxStrategy {
    private Float tax=0.15f;
    @Override
    public Float calculate(Float income) {
        return income*tax;
    }
}
