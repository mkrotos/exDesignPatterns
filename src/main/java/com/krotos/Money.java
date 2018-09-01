package com.krotos;

public class Money {

    private Currency currency;
    private float value;

    public Money(Currency currency, float value) {
        this.currency = currency;
        this.value = value;
    }

    @Override
    public String toString() {
        String valueToString= String.format("%.2f",value).replace(',','.');
        return currency.name()+" "+valueToString;
    }

    public Currency getCurrency() {
        return currency;
    }

    public float getValue() {
        return value;
    }
}
