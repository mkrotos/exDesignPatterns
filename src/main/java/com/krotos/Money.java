package com.krotos;

import java.util.Objects;

public class Money {

    private Currency currency;
    private float value;

    public Money(Currency currency, float value) {
        this.currency = currency;
        this.value = value;
    }
    static public Money parse(String string){
        String[] splitedString=string.split(" ");
        String newCurrency=splitedString[0];
        float newValue=Float.parseFloat(splitedString[1]);

        return new Money(Currency.valueOf(newCurrency),newValue);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return Float.compare(money.value, value) == 0 &&
                currency == money.currency;
    }
    public Money convert(Currency newCurrency){
        float valueInUSD=value*currency.getUSDValue();
        float valueInNewCurrency=valueInUSD/newCurrency.getUSDValue();

        return new Money(newCurrency,valueInNewCurrency);
    }


}
