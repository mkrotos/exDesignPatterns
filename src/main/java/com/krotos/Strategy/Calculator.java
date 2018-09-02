package com.krotos.Strategy;

public class Calculator {

    static float calculateTax(CountryCode code, Float income){
        TaxStrategy taxStrategy=TaxManager.getStrategy(code);
        return taxStrategy.calculate(income);
    }
}
