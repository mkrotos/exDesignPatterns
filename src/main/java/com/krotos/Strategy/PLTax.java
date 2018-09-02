package com.krotos.Strategy;

public class PLTax implements TaxStrategy {
    private Float tax=0.19f;
    @Override
    public Float calculate(Float income) {
        return income*tax;
    }
}
